package io.github.josehsantos.hack.utils;

import com.intellij.psi.PsiElement;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;

/**
 * Created by josesantos on 15/11/14.
 */
public class PsiCollectorUtil {

    public static HackVariableNameHolder[] collectVariablesDefinition(PsiElement context) {
        return new HackVariableCollectorVisitor(context).getDefinitions();
    }
}
