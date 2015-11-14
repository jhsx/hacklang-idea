package io.github.josehsantos.hack.ide.findUsages;

import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import io.github.josehsantos.hack.lang.psi.HackVariableNameHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 16/11/14.
 */
public class HackFindUsagesProvider implements FindUsagesProvider {

    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return null;
    }

    @Override
    public boolean canFindUsagesFor(PsiElement psiElement) {
        return psiElement instanceof HackVariableNameHolder;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(PsiElement psiElement) {
        return "reference";
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement psiElement) {
        if (psiElement instanceof HackVariableNameHolder)
            return psiElement.getText();
        return "";
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement psiElement, boolean b) {
        if (psiElement instanceof HackVariableNameHolder) {
            return psiElement.getText();
        }
        return "";
    }
}
