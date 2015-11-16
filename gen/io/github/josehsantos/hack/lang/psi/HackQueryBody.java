// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackQueryBody extends HackPsiElement {

  @NotNull
  List<HackFromClause> getFromClauseList();

  @Nullable
  HackGroupClause getGroupClause();

  @NotNull
  List<HackJoinClause> getJoinClauseList();

  @NotNull
  List<HackJoinIntoClause> getJoinIntoClauseList();

  @NotNull
  List<HackLetClause> getLetClauseList();

  @NotNull
  List<HackOrderByClause> getOrderByClauseList();

  @Nullable
  HackQueryContinuation getQueryContinuation();

  @Nullable
  HackSelectClause getSelectClause();

  @NotNull
  List<HackWhereClause> getWhereClauseList();

}
