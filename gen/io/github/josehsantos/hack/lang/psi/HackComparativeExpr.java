// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackComparativeExpr extends HackExpr {

  @NotNull
  HackComparativeOperator getComparativeOperator();

  @NotNull
  List<HackExpr> getExprList();

  @NotNull
  List<HackVariable> getVariableList();

}
