// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassStatement extends HackStatement {

  @Nullable
  HackClassVariableDeclarations getClassVariableDeclarations();

  @Nullable
  HackConstantDeclaration getConstantDeclaration();

  @Nullable
  HackTraitRequireDeclaration getTraitRequireDeclaration();

  @Nullable
  HackTraitUseDeclaration getTraitUseDeclaration();

  @Nullable
  HackXhpAttributeDeclaration getXhpAttributeDeclaration();

  @Nullable
  HackXhpCategoryDeclaration getXhpCategoryDeclaration();

  @Nullable
  HackXhpChildrenDeclaration getXhpChildrenDeclaration();

}
