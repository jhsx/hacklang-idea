// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticBitwiseExpr extends PsiElement {

  @NotNull
  HackBitwiseOperator getBitwiseOperator();

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList();

  @Nullable
  HackStaticBitwiseExpr getStaticBitwiseExpr();

  @NotNull
  List<HackStaticMultiplicativeExpr> getStaticMultiplicativeExprList();

  @NotNull
  List<HackStaticPrefixExpr> getStaticPrefixExprList();

  @NotNull
  List<HackStaticShiftExpr> getStaticShiftExprList();

}
