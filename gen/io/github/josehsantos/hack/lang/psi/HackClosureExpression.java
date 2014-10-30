// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClosureExpression extends PsiElement {

  @NotNull
  HackFunctionLoc getFunctionLoc();

  @NotNull
  HackHhOptReturnType getHhOptReturnType();

  @NotNull
  HackInnerStatementList getInnerStatementList();

  @NotNull
  HackIsReference getIsReference();

  @NotNull
  HackLambdaUseVars getLambdaUseVars();

  @NotNull
  HackParameterList getParameterList();

}
