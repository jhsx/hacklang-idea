// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackQueryBodyClause extends HackPsiElement {

  @Nullable
  HackFromClause getFromClause();

  @Nullable
  HackJoinClause getJoinClause();

  @Nullable
  HackJoinIntoClause getJoinIntoClause();

  @Nullable
  HackLetClause getLetClause();

  @Nullable
  HackOrderbyClause getOrderbyClause();

  @Nullable
  HackWhereClause getWhereClause();

}
