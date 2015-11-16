// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackCallableFunctionCallExpression extends HackExpression {

  @Nullable
  HackAdditiveConcatenationOperator getAdditiveConcatenationOperator();

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @Nullable
  HackBitwiseOperator getBitwiseOperator();

  @NotNull
  List<HackCallParameter> getCallParameterList();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackCaseSeparator getCaseSeparator();

  @Nullable
  HackCastOperator getCastOperator();

  @Nullable
  HackComparativeOperator getComparativeOperator();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackFunctionCallExpression getFunctionCallExpression();

  @Nullable
  HackLogicalOperator getLogicalOperator();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

  @Nullable
  HackMultiplicativeOperator getMultiplicativeOperator();

  @Nullable
  HackParenthesizedExpression getParenthesizedExpression();

  @Nullable
  HackPrefixOperator getPrefixOperator();

  @Nullable
  HackShiftOperator getShiftOperator();

  @Nullable
  HackStatement getStatement();

  @Nullable
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackStaticMethodCallExpression getStaticMethodCallExpression();

  @Nullable
  HackVariableExpression getVariableExpression();

}
