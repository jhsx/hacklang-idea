// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import io.github.josehsantos.hack.lang.psi.*;

public class HackStaticAdditiveOrConcatenationExpressionImpl extends HackExpressionImpl implements HackStaticAdditiveOrConcatenationExpression {

  public HackStaticAdditiveOrConcatenationExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticAdditiveOrConcatenationExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackAdditiveOrConcatenationOperator getAdditiveOrConcatenationOperator() {
    return findNotNullChildByClass(HackAdditiveOrConcatenationOperator.class);
  }

  @Override
  @NotNull
  public List<HackExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpression.class);
  }

}
