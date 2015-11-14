// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInterfaceDeclarationStatement extends HackBaseStatement {

  @Nullable
  HackClassStatementBlock getClassStatementBlock();

  @Nullable
  HackInterfaceExtendsList getInterfaceExtendsList();

  @Nullable
  HackNameHolder getNameHolder();

  @Nullable
  HackTypevar getTypevar();

  @Nullable
  HackUserAttributes getUserAttributes();

}
