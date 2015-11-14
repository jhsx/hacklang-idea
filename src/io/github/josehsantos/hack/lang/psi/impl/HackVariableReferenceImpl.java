package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.search.LocalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;
import io.github.josehsantos.hack.lang.psi.HackVariableIdentifier;
import io.github.josehsantos.hack.lang.psi.HackVariableReference;
import io.github.josehsantos.hack.lang.resolve.HackVariableNameScopeProcessor;
import io.github.josehsantos.hack.utils.HackElementGenerator;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 14/11/14.
 */
public class HackVariableReferenceImpl extends HackPsiElementImpl implements HackVariableReference {

    private HackVariableNameHolder resolved = null;

    public HackVariableReferenceImpl(ASTNode node) {
        super(node);
    }


    @Override
    public PsiElement getElement() {
        return this;
    }

    @Override
    public TextRange getRangeInElement() {
        return new TextRange(0, getTextLength());
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        if (resolved == null) {
            HackVariableNameScopeProcessor processor = new HackVariableNameScopeProcessor(this);
            PsiTreeUtil.treeWalkUp(processor, this, this.getContainingFile(), new ResolveState());
            resolved = processor.getResult();
        }
        return resolved;
    }

    @Override
    public PsiReference getReference() {
//        if (getParent() instanceof HackVariableNameHolder) {
//            if(resolve() == getParent())
//                return null;
//        }

        return this;
    }

    @NotNull
    @Override
    public String getCanonicalText() {
        return this.getText();
    }

    @Override
    public PsiElement handleElementRename(String s) throws IncorrectOperationException {
        return setName(s);
    }

    @Override
    public PsiElement bindToElement(@NotNull PsiElement psiElement) throws IncorrectOperationException {
        return this;
    }

    @Override
    public boolean isReferenceTo(PsiElement psiElement) {
        //   if(psiElement.getParent())
        if (psiElement instanceof HackVariableNameHolder) {
            return psiElement.equals(resolve());
        }
        return false;
    }

    @Override
    public String getName() {
        return getText();
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {

        HackVariableIdentifier newIdentifier = HackElementGenerator.createIdentifierVariableFromText(getProject(), s);
        if (newIdentifier != null) {
            getNode().replaceChild(getNode().getFirstChildNode(), newIdentifier.getNode().getFirstChildNode());
        }
        return this;
    }


    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public boolean isSoft() {
        return false;
    }

}
