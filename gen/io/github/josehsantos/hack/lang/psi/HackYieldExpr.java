// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackYieldExpr extends PsiElement {

  @NotNull
  List<HackAdditiveOrConcatenationExpr> getAdditiveOrConcatenationExprList();

  @NotNull
  List<HackArrayLiteralExpr> getArrayLiteralExprList();

  @NotNull
  List<HackAssignmentExpr> getAssignmentExprList();

  @NotNull
  List<HackBackticksExpr> getBackticksExprList();

  @NotNull
  List<HackBitwiseExpr> getBitwiseExprList();

  @NotNull
  List<HackCallableFunctionCallExpr> getCallableFunctionCallExprList();

  @NotNull
  List<HackCastExpr> getCastExprList();

  @NotNull
  List<HackClassMethodCallExpr> getClassMethodCallExprList();

  @NotNull
  List<HackCloneExpr> getCloneExprList();

  @NotNull
  List<HackClosureExpr> getClosureExprList();

  @NotNull
  List<HackCollectionLiteralExpr> getCollectionLiteralExprList();

  @NotNull
  List<HackComparativeExpr> getComparativeExprList();

  @NotNull
  List<HackDimExpr> getDimExprList();

  @NotNull
  List<HackDimmableVariableAccessExpr> getDimmableVariableAccessExprList();

  @NotNull
  List<HackEspecialParenthesisedExpr> getEspecialParenthesisedExprList();

  @NotNull
  List<HackExitExpr> getExitExprList();

  @NotNull
  List<HackInstanceofExpr> getInstanceofExprList();

  @NotNull
  List<HackInternalEmptyExpr> getInternalEmptyExprList();

  @NotNull
  List<HackInternalEvalExpr> getInternalEvalExprList();

  @NotNull
  List<HackInternalIncludeExpr> getInternalIncludeExprList();

  @NotNull
  List<HackInternalIssetExpr> getInternalIssetExprList();

  @NotNull
  List<HackInternalRequireExpr> getInternalRequireExprList();

  @NotNull
  List<HackInternalTupleExpr> getInternalTupleExprList();

  @NotNull
  List<HackLambdaExpr> getLambdaExprList();

  @NotNull
  List<HackListAssignmentExpr> getListAssignmentExprList();

  @NotNull
  List<HackLogicalExpr> getLogicalExprList();

  @NotNull
  List<HackMapArrayLiteralExpr> getMapArrayLiteralExprList();

  @NotNull
  List<HackMemberVariableExpr> getMemberVariableExprList();

  @NotNull
  List<HackMethodCallExpr> getMethodCallExprList();

  @NotNull
  List<HackMultiplicativeExpr> getMultiplicativeExprList();

  @NotNull
  List<HackNewExpr> getNewExprList();

  @NotNull
  List<HackParenthesizedExpr> getParenthesizedExprList();

  @NotNull
  List<HackPrefixExpr> getPrefixExprList();

  @NotNull
  List<HackPrintExpr> getPrintExprList();

  @NotNull
  List<HackScalarExpr> getScalarExprList();

  @NotNull
  List<HackShapeLiteralExpr> getShapeLiteralExprList();

  @NotNull
  List<HackShiftExpr> getShiftExprList();

  @NotNull
  List<HackSimpleFunctionCallExpr> getSimpleFunctionCallExprList();

  @NotNull
  List<HackStaticClassVariableExpr> getStaticClassVariableExprList();

  @NotNull
  List<HackTernaryExpr> getTernaryExprList();

  @NotNull
  List<HackVariableWithoutObjectsExpr> getVariableWithoutObjectsExprList();

  @NotNull
  List<HackVarrayLiteralExpr> getVarrayLiteralExprList();

  @NotNull
  List<HackXhpExpr> getXhpExprList();

}
