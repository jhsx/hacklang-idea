// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackCloneExpr extends PsiElement {

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

  @Nullable
  HackCallableFunctionCallExpr getCallableFunctionCallExpr();

  @NotNull
  List<HackCastExpr> getCastExprList();

  @Nullable
  HackClassMethodCallExpr getClassMethodCallExpr();

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

  @Nullable
  HackDimmableVariableAccessExpr getDimmableVariableAccessExpr();

  @Nullable
  HackEspecialParenthesisedExpr getEspecialParenthesisedExpr();

  @Nullable
  HackExitExpr getExitExpr();

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

  @Nullable
  HackMemberVariableExpr getMemberVariableExpr();

  @Nullable
  HackMethodCallExpr getMethodCallExpr();

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

  @Nullable
  HackSimpleFunctionCallExpr getSimpleFunctionCallExpr();

  @Nullable
  HackStaticClassVariableExpr getStaticClassVariableExpr();

  @Nullable
  HackTernaryExpr getTernaryExpr();

  @Nullable
  HackVariableWithoutObjectsExpr getVariableWithoutObjectsExpr();

  @Nullable
  HackVarrayLiteralExpr getVarrayLiteralExpr();

  @Nullable
  HackXhpExpr getXhpExpr();

}
