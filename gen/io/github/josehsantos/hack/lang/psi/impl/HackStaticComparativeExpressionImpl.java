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

public class HackStaticComparativeExpressionImpl extends HackExpressionImpl implements HackStaticComparativeExpression {

  public HackStaticComparativeExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticComparativeExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackComparativeOperator getComparativeOperator() {
    return findNotNullChildByClass(HackComparativeOperator.class);
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
  @Nullable
  public HackStaticComparativeExpression getStaticComparativeExpression() {
    return findChildByClass(HackStaticComparativeExpression.class);
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
