// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTryStatement extends HackStatement {

  @Nullable
  HackAdditionalCatches getAdditionalCatches();

  @Nullable
  HackOptionalFinally getOptionalFinally();

  @Nullable
  HackTryCatch getTryCatch();

  @Nullable
  HackTryFinally getTryFinally();

  @NotNull
  HackTryStatementList getTryStatementList();

}
