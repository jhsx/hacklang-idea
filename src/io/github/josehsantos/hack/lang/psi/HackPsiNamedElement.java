package io.github.josehsantos.hack.lang.psi;

import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 13/11/14.
 */
public interface HackPsiNamedElement extends HackPsiElement, PsiNamedElement, NavigationItem, PsiNameIdentifierOwner {
    @NotNull
    HackIdentifier getIdentifier();
}

