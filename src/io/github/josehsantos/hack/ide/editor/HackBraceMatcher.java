package io.github.josehsantos.hack.ide.editor;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.HackTypes;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackBraceMatcher implements PairedBraceMatcher {
    private static BracePair[] ourBracePairs =
            {
                    new BracePair(HackTypes.T_LBRACE, HackTypes.T_RBRACE, true),
                    new BracePair(HackTypes.T_LBRACKET, HackTypes.T_RBRACKET, false),
                    new BracePair(HackTypes.T_LPAREN, HackTypes.T_RPAREN, false)
            };

    @Override
    public BracePair[] getPairs() {
        return ourBracePairs;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(IElementType iElementType, IElementType iElementType1) {

        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
