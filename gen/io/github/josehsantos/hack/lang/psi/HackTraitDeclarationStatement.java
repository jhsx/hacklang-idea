// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTraitDeclarationStatement extends PsiElement {

  @Nullable
  HackClassStatementList getClassStatementList();

  @Nullable
  HackHhTypevar getHhTypevar();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackImplementsList getImplementsList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
