// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackParameterItem extends PsiElement {

  @NotNull
  HackHhTypeOpt getHhTypeOpt();

  @NotNull
  HackOptionalUserAttributes getOptionalUserAttributes();

  @NotNull
  HackParameterModifiers getParameterModifiers();

  @Nullable
  HackStaticExpr getStaticExpr();

}
