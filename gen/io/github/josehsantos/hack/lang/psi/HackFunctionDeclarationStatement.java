// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackFunctionDeclarationStatement extends PsiElement {

  @Nullable
  HackFunctionBody getFunctionBody();

  @Nullable
  HackHhOptReturnType getHhOptReturnType();

  @Nullable
  HackHhTypevar getHhTypevar();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackMethodModifiers getMethodModifiers();

  @Nullable
  HackParameterList getParameterList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
