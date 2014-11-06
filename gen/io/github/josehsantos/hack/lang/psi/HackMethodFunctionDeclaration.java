// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMethodFunctionDeclaration extends HackFunctionDeclarationStatement {

  @NotNull
  HackFunctionBody getFunctionBody();

  @Nullable
  HackHhOptReturnType getHhOptReturnType();

  @Nullable
  HackHhTypevar getHhTypevar();

  @NotNull
  HackIdent getIdent();

  @Nullable
  HackMethodModifiers getMethodModifiers();

  @Nullable
  HackParameterList getParameterList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
