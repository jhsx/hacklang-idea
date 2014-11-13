package io.github.josehsantos.hack.lang.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.tree.IElementType;

/**
 * Created by josesantos on 13/11/14.
 */
public interface HackPsiElement extends NavigatablePsiElement {
    IElementType getTokenType();
}
