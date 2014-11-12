// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackAssignmentList extends PsiElement {

  @NotNull
  List<HackAssignmentList> getAssignmentListList();

  @NotNull
  List<HackCallableFunctionCallExpr> getCallableFunctionCallExprList();

  @NotNull
  List<HackClassMethodCallExpr> getClassMethodCallExprList();

  @NotNull
  List<HackDimmableVariableAccessExpr> getDimmableVariableAccessExprList();

  @NotNull
  List<HackEspecialParenthesisedExpr> getEspecialParenthesisedExprList();

  @NotNull
  List<HackMemberVariableExpr> getMemberVariableExprList();

  @NotNull
  List<HackMethodCallExpr> getMethodCallExprList();

  @NotNull
  List<HackSimpleFunctionCallExpr> getSimpleFunctionCallExprList();

  @NotNull
  List<HackStaticClassVariableExpr> getStaticClassVariableExprList();

  @NotNull
  List<HackVariableWithoutObjectsExpr> getVariableWithoutObjectsExprList();

}
