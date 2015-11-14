// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackEnumDeclarationStatement extends HackBaseStatement {

  @Nullable
  HackEnumStatementList getEnumStatementList();

  @Nullable
  HackNameHolder getNameHolder();

  @NotNull
  List<HackType> getTypeList();

  @Nullable
  HackUserAttributes getUserAttributes();

}
