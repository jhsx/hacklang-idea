// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackObjectMethodCall extends PsiElement {

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackExprWithParens getExprWithParens();

  @NotNull
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackHhTypeargsOpt getHhTypeargsOpt();

  @Nullable
  HackIdent getIdent();

  @Nullable
  HackVariable getVariable();

  @Nullable
  HackVariableWithoutObjects getVariableWithoutObjects();

}
