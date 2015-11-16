// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackForeachVariable extends HackPsiElement {

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackFunctionCallExpression getFunctionCallExpression();

  @Nullable
  HackListAssignmentVariables getListAssignmentVariables();

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

}
