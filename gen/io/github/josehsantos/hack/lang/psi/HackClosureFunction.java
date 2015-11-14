// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClosureFunction extends HackFunction {

  @Nullable
  HackInnerStatementList getInnerStatementList();

  @Nullable
  HackLambdaUseVars getLambdaUseVars();

  @NotNull
  List<HackMemberModifier> getMemberModifierList();

  @Nullable
  HackOptReturnType getOptReturnType();

  @Nullable
  HackParameterList getParameterList();

}
