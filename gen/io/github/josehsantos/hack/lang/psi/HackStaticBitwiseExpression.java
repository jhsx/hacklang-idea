// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticBitwiseExpression extends HackExpression {

  @NotNull
  HackBitwiseOperator getBitwiseOperator();

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList();

  @Nullable
  HackStaticBitwiseExpression getStaticBitwiseExpression();

  @NotNull
  List<HackStaticMultiplicativeExpression> getStaticMultiplicativeExpressionList();

  @NotNull
  List<HackStaticPrefixExpression> getStaticPrefixExpressionList();

  @NotNull
  List<HackStaticShiftExpression> getStaticShiftExpressionList();

}
