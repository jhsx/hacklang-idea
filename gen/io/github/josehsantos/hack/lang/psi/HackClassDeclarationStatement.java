// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassDeclarationStatement extends PsiElement {

  @Nullable
  HackClassStatementList getClassStatementList();

  @Nullable
  HackExtendsFrom getExtendsFrom();

  @Nullable
  HackHhTypevar getHhTypevar();

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackImplementsList getImplementsList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
