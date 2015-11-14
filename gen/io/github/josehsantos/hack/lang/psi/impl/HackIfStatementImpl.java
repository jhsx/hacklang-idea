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

public class HackIfStatementImpl extends HackBaseStatementImpl implements HackIfStatement {

  public HackIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitIfStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackBaseStatement getBaseStatement() {
    return findChildByClass(HackBaseStatement.class);
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
  @Nullable
  public HackParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(HackParenthesizedExpression.class);
  }

}
