// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticShiftExpression extends HackExpression {

  @NotNull
  HackShiftOperator getShiftOperator();

  @NotNull
  List<HackStaticAdditiveOrConcatenationExpression> getStaticAdditiveOrConcatenationExpressionList();

  @NotNull
  List<HackStaticMultiplicativeExpression> getStaticMultiplicativeExpressionList();

  @NotNull
  List<HackStaticPrefixExpression> getStaticPrefixExpressionList();

  @Nullable
  HackStaticShiftExpression getStaticShiftExpression();

}
