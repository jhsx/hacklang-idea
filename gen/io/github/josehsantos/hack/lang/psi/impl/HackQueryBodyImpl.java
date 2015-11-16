// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import io.github.josehsantos.hack.lang.psi.*;

public class HackQueryBodyImpl extends HackPsiElementImpl implements HackQueryBody {

  public HackQueryBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitQueryBody(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackFromClause> getFromClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFromClause.class);
  }

  @Override
  @Nullable
  public HackGroupClause getGroupClause() {
    return findChildByClass(HackGroupClause.class);
  }

  @Override
  @NotNull
  public List<HackJoinClause> getJoinClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackJoinClause.class);
  }

  @Override
  @NotNull
  public List<HackJoinIntoClause> getJoinIntoClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackJoinIntoClause.class);
  }

  @Override
  @NotNull
  public List<HackLetClause> getLetClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLetClause.class);
  }

  @Override
  @NotNull
  public List<HackOrderByClause> getOrderByClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackOrderByClause.class);
  }

  @Override
  @Nullable
  public HackQueryContinuation getQueryContinuation() {
    return findChildByClass(HackQueryContinuation.class);
  }

  @Override
  @Nullable
  public HackSelectClause getSelectClause() {
    return findChildByClass(HackSelectClause.class);
  }

  @Override
  @NotNull
  public List<HackWhereClause> getWhereClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackWhereClause.class);
  }

}
