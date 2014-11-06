// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackDimExpr extends HackExpr {

  @NotNull
  HackDimExprBase getDimExprBase();

  @NotNull
  List<HackExpr> getExprList();

}
