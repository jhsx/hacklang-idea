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

public class HackCallableFunctionCallExpressionImpl extends HackExpressionImpl implements HackCallableFunctionCallExpression {

  public HackCallableFunctionCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitCallableFunctionCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAdditiveConcatenationOperator getAdditiveConcatenationOperator() {
    return findChildByClass(HackAdditiveConcatenationOperator.class);
  }

  @Override
  @Nullable
  public HackArrayAccessExpression getArrayAccessExpression() {
    return findChildByClass(HackArrayAccessExpression.class);
  }

  @Override
  @Nullable
  public HackBitwiseOperator getBitwiseOperator() {
    return findChildByClass(HackBitwiseOperator.class);
  }

  @Override
  @NotNull
  public List<HackCallParameter> getCallParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallParameter.class);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpression getCallableFunctionCallExpression() {
    return findChildByClass(HackCallableFunctionCallExpression.class);
  }

  @Override
  @Nullable
  public HackCaseSeparator getCaseSeparator() {
    return findChildByClass(HackCaseSeparator.class);
  }

  @Override
  @Nullable
  public HackCastOperator getCastOperator() {
    return findChildByClass(HackCastOperator.class);
  }

  @Override
  @Nullable
  public HackComparativeOperator getComparativeOperator() {
    return findChildByClass(HackComparativeOperator.class);
  }

  @Override
  @Nullable
  public HackDynamicVariableExpression getDynamicVariableExpression() {
    return findChildByClass(HackDynamicVariableExpression.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpression getEspecialParenthesisedExpression() {
    return findChildByClass(HackEspecialParenthesisedExpression.class);
  }

  @Override
  @Nullable
  public HackFunctionCallExpression getFunctionCallExpression() {
    return findChildByClass(HackFunctionCallExpression.class);
  }

  @Override
  @Nullable
  public HackLogicalOperator getLogicalOperator() {
    return findChildByClass(HackLogicalOperator.class);
  }

  @Override
  @Nullable
  public HackMemberVariableExpression getMemberVariableExpression() {
    return findChildByClass(HackMemberVariableExpression.class);
  }

  @Override
  @Nullable
  public HackMethodCallExpression getMethodCallExpression() {
    return findChildByClass(HackMethodCallExpression.class);
  }

  @Override
  @Nullable
  public HackMultiplicativeOperator getMultiplicativeOperator() {
    return findChildByClass(HackMultiplicativeOperator.class);
  }

  @Override
  @Nullable
  public HackParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(HackParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public HackPrefixOperator getPrefixOperator() {
    return findChildByClass(HackPrefixOperator.class);
  }

  @Override
  @Nullable
  public HackShiftOperator getShiftOperator() {
    return findChildByClass(HackShiftOperator.class);
  }

  @Override
  @Nullable
  public HackStatement getStatement() {
    return findChildByClass(HackStatement.class);
  }

  @Override
  @Nullable
  public HackStaticClassVariableExpression getStaticClassVariableExpression() {
    return findChildByClass(HackStaticClassVariableExpression.class);
  }

  @Override
  @Nullable
  public HackStaticMethodCallExpression getStaticMethodCallExpression() {
    return findChildByClass(HackStaticMethodCallExpression.class);
  }

  @Override
  @Nullable
  public HackVariableExpression getVariableExpression() {
    return findChildByClass(HackVariableExpression.class);
  }

}
