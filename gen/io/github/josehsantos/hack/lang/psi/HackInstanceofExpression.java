// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInstanceofExpression extends HackExpression {

  @Nullable
  HackAdditiveConcatenationExpression getAdditiveConcatenationExpression();

  @NotNull
  List<HackArrayAccessExpression> getArrayAccessExpressionList();

  @NotNull
  List<HackArrayLiteralExpression> getArrayLiteralExpressionList();

  @Nullable
  HackAssignmentExpression getAssignmentExpression();

  @NotNull
  List<HackBackticksExpression> getBackticksExpressionList();

  @Nullable
  HackBitwiseExpression getBitwiseExpression();

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

  @Nullable
  HackListAssignmentExpression getListAssignmentExpression();

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

  @Nullable
  HackShiftExpression getShiftExpression();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackStaticMethodCallExpression> getStaticMethodCallExpressionList();

  @NotNull
  List<HackSuffixOperator> getSuffixOperatorList();

  @Nullable
  HackTernaryExpression getTernaryExpression();

  @NotNull
  List<HackTupleExpression> getTupleExpressionList();

  @NotNull
  List<HackVArrayLiteralExpression> getVArrayLiteralExpressionList();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @Nullable
  HackVariableNameHolder getVariableNameHolder();

  @NotNull
  List<HackXhpExpression> getXhpExpressionList();

}
