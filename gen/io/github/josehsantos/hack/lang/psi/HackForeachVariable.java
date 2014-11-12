// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackForeachVariable extends PsiElement {

  @Nullable
  HackCallableFunctionCallExpr getCallableFunctionCallExpr();

  @Nullable
  HackClassMethodCallExpr getClassMethodCallExpr();

  @Nullable
  HackDimmableVariableAccessExpr getDimmableVariableAccessExpr();

  @Nullable
  HackEspecialParenthesisedExpr getEspecialParenthesisedExpr();

  @Nullable
  HackForeachListAssignment getForeachListAssignment();

  @Nullable
  HackMemberVariableExpr getMemberVariableExpr();

  @Nullable
  HackMethodCallExpr getMethodCallExpr();

  @Nullable
  HackSimpleFunctionCallExpr getSimpleFunctionCallExpr();

  @Nullable
  HackStaticClassVariableExpr getStaticClassVariableExpr();

  @Nullable
  HackVariableWithoutObjectsExpr getVariableWithoutObjectsExpr();

}
