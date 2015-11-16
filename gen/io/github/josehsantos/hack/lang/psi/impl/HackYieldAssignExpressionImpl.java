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

public class HackYieldAssignExpressionImpl extends HackExpressionImpl implements HackYieldAssignExpression {

  public HackYieldAssignExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitYieldAssignExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackArrayAccessExpression getArrayAccessExpression() {
    return findChildByClass(HackArrayAccessExpression.class);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpression getCallableFunctionCallExpression() {
    return findChildByClass(HackCallableFunctionCallExpression.class);
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

  @Override
  @Nullable
  public HackVariableNameHolder getVariableNameHolder() {
    return findChildByClass(HackVariableNameHolder.class);
  }

  @Override
  @NotNull
  public HackYieldExpression getYieldExpression() {
    return findNotNullChildByClass(HackYieldExpression.class);
  }

}
