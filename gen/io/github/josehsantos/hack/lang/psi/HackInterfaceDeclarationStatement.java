// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInterfaceDeclarationStatement extends PsiElement {

  @Nullable
  HackClassStatementList getClassStatementList();

  @Nullable
  HackHhTypevar getHhTypevar();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackInterfaceExtendsList getInterfaceExtendsList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
