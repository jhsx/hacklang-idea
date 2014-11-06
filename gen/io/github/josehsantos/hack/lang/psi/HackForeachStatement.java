// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackForeachStatement extends HackStatement {

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackForeachOptionalArg getForeachOptionalArg();

  @Nullable
  HackForeachStatementBody getForeachStatementBody();

  @Nullable
  HackForeachVariable getForeachVariable();

}
