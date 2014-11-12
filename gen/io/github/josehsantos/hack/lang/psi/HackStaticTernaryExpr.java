// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticTernaryExpr extends PsiElement {

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList();

  @NotNull
  List<HackStaticBitwiseExpr> getStaticBitwiseExprList();

  @NotNull
  List<HackStaticComparativeExpr> getStaticComparativeExprList();

  @Nullable
  HackStaticExpr getStaticExpr();

  @NotNull
  List<HackStaticLogicalExpr> getStaticLogicalExprList();

  @NotNull
  List<HackStaticMultiplicativeExpr> getStaticMultiplicativeExprList();

  @NotNull
  List<HackStaticPrefixExpr> getStaticPrefixExprList();

  @NotNull
  List<HackStaticShiftExpr> getStaticShiftExprList();

  @Nullable
  HackStaticTernaryExpr getStaticTernaryExpr();

}
