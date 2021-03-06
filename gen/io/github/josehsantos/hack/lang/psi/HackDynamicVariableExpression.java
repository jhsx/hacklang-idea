// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackDynamicVariableExpression extends HackExpression {

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackExpressionVariable getExpressionVariable();

  @Nullable
  HackFunctionCallExpression getFunctionCallExpression();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

  @Nullable
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackStaticMethodCallExpression getStaticMethodCallExpression();

  @Nullable
  HackVariableExpression getVariableExpression();

  @Nullable
  HackVariableExpressionVariable getVariableExpressionVariable();

  @Nullable
  HackVariableIdentifier getVariableIdentifier();

}
