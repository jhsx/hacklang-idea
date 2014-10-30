// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInternalFunctions extends PsiElement {

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackExprNoVariable getExprNoVariable();

  @Nullable
  HackExprWithParens getExprWithParens();

  @Nullable
  HackVariable getVariable();

  @Nullable
  HackVariableList getVariableList();

}
