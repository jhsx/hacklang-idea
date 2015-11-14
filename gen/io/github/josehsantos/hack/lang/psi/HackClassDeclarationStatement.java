// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassDeclarationStatement extends HackBaseStatement {

  @Nullable
  HackClassStatementBlock getClassStatementBlock();

  @Nullable
  HackExtendsFrom getExtendsFrom();

  @Nullable
  HackImplementsList getImplementsList();

  @NotNull
  HackNameHolder getNameHolder();

  @Nullable
  HackTypevar getTypevar();

  @Nullable
  HackUserAttributes getUserAttributes();

}
