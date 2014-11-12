// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClosureExpr extends PsiElement {

  @Nullable
  HackHhOptReturnType getHhOptReturnType();

  @NotNull
  HackInnerStatementList getInnerStatementList();

  @Nullable
  HackLambdaUseVars getLambdaUseVars();

  @NotNull
  List<HackMemberModifier> getMemberModifierList();

  @NotNull
  HackParameterList getParameterList();

}
