// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackDimmableVariableAccessExpr extends PsiElement {

  @NotNull
  List<HackArrayAccess> getArrayAccessList();

  @Nullable
  HackCloneExpr getCloneExpr();

  @Nullable
  HackCollectionLiteralExpr getCollectionLiteralExpr();

  @Nullable
  HackEspecialParenthesisedExpr getEspecialParenthesisedExpr();

  @Nullable
  HackNewExpr getNewExpr();

  @Nullable
  HackXhpExpr getXhpExpr();

}
