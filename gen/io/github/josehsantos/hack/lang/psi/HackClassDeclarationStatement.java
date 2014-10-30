// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassDeclarationStatement extends PsiElement {

  @NotNull
  HackClassDeclName getClassDeclName();

  @NotNull
  HackClassEntryType getClassEntryType();

  @NotNull
  HackClassStatementList getClassStatementList();

  @NotNull
  HackExtendsFrom getExtendsFrom();

  @NotNull
  HackImplementsList getImplementsList();

}
