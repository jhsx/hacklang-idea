// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackIfStatement extends HackStatement {

  @Nullable
  HackElseSingle getElseSingle();

  @Nullable
  HackElseifList getElseifList();

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackInnerStatementList getInnerStatementList();

  @Nullable
  HackNewElseSingle getNewElseSingle();

  @Nullable
  HackNewElseifList getNewElseifList();

}
