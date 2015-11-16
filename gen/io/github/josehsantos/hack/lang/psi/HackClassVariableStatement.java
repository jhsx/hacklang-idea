// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassVariableStatement extends HackStatement {

  @NotNull
  HackClassVariableDeclaration getClassVariableDeclaration();

  @NotNull
  List<HackMemberModifier> getMemberModifierList();

  @Nullable
  HackType getType();

}
