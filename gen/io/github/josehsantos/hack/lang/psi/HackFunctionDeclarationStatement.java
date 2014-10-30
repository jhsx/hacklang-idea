// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackFunctionDeclarationStatement extends PsiElement {

  @NotNull
  HackFunctionBody getFunctionBody();

  @NotNull
  HackFunctionLoc getFunctionLoc();

  @NotNull
  HackHhNameWithTypevar getHhNameWithTypevar();

  @NotNull
  HackHhOptReturnType getHhOptReturnType();

  @NotNull
  HackIsReference getIsReference();

  @NotNull
  HackParameterList getParameterList();

}
