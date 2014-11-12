// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticComparativeExpr extends PsiElement {

  @NotNull
  HackComparativeOperator getComparativeOperator();

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList();

  @NotNull
  List<HackStaticBitwiseExpr> getStaticBitwiseExprList();

  @Nullable
  HackStaticComparativeExpr getStaticComparativeExpr();

  @NotNull
  List<HackStaticMultiplicativeExpr> getStaticMultiplicativeExprList();

  @NotNull
  List<HackStaticPrefixExpr> getStaticPrefixExprList();

  @NotNull
  List<HackStaticShiftExpr> getStaticShiftExprList();

}
