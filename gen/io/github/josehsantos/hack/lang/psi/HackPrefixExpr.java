// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackPrefixExpr extends PsiElement {

  @Nullable
  HackArrayLiteralExpr getArrayLiteralExpr();

  @Nullable
  HackBackticksExpr getBackticksExpr();

  @Nullable
  HackCallableFunctionCallExpr getCallableFunctionCallExpr();

  @Nullable
  HackClassMethodCallExpr getClassMethodCallExpr();

  @Nullable
  HackCloneExpr getCloneExpr();

  @Nullable
  HackClosureExpr getClosureExpr();

  @Nullable
  HackCollectionLiteralExpr getCollectionLiteralExpr();

  @Nullable
  HackDimExpr getDimExpr();

  @Nullable
  HackDimmableVariableAccessExpr getDimmableVariableAccessExpr();

  @Nullable
  HackEspecialParenthesisedExpr getEspecialParenthesisedExpr();

  @Nullable
  HackExitExpr getExitExpr();

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
  HackMapArrayLiteralExpr getMapArrayLiteralExpr();

  @Nullable
  HackMemberVariableExpr getMemberVariableExpr();

  @Nullable
  HackMethodCallExpr getMethodCallExpr();

  @Nullable
  HackNewExpr getNewExpr();

  @Nullable
  HackParenthesizedExpr getParenthesizedExpr();

  @Nullable
  HackPrefixExpr getPrefixExpr();

  @NotNull
  HackPrefixOperator getPrefixOperator();

  @Nullable
  HackPrintExpr getPrintExpr();

  @Nullable
  HackScalarExpr getScalarExpr();

  @Nullable
  HackShapeLiteralExpr getShapeLiteralExpr();

  @Nullable
  HackSimpleFunctionCallExpr getSimpleFunctionCallExpr();

  @Nullable
  HackStaticClassVariableExpr getStaticClassVariableExpr();

  @Nullable
  HackVariableWithoutObjectsExpr getVariableWithoutObjectsExpr();

  @Nullable
  HackVarrayLiteralExpr getVarrayLiteralExpr();

  @Nullable
  HackXhpExpr getXhpExpr();

}
