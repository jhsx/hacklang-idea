// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassDeclaration extends HackPsiElement {

  @Nullable
  HackAttributes getAttributes();

  @Nullable
  HackClassBlock getClassBlock();

  @Nullable
  HackExtends getExtends();

  @Nullable
  HackImplements getImplements();

  @Nullable
  HackNameHolder getNameHolder();

  @Nullable
  HackTypeVar getTypeVar();

  @Nullable
  HackXhpNameHolder getXhpNameHolder();

}
