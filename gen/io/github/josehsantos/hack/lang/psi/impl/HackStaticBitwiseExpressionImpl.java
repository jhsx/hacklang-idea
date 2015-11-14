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

public class HackStaticBitwiseExpressionImpl extends HackExpressionImpl implements HackStaticBitwiseExpression {

  public HackStaticBitwiseExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticBitwiseExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackBitwiseOperator getBitwiseOperator() {
    return findNotNullChildByClass(HackBitwiseOperator.class);
  }

  @Override
  @NotNull
  public List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAdditiveOrConcatenationExpression.class);
  }

  @Override
  @Nullable
  public HackStaticBitwiseExpression getStaticBitwiseExpression() {
    return findChildByClass(HackStaticBitwiseExpression.class);
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
