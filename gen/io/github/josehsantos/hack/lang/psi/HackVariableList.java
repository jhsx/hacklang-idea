// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackVariableList extends HackPsiElement {

  @NotNull
  List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList();

  @NotNull
  List<HackClassMethodCallExpression> getClassMethodCallExpressionList();

  @NotNull
  List<HackDimmableVariableAccessExpression> getDimmableVariableAccessExpressionList();

  @NotNull
  List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList();

  @NotNull
  List<HackMemberVariableExpression> getMemberVariableExpressionList();

  @NotNull
  List<HackMethodCallExpression> getMethodCallExpressionList();

  @NotNull
  List<HackSimpleFunctionCallExpression> getSimpleFunctionCallExpressionList();

  @NotNull
  List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

}
