package io.github.josehsantos.hack.ide.refactory;

import com.intellij.psi.PsiElement;
import com.intellij.refactoring.rename.RenamePsiElementProcessor;

/**
 * Created by josesantos on 16/11/14.
 */
public class HackRenamePsiElementProcessor extends RenamePsiElementProcessor {
    @Override
    public boolean canProcessElement(PsiElement psiElement) {
        return true;
    }
}
