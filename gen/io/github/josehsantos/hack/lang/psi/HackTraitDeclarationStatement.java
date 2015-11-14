// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTraitDeclarationStatement extends HackBaseStatement {

  @Nullable
  HackClassStatementBlock getClassStatementBlock();

  @Nullable
  HackImplementsList getImplementsList();

  @Nullable
  HackNameHolder getNameHolder();

  @Nullable
  HackTypevar getTypevar();

  @Nullable
  HackUserAttributes getUserAttributes();

}
