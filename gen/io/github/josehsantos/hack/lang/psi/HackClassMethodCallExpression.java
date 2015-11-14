// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassMethodCallExpression extends HackExpression {

  @NotNull
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackIdentifier getIdentifier();

  @NotNull
  HackStaticClassName getStaticClassName();

  @Nullable
  HackTypeargs getTypeargs();

  @Nullable
  HackVariableExpression getVariableExpression();

  @Nullable
  HackVariableExpressionVariable getVariableExpressionVariable();

}
