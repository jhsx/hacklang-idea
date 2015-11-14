package io.github.josehsantos.hack.lang.psi.impl;

import com.intellij.lang.ASTNode;
import io.github.josehsantos.hack.lang.psi.HackExpression;

/**
 * Created by josesantos on 19/11/14.
 */
public class HackExpressionImpl extends HackPsiElementImpl implements HackExpression {
    public HackExpressionImpl(ASTNode node) {
        super(node);
    }
}
