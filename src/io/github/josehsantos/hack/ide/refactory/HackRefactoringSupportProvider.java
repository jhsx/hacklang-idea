package io.github.josehsantos.hack.ide.refactory;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;
import io.github.josehsantos.hack.lang.psi.HackSimpleVariableName;
import io.github.josehsantos.hack.lang.psi.HackVariableIdentifier;

/**
 * Created by josesantos on 16/11/14.
 */
public class HackRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        return context instanceof HackVariableIdentifier;
    }

}
