// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMultiplicativeExpression extends HackExpression {

  @NotNull
  List<HackArrayLiteralExpression> getArrayLiteralExpressionList();

  @NotNull
  List<HackBackticksExpression> getBackticksExpressionList();

  @NotNull
  List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList();

  @NotNull
  List<HackCastExpression> getCastExpressionList();

  @NotNull
  List<HackClassMethodCallExpression> getClassMethodCallExpressionList();

  @NotNull
  List<HackCloneExpression> getCloneExpressionList();

  @NotNull
  List<HackClosureExpression> getClosureExpressionList();

  @NotNull
  List<HackCollectionLiteralExpression> getCollectionLiteralExpressionList();

  @NotNull
  List<HackDimExpression> getDimExpressionList();

  @NotNull
  List<HackDimmableVariableAccessExpression> getDimmableVariableAccessExpressionList();

  @NotNull
  List<HackEmptyExpression> getEmptyExpressionList();

  @NotNull
  List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList();

  @NotNull
  List<HackEvalExpression> getEvalExpressionList();

  @NotNull
  List<HackExitExpression> getExitExpressionList();

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

  @Nullable
  HackMultiplicativeExpression getMultiplicativeExpression();

  @NotNull
  HackMultiplicativeOperator getMultiplicativeOperator();

  @NotNull
  List<HackNewExpression> getNewExpressionList();

  @NotNull
  List<HackParenthesizedExpression> getParenthesizedExpressionList();

  @NotNull
  List<HackPrefixOperator> getPrefixOperatorList();

  @NotNull
  List<HackPrintExpression> getPrintExpressionList();

  @NotNull
  List<HackRequireExpression> getRequireExpressionList();

  @NotNull
  List<HackScalarExpression> getScalarExpressionList();

  @NotNull
  List<HackShapeLiteralExpression> getShapeLiteralExpressionList();

  @NotNull
  List<HackSimpleFunctionCallExpression> getSimpleFunctionCallExpressionList();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackSuffixOperator> getSuffixOperatorList();

  @NotNull
  List<HackTupleExpression> getTupleExpressionList();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @NotNull
  List<HackVarrayLiteralExpression> getVarrayLiteralExpressionList();

  @NotNull
  List<HackXhpExpression> getXhpExpressionList();

}
