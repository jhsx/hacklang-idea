// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassMethodCall extends PsiElement {

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackHhTypeargsOpt getHhTypeargsOpt();

  @Nullable
  HackIdent getIdent();

  @NotNull
  HackStaticClassName getStaticClassName();

  @Nullable
  HackVariableWithoutObjects getVariableWithoutObjects();

}
