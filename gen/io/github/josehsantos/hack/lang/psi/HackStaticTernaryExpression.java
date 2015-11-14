// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticTernaryExpression extends HackExpression {

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList();

  @NotNull
  List<HackStaticBitwiseExpression> getStaticBitwiseExpressionList();

  @NotNull
  List<HackStaticComparativeExpression> getStaticComparativeExpressionList();

  @Nullable
  HackStaticExpression getStaticExpression();

  @NotNull
  List<HackStaticLogicalExpression> getStaticLogicalExpressionList();

  @NotNull
  List<HackStaticMultiplicativeExpression> getStaticMultiplicativeExpressionList();

  @NotNull
  List<HackStaticPrefixExpression> getStaticPrefixExpressionList();

  @NotNull
  List<HackStaticShiftExpression> getStaticShiftExpressionList();

  @Nullable
  HackStaticTernaryExpression getStaticTernaryExpression();

}
