// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackGlobalVar extends HackPsiElement {

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackClassMethodCallExpression getClassMethodCallExpression();

  @Nullable
  HackDimmableVariableAccessExpression getDimmableVariableAccessExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackExpressionVariable getExpressionVariable();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

  @Nullable
  HackSimpleFunctionCallExpression getSimpleFunctionCallExpression();

  @Nullable
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackVariableExpression getVariableExpression();

  @Nullable
  HackVariableNameHolder getVariableNameHolder();

}
