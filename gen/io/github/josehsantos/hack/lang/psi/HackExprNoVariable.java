// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackExprNoVariable extends PsiElement {

  @Nullable
  HackArrayLiteral getArrayLiteral();

  @Nullable
  HackAssignmentList getAssignmentList();

  @Nullable
  HackBackticksExpr getBackticksExpr();

  @Nullable
  HackClassNameReference getClassNameReference();

  @Nullable
  HackClosureExpression getClosureExpression();

  @Nullable
  HackCtorArguments getCtorArguments();

  @Nullable
  HackDimExpr getDimExpr();

  @Nullable
  HackExitExpr getExitExpr();

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackExprNoVariable getExprNoVariable();

  @Nullable
  HackInternalFunctions getInternalFunctions();

  @Nullable
  HackLambdaExpression getLambdaExpression();

  @Nullable
  HackMapArrayLiteral getMapArrayLiteral();

  @Nullable
  HackScalar getScalar();

  @Nullable
  HackShapeLiteral getShapeLiteral();

  @Nullable
  HackVariable getVariable();

  @Nullable
  HackVarrayLiteral getVarrayLiteral();

}
