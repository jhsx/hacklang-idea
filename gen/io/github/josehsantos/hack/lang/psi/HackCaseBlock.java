// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackCaseBlock extends PsiElement {

  @NotNull
  HackCaseSeparator getCaseSeparator();

  @NotNull
  HackExpr getExpr();

  @NotNull
  HackInnerStatementList getInnerStatementList();

}
