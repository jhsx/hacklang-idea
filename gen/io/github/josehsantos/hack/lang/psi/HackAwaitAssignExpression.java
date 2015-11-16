// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackAwaitAssignExpression extends HackExpression {

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @NotNull
  HackAwaitExpression getAwaitExpression();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

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
  HackVariableNameHolder getVariableNameHolder();

}
