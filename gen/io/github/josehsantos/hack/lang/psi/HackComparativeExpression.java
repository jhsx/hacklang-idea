// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackComparativeExpression extends HackExpression {

  @NotNull
  List<HackAdditiveConcatenationExpression> getAdditiveConcatenationExpressionList();

  @NotNull
  List<HackArrayAccessExpression> getArrayAccessExpressionList();

  @NotNull
  List<HackArrayLiteralExpression> getArrayLiteralExpressionList();

  @NotNull
  List<HackBackticksExpression> getBackticksExpressionList();

  @NotNull
  List<HackBitwiseExpression> getBitwiseExpressionList();

  @NotNull
  List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList();

  @NotNull
  List<HackCastExpression> getCastExpressionList();

  @NotNull
  List<HackCloneExpression> getCloneExpressionList();

  @NotNull
  List<HackClosureExpression> getClosureExpressionList();

  @NotNull
  List<HackCollectionLiteralExpression> getCollectionLiteralExpressionList();

  @Nullable
  HackComparativeExpression getComparativeExpression();

  @Nullable
  HackComparativeOperator getComparativeOperator();

  @NotNull
  List<HackDynamicVariableExpression> getDynamicVariableExpressionList();

  @NotNull
  List<HackEmptyExpression> getEmptyExpressionList();

  @NotNull
  List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList();

  @NotNull
  List<HackEvalExpression> getEvalExpressionList();

  @NotNull
  List<HackExitExpression> getExitExpressionList();

  @NotNull
  List<HackFunctionCallExpression> getFunctionCallExpressionList();

  @NotNull
  List<HackIncludeExpression> getIncludeExpressionList();

  @NotNull
  List<HackInstanceofExpression> getInstanceofExpressionList();

  @NotNull
  List<HackIssetExpression> getIssetExpressionList();

  @NotNull
  List<HackLambdaExpression> getLambdaExpressionList();

  @NotNull
  List<HackMapArrayLiteralExpression> getMapArrayLiteralExpressionList();

  @NotNull
  List<HackMemberVariableExpression> getMemberVariableExpressionList();

  @NotNull
  List<HackMethodCallExpression> getMethodCallExpressionList();

  @NotNull
  List<HackMultiplicativeExpression> getMultiplicativeExpressionList();

  @NotNull
  List<HackNewExpression> getNewExpressionList();

  @NotNull
  List<HackParenthesizedExpression> getParenthesizedExpressionList();

  @Nullable
  HackPrefixOperator getPrefixOperator();

  @NotNull
  List<HackPrintExpression> getPrintExpressionList();

  @NotNull
  List<HackRequireExpression> getRequireExpressionList();

  @NotNull
  List<HackScalarExpression> getScalarExpressionList();

  @NotNull
  List<HackShapeLiteralExpression> getShapeLiteralExpressionList();

  @NotNull
  List<HackShiftExpression> getShiftExpressionList();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackStaticMethodCallExpression> getStaticMethodCallExpressionList();

  @NotNull
  List<HackSuffixOperator> getSuffixOperatorList();

  @NotNull
  List<HackTupleExpression> getTupleExpressionList();

  @NotNull
  List<HackVArrayLiteralExpression> getVArrayLiteralExpressionList();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @NotNull
  List<HackXhpExpression> getXhpExpressionList();

}
