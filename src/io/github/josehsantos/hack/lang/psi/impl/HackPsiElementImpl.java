package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;
import io.github.josehsantos.hack.lang.psi.HackPsiElement;
import io.github.josehsantos.hack.lang.resolve.HackVariableNameScopeProcessor;
import io.github.josehsantos.hack.utils.PsiCollectorUtil;

/**
 * Created by josesantos on 13/11/14.
 */

public class HackPsiElementImpl extends ASTWrapperPsiElement implements HackPsiElement {
    public HackPsiElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public IElementType getTokenType() {
        return getNode().getElementType();
    }

    @Override
    public boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place) {
        return processDeclarationsImpl(processor, state, lastParent) && super.processDeclarations(processor, state, lastParent, place);
    }

    private boolean processDeclarationsImpl(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent) {


        if (processor instanceof HackVariableNameScopeProcessor) {

            HackVariableNameHolder[] HackVariableNameHolders;
            if (!processor.execute(this, state)) return false;


            HackVariableNameHolders = PsiCollectorUtil.collectVariablesDefinition(this);

            for (HackVariableNameHolder HackVariableNameHolder : HackVariableNameHolders) {
                if (!processor.execute(HackVariableNameHolder, state)) return false;
            }
        }

//        if (lastParent.equals(this))
//            return false;

        return true;
    }
}
