// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClosureFunction extends HackFunction {

  @Nullable
  HackBlock getBlock();

  @Nullable
  HackLambdaUseVariables getLambdaUseVariables();

  @NotNull
  List<HackMemberModifier> getMemberModifierList();

  @NotNull
  List<HackParameter> getParameterList();

  @Nullable
  HackReturnType getReturnType();

}
