// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMethodCallExpr extends PsiElement {

  @Nullable
  HackAdditiveOrConcatenationExpr getAdditiveOrConcatenationExpr();

  @Nullable
  HackArrayLiteralExpr getArrayLiteralExpr();

  @Nullable
  HackAssignmentExpr getAssignmentExpr();

  @Nullable
  HackBackticksExpr getBackticksExpr();

  @Nullable
  HackBitwiseExpr getBitwiseExpr();

  @NotNull
  List<HackCallableFunctionCallExpr> getCallableFunctionCallExprList();

  @NotNull
  List<HackCastExpr> getCastExprList();

  @NotNull
  List<HackClassMethodCallExpr> getClassMethodCallExprList();

  @Nullable
  HackCloneExpr getCloneExpr();

  @Nullable
  HackClosureExpr getClosureExpr();

  @Nullable
  HackCollectionLiteralExpr getCollectionLiteralExpr();

  @Nullable
  HackComparativeExpr getComparativeExpr();

  @Nullable
  HackDimExpr getDimExpr();

  @NotNull
  List<HackDimmableVariableAccessExpr> getDimmableVariableAccessExprList();

  @NotNull
  List<HackEspecialParenthesisedExpr> getEspecialParenthesisedExprList();

  @Nullable
  HackExitExpr getExitExpr();

  @Nullable
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackHhTypeargsOpt getHhTypeargsOpt();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackInstanceofExpr getInstanceofExpr();

  @Nullable
  HackInternalEmptyExpr getInternalEmptyExpr();

  @Nullable
  HackInternalEvalExpr getInternalEvalExpr();

  @Nullable
  HackInternalIncludeExpr getInternalIncludeExpr();

  @Nullable
  HackInternalIssetExpr getInternalIssetExpr();

  @Nullable
  HackInternalRequireExpr getInternalRequireExpr();

  @Nullable
  HackInternalTupleExpr getInternalTupleExpr();

  @Nullable
  HackLambdaExpr getLambdaExpr();

  @Nullable
  HackListAssignmentExpr getListAssignmentExpr();

  @Nullable
  HackLogicalExpr getLogicalExpr();

  @Nullable
  HackMapArrayLiteralExpr getMapArrayLiteralExpr();

  @NotNull
  List<HackMemberVariableExpr> getMemberVariableExprList();

  @NotNull
  List<HackMethodCallExpr> getMethodCallExprList();

  @Nullable
  HackMultiplicativeExpr getMultiplicativeExpr();

  @Nullable
  HackNewExpr getNewExpr();

  @Nullable
  HackParenthesizedExpr getParenthesizedExpr();

  @Nullable
  HackPrefixExpr getPrefixExpr();

  @Nullable
  HackPrintExpr getPrintExpr();

  @Nullable
  HackScalarExpr getScalarExpr();

  @Nullable
  HackShapeLiteralExpr getShapeLiteralExpr();

  @Nullable
  HackShiftExpr getShiftExpr();

  @NotNull
  List<HackSimpleFunctionCallExpr> getSimpleFunctionCallExprList();

  @NotNull
  List<HackStaticClassVariableExpr> getStaticClassVariableExprList();

  @Nullable
  HackTernaryExpr getTernaryExpr();

  @NotNull
  List<HackVariableWithoutObjectsExpr> getVariableWithoutObjectsExprList();

  @Nullable
  HackVarrayLiteralExpr getVarrayLiteralExpr();

  @Nullable
  HackXhpExpr getXhpExpr();

}
