// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.josehsantos.hack.lang.psi.*;

public class HackIfStatementImpl extends ASTWrapperPsiElement implements HackIfStatement {

  public HackIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitIfStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackElseSingle getElseSingle() {
    return findChildByClass(HackElseSingle.class);
  }

  @Override
  @Nullable
  public HackElseifList getElseifList() {
    return findChildByClass(HackElseifList.class);
  }

  @Override
  @Nullable
  public HackInnerStatementList getInnerStatementList() {
    return findChildByClass(HackInnerStatementList.class);
  }

  @Override
  @Nullable
  public HackNewElseSingle getNewElseSingle() {
    return findChildByClass(HackNewElseSingle.class);
  }

  @Override
  @Nullable
  public HackNewElseifList getNewElseifList() {
    return findChildByClass(HackNewElseifList.class);
  }

  @Override
  @NotNull
  public HackParenthesisExpr getParenthesisExpr() {
    return findNotNullChildByClass(HackParenthesisExpr.class);
  }

  @Override
  @Nullable
  public HackStatement getStatement() {
    return findChildByClass(HackStatement.class);
  }

}
