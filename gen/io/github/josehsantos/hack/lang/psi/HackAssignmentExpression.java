// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackAssignmentExpression extends HackExpression {

  @Nullable
  HackAdditiveOrConcatenationExpression getAdditiveOrConcatenationExpression();

  @NotNull
  List<HackArrayLiteralExpression> getArrayLiteralExpressionList();

  @NotNull
  List<HackAssignmentExpression> getAssignmentExpressionList();

  @NotNull
  List<HackBackticksExpression> getBackticksExpressionList();

  @Nullable
  HackBitwiseExpression getBitwiseExpression();

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

  @Nullable
  HackComparativeExpression getComparativeExpression();

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

  @Nullable
  HackInstanceofExpression getInstanceofExpression();

  @NotNull
  List<HackIssetExpression> getIssetExpressionList();

  @NotNull
  List<HackLambdaExpression> getLambdaExpressionList();

  @NotNull
  List<HackListAssignmentExpression> getListAssignmentExpressionList();

  @Nullable
  HackLogicalExpression getLogicalExpression();

  @NotNull
  List<HackMapArrayLiteralExpression> getMapArrayLiteralExpressionList();

  @NotNull
  List<HackMemberVariableExpression> getMemberVariableExpressionList();

  @NotNull
  List<HackMethodCallExpression> getMethodCallExpressionList();

  @Nullable
  HackMultiplicativeExpression getMultiplicativeExpression();

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

  @Nullable
  HackShiftExpression getShiftExpression();

  @NotNull
  List<HackSimpleFunctionCallExpression> getSimpleFunctionCallExpressionList();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackSuffixOperator> getSuffixOperatorList();

  @Nullable
  HackTernaryExpression getTernaryExpression();

  @NotNull
  List<HackTupleExpression> getTupleExpressionList();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @NotNull
  List<HackVariableNameHolder> getVariableNameHolderList();

  @NotNull
  List<HackVarrayLiteralExpression> getVarrayLiteralExpressionList();

  @NotNull
  List<HackXhpExpression> getXhpExpressionList();

}
