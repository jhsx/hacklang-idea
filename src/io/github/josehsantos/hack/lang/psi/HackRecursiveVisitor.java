package io.github.josehsantos.hack.lang.psi;

import com.intellij.psi.PsiElement;

/**
 * Created by josesantos on 15/11/14.
 */
public abstract class HackRecursiveVisitor extends HackVisitor {
    @Override
    public void visitElement(PsiElement element) {
        element.acceptChildren(this);
    }
}
