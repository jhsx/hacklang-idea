// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMemberVariableExpression extends HackExpression {

  @Nullable
  HackAdditiveOrConcatenationExpression getAdditiveOrConcatenationExpression();

  @Nullable
  HackArrayLiteralExpression getArrayLiteralExpression();

  @Nullable
  HackAssignmentExpression getAssignmentExpression();

  @Nullable
  HackBackticksExpression getBackticksExpression();

  @Nullable
  HackBitwiseExpression getBitwiseExpression();

  @NotNull
  List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList();

  @NotNull
  List<HackCastExpression> getCastExpressionList();

  @NotNull
  List<HackClassMethodCallExpression> getClassMethodCallExpressionList();

  @Nullable
  HackCloneExpression getCloneExpression();

  @Nullable
  HackClosureExpression getClosureExpression();

  @Nullable
  HackCollectionLiteralExpression getCollectionLiteralExpression();

  @Nullable
  HackComparativeExpression getComparativeExpression();

  @Nullable
  HackDimExpression getDimExpression();

  @NotNull
  List<HackDimmableVariableAccessExpression> getDimmableVariableAccessExpressionList();

  @Nullable
  HackEmptyExpression getEmptyExpression();

  @NotNull
  List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList();

  @Nullable
  HackEvalExpression getEvalExpression();

  @Nullable
  HackExitExpression getExitExpression();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackIncludeExpression getIncludeExpression();

  @Nullable
  HackInstanceofExpression getInstanceofExpression();

  @Nullable
  HackIssetExpression getIssetExpression();

  @Nullable
  HackLambdaExpression getLambdaExpression();

  @Nullable
  HackListAssignmentExpression getListAssignmentExpression();

  @Nullable
  HackLogicalExpression getLogicalExpression();

  @Nullable
  HackMapArrayLiteralExpression getMapArrayLiteralExpression();

  @NotNull
  List<HackMemberVariableExpression> getMemberVariableExpressionList();

  @NotNull
  List<HackMethodCallExpression> getMethodCallExpressionList();

  @Nullable
  HackMultiplicativeExpression getMultiplicativeExpression();

  @Nullable
  HackNewExpression getNewExpression();

  @Nullable
  HackParenthesizedExpression getParenthesizedExpression();

  @Nullable
  HackPrefixOperator getPrefixOperator();

  @Nullable
  HackPrintExpression getPrintExpression();

  @Nullable
  HackRequireExpression getRequireExpression();

  @Nullable
  HackScalarExpression getScalarExpression();

  @Nullable
  HackShapeLiteralExpression getShapeLiteralExpression();

  @Nullable
  HackShiftExpression getShiftExpression();

  @NotNull
  List<HackSimpleFunctionCallExpression> getSimpleFunctionCallExpressionList();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @Nullable
  HackSuffixOperator getSuffixOperator();

  @Nullable
  HackTernaryExpression getTernaryExpression();

  @Nullable
  HackTupleExpression getTupleExpression();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @Nullable
  HackVariableNameHolder getVariableNameHolder();

  @Nullable
  HackVarrayLiteralExpression getVarrayLiteralExpression();

  @Nullable
  HackXhpExpression getXhpExpression();

}
