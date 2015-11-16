// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackCastExpression extends HackExpression {

  @Nullable
  HackArrayAccessExpression getArrayAccessExpression();

  @Nullable
  HackArrayLiteralExpression getArrayLiteralExpression();

  @Nullable
  HackBackticksExpression getBackticksExpression();

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackCastOperator getCastOperator();

  @Nullable
  HackCloneExpression getCloneExpression();

  @Nullable
  HackClosureExpression getClosureExpression();

  @Nullable
  HackCollectionLiteralExpression getCollectionLiteralExpression();

  @Nullable
  HackDynamicVariableExpression getDynamicVariableExpression();

  @Nullable
  HackEmptyExpression getEmptyExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackEvalExpression getEvalExpression();

  @Nullable
  HackExitExpression getExitExpression();

  @Nullable
  HackFunctionCallExpression getFunctionCallExpression();

  @Nullable
  HackIncludeExpression getIncludeExpression();

  @Nullable
  HackIssetExpression getIssetExpression();

  @Nullable
  HackLambdaExpression getLambdaExpression();

  @Nullable
  HackMapArrayLiteralExpression getMapArrayLiteralExpression();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

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
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackStaticMethodCallExpression getStaticMethodCallExpression();

  @Nullable
  HackSuffixOperator getSuffixOperator();

  @Nullable
  HackTupleExpression getTupleExpression();

  @Nullable
  HackVArrayLiteralExpression getVArrayLiteralExpression();

  @Nullable
  HackVariableExpression getVariableExpression();

  @Nullable
  HackXhpExpression getXhpExpression();

}
