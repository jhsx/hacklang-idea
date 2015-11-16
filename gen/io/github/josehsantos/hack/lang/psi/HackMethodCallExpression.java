// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMethodCallExpression extends HackExpression {

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @NotNull
  List<HackCallParameter> getCallParameterList();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackFunctionCallExpression getFunctionCallExpression();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

  @Nullable
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackStaticMethodCallExpression getStaticMethodCallExpression();

  @Nullable
  HackTypeArgs getTypeArgs();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @Nullable
  HackVariableExpressionVariable getVariableExpressionVariable();

}
