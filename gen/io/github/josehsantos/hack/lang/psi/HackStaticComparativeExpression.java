// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticComparativeExpression extends HackExpression {

  @NotNull
  HackComparativeOperator getComparativeOperator();

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList();

  @NotNull
  List<HackStaticBitwiseExpression> getStaticBitwiseExpressionList();

  @Nullable
  HackStaticComparativeExpression getStaticComparativeExpression();

  @NotNull
  List<HackStaticMultiplicativeExpression> getStaticMultiplicativeExpressionList();

  @NotNull
  List<HackStaticPrefixExpression> getStaticPrefixExpressionList();

  @NotNull
  List<HackStaticShiftExpression> getStaticShiftExpressionList();

}
