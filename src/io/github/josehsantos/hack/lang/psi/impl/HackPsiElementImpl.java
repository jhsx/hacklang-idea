package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.psi.HackPsiElement;

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
        //TODO: Implement here
        return super.processDeclarations(processor, state, lastParent, place);
    }
}
