package io.github.josehsantos.hack.lang.resolve;

import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import io.github.josehsantos.hack.lang.psi.HackFunction;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;
import io.github.josehsantos.hack.lang.psi.impl.HackVariableReferenceImpl;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 14/11/14.
 */
public class HackVariableNameScopeProcessor implements PsiScopeProcessor {

    private final HackVariableReferenceImpl hackVariableReference;
    protected String myVariableName;
    protected HackVariableNameHolder result;

    public HackVariableNameScopeProcessor(HackVariableReferenceImpl hackVariableReference) {
        this.hackVariableReference = hackVariableReference;
        this.myVariableName = hackVariableReference.getText();

    }

    public HackVariableNameHolder getResult() {
        return result;
    }

    @Override
    public boolean execute(PsiElement psiElement, ResolveState resolveState) {
        if (!psiElement.equals(hackVariableReference)
                && psiElement instanceof HackVariableNameHolder
                && psiElement.getText().equals(myVariableName)) {
            result = (HackVariableNameHolder) psiElement;
            if (result.getParent() instanceof HackFunction)
                return false;
        }
        return true;
    }

    @Nullable
    @Override
    public <T> T getHint(Key<T> key) {
        return null;
    }

    @Override
    public void handleEvent(Event event, @Nullable Object o) {

    }
}
