// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackFunctionDeclaration extends HackFunction {

  @Nullable
  HackFunctionBody getFunctionBody();

  @Nullable
  HackMethodModifiers getMethodModifiers();

  @NotNull
  HackNameHolder getNameHolder();

  @Nullable
  HackOptReturnType getOptReturnType();

  @Nullable
  HackParameterList getParameterList();

  @Nullable
  HackTypevar getTypevar();

  @Nullable
  HackUserAttributes getUserAttributes();

}
