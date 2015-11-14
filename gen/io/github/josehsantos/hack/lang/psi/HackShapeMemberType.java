// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackShapeMemberType extends HackType {

  @Nullable
  HackIdentifier getIdentifier();

  @Nullable
  HackNamespaceName getNamespaceName();

  @NotNull
  HackType getType();

  @Nullable
  HackTypeargs getTypeargs();

}
