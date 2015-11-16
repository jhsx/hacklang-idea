// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackAssignmentExpression extends HackExpression {

  @Nullable
  HackAdditiveConcatenationExpression getAdditiveConcatenationExpression();

  @NotNull
  List<HackArrayAccessExpression> getArrayAccessExpressionList();

  @Nullable
  HackArrayLiteralExpression getArrayLiteralExpression();

  @NotNull
  List<HackAssignmentExpression> getAssignmentExpressionList();

  @Nullable
  HackBackticksExpression getBackticksExpression();

  @Nullable
  HackBitwiseExpression getBitwiseExpression();

  @NotNull
  List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList();

  @Nullable
  HackCastExpression getCastExpression();

  @Nullable
  HackCloneExpression getCloneExpression();

  @Nullable
  HackClosureExpression getClosureExpression();

  @Nullable
  HackCollectionLiteralExpression getCollectionLiteralExpression();

  @Nullable
  HackComparativeExpression getComparativeExpression();

  @NotNull
  List<HackDynamicVariableExpression> getDynamicVariableExpressionList();

  @Nullable
  HackEmptyExpression getEmptyExpression();

  @NotNull
  List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList();

  @Nullable
  HackEvalExpression getEvalExpression();

  @Nullable
  HackExitExpression getExitExpression();

  @NotNull
  List<HackFunctionCallExpression> getFunctionCallExpressionList();

  @Nullable
  HackIncludeExpression getIncludeExpression();

  @Nullable
  HackInstanceofExpression getInstanceofExpression();

  @Nullable
  HackIssetExpression getIssetExpression();

  @Nullable
  HackLambdaExpression getLambdaExpression();

  @NotNull
  List<HackListAssignmentExpression> getListAssignmentExpressionList();

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
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackStaticMethodCallExpression> getStaticMethodCallExpressionList();

  @Nullable
  HackSuffixOperator getSuffixOperator();

  @Nullable
  HackTernaryExpression getTernaryExpression();

  @Nullable
  HackTupleExpression getTupleExpression();

  @Nullable
  HackVArrayLiteralExpression getVArrayLiteralExpression();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

  @NotNull
  List<HackVariableNameHolder> getVariableNameHolderList();

  @Nullable
  HackXhpExpression getXhpExpression();

}
