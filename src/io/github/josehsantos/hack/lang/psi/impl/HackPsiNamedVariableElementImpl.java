package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.LocalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.PlatformIcons;
import io.github.josehsantos.hack.lang.psi.HackPsiNamedVariableElement;
import io.github.josehsantos.hack.lang.psi.HackVariableIdentifier;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static com.intellij.psi.util.PsiTreeUtil.*;

/**
 * Created by josesantos on 13/11/14.
 */
public abstract class HackPsiNamedVariableElementImpl extends HackPsiElementImpl implements HackPsiNamedVariableElement {


    public HackPsiNamedVariableElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        //getIdentifier().setName(s);
        return this;
    }

    @Override
    public String getName() {
        return getIdentifier().getText();
    }

    @Nullable
    public ItemPresentation getPresentation() {
        final PsiElement parent = getParent();
        if (parent instanceof NavigationItem) {
            return ((NavigationItem) parent).getPresentation();
        }
        final HackPsiNamedVariableElementImpl hackPsiNamedVariableElement = this;
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return hackPsiNamedVariableElement.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return null;
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return PlatformIcons.VARIABLE_ICON;
            }
        };
    }

    @Override
    public Icon getIcon(int flags) {
        final ItemPresentation presentation = getPresentation();
        return presentation == null ? super.getIcon(flags) : presentation.getIcon(true);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return getIdentifier();
    }

    @NotNull
    @Override
    public HackVariableIdentifier getIdentifier() {
        return findChildOfType(this, HackVariableIdentifier.class);
    }

    @NotNull
    @Override
    public SearchScope getUseScope() {
        //TODO: implements a searchScopeManager class
        return new LocalSearchScope(getContainingFile());
    }
}
