package io.github.josehsantos.hack.utils;

import com.intellij.psi.PsiElement;
import io.github.josehsantos.hack.lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.Vector;

/**
 * Created by josesantos on 15/11/14.
 */
public class HackVariableCollectorVisitor extends HackVisitor {

    private final Vector<HackVariableNameHolder> nameHolderSet = new Vector<HackVariableNameHolder>();

    public HackVariableCollectorVisitor(PsiElement context) {
        visitElement(context);
    }

    @Override
    public void visitVariableNameHolder(@NotNull HackVariableNameHolder o) {
        nameHolderSet.insertElementAt(o, 0);
    }

    @Override
    public void visitElement(PsiElement element) {
        if (
                        element instanceof HackParameterList ||
                        element instanceof HackParameterItem ||
                        element instanceof HackIfStatement ||
                        element instanceof HackInnerStatementList ||
                        element instanceof HackBaseStatement ||
                        element instanceof HackListAssignmentVariables ||
                        element instanceof HackFunction
            ) {
            element.acceptChildren(this);
        } else if (element instanceof HackClosureExpression || element instanceof HackLambdaExpression) {

        } else if (element instanceof HackExpression) {
            element.acceptChildren(this);
        }


    }

    public HackVariableNameHolder[] getDefinitions() {
        HackVariableNameHolder[] HackVariableNameHolders = new HackVariableNameHolder[nameHolderSet.size()];
        nameHolderSet.toArray(HackVariableNameHolders);
        return HackVariableNameHolders;
    }
}
