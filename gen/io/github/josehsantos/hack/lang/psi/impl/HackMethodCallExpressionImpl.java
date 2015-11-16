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

public class HackMethodCallExpressionImpl extends HackExpressionImpl implements HackMethodCallExpression {

  public HackMethodCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitMethodCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackArrayAccessExpression getArrayAccessExpression() {
    return findChildByClass(HackArrayAccessExpression.class);
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
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
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
  public HackTypeArgs getTypeArgs() {
    return findChildByClass(HackTypeArgs.class);
  }

  @Override
  @NotNull
  public List<HackVariableExpression> getVariableExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVariableExpression.class);
  }

  @Override
  @Nullable
  public HackVariableExpressionVariable getVariableExpressionVariable() {
    return findChildByClass(HackVariableExpressionVariable.class);
  }

}
