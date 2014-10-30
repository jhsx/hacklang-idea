// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackExprStatement extends PsiElement {

  @Nullable
  HackAwaitAssignExpr getAwaitAssignExpr();

  @Nullable
  HackAwaitExpr getAwaitExpr();

  @Nullable
  HackAwaitListAssignExpr getAwaitListAssignExpr();

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackQueryAssignExpr getQueryAssignExpr();

  @Nullable
  HackYieldAssignExpr getYieldAssignExpr();

  @Nullable
  HackYieldExpr getYieldExpr();

  @Nullable
  HackYieldListAssignExpr getYieldListAssignExpr();

}
