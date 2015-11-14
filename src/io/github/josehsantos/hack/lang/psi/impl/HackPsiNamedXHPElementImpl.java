package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import io.github.josehsantos.hack.lang.psi.HackIdentifier;
import io.github.josehsantos.hack.lang.psi.HackPsiNamedElement;
import io.github.josehsantos.hack.lang.psi.HackPsiNamedXHPElement;
import io.github.josehsantos.hack.lang.psi.HackXhpIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by josesantos on 13/11/14.
 */
public abstract class HackPsiNamedXHPElementImpl extends HackPsiElementImpl implements HackPsiNamedXHPElement {
    public HackPsiNamedXHPElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        return getIdentifier().getText();
    }

    @Override
    public PsiElement setName(@NotNull String s) throws IncorrectOperationException {
        //TODO: implements
        return null;
    }


    @Nullable
    public ItemPresentation getPresentation() {
        final PsiElement parent = getParent();
        if (parent instanceof NavigationItem) {
            return ((NavigationItem)parent).getPresentation();
        }
        return null;
    }

    @Override
    public Icon getIcon(int flags) {
        final ItemPresentation presentation = getPresentation();
        return presentation == null ? super.getIcon(flags) : presentation.getIcon(true);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @NotNull
    @Override
    public HackXhpIdentifier getIdentifier() {
        return PsiTreeUtil.findChildOfType(this, HackXhpIdentifier.class);
    }
}
