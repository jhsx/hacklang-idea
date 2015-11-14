package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import io.github.josehsantos.hack.lang.psi.HackFunction;
import io.github.josehsantos.hack.lang.psi.HackPsiElement;

/**
 * Created by josesantos on 16/11/14.
 */
public abstract class HackFunctionImpl extends HackPsiElementImpl implements HackFunction {
    public HackFunctionImpl(ASTNode node) {
        super(node);
    }
}
