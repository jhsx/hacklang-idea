package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.josehsantos.hack.lang.psi.HackIdentifier;
import io.github.josehsantos.hack.lang.psi.HackPsiNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by josesantos on 13/11/14.
 */
public abstract class HackPsiNamedElementImpl extends HackPsiElementImpl implements HackPsiNamedElement {
    public HackPsiNamedElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        return getIdentifier().getText();
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
    public HackIdentifier getIdentifier() {
        return PsiTreeUtil.findChildOfType(this, HackIdentifier.class);
    }
}
