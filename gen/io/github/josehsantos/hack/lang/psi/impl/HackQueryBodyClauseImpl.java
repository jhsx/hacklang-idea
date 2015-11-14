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

public class HackQueryBodyClauseImpl extends HackPsiElementImpl implements HackQueryBodyClause {

  public HackQueryBodyClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitQueryBodyClause(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackFromClause getFromClause() {
    return findChildByClass(HackFromClause.class);
  }

  @Override
  @Nullable
  public HackJoinClause getJoinClause() {
    return findChildByClass(HackJoinClause.class);
  }

  @Override
  @Nullable
  public HackJoinIntoClause getJoinIntoClause() {
    return findChildByClass(HackJoinIntoClause.class);
  }

  @Override
  @Nullable
  public HackLetClause getLetClause() {
    return findChildByClass(HackLetClause.class);
  }

  @Override
  @Nullable
  public HackOrderbyClause getOrderbyClause() {
    return findChildByClass(HackOrderbyClause.class);
  }

  @Override
  @Nullable
  public HackWhereClause getWhereClause() {
    return findChildByClass(HackWhereClause.class);
  }

}
