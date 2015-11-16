// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackFunctionDeclaration extends HackFunction {

  @Nullable
  HackAttributes getAttributes();

  @Nullable
  HackBlock getBlock();

  @NotNull
  List<HackMemberModifier> getMemberModifierList();

  @NotNull
  HackNameHolder getNameHolder();

  @NotNull
  List<HackParameter> getParameterList();

  @Nullable
  HackReturnType getReturnType();

  @Nullable
  HackTypeVar getTypeVar();

}
