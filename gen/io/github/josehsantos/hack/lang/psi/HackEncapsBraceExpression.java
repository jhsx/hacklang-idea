// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackEncapsBraceExpression extends HackExpression {

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackClassMethodCallExpression getClassMethodCallExpression();

  @Nullable
  HackDimmableVariableAccessExpression getDimmableVariableAccessExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

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

}
