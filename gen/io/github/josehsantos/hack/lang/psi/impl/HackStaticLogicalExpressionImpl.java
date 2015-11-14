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

public class HackStaticLogicalExpressionImpl extends HackExpressionImpl implements HackStaticLogicalExpression {

  public HackStaticLogicalExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticLogicalExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackLogicalOperator getLogicalOperator() {
    return findNotNullChildByClass(HackLogicalOperator.class);
  }

  @Override
  @NotNull
  public List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAdditiveOrConcatenationExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticBitwiseExpression> getStaticBitwiseExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticBitwiseExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticComparativeExpression> getStaticComparativeExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticComparativeExpression.class);
  }

  @Override
  @Nullable
  public HackStaticLogicalExpression getStaticLogicalExpression() {
    return findChildByClass(HackStaticLogicalExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticMultiplicativeExpression> getStaticMultiplicativeExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticMultiplicativeExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticPrefixExpression> getStaticPrefixExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticPrefixExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticShiftExpression> getStaticShiftExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticShiftExpression.class);
  }

}
