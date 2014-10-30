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

public class HackStatementImpl extends ASTWrapperPsiElement implements HackStatement {

  public HackStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackBreakStatement getBreakStatement() {
    return findChildByClass(HackBreakStatement.class);
  }

  @Override
  @Nullable
  public HackContinueStatement getContinueStatement() {
    return findChildByClass(HackContinueStatement.class);
  }

  @Override
  @Nullable
  public HackDeclareStatement getDeclareStatement() {
    return findChildByClass(HackDeclareStatement.class);
  }

  @Override
  @Nullable
  public HackDoWhileStatement getDoWhileStatement() {
    return findChildByClass(HackDoWhileStatement.class);
  }

  @Override
  @Nullable
  public HackEchoStatement getEchoStatement() {
    return findChildByClass(HackEchoStatement.class);
  }

  @Override
  @Nullable
  public HackExprStatement getExprStatement() {
    return findChildByClass(HackExprStatement.class);
  }

  @Override
  @Nullable
  public HackForStatement getForStatement() {
    return findChildByClass(HackForStatement.class);
  }

  @Override
  @Nullable
  public HackForeachStatement getForeachStatement() {
    return findChildByClass(HackForeachStatement.class);
  }

  @Override
  @Nullable
  public HackGlobalStatement getGlobalStatement() {
    return findChildByClass(HackGlobalStatement.class);
  }

  @Override
  @Nullable
  public HackGotoStatement getGotoStatement() {
    return findChildByClass(HackGotoStatement.class);
  }

  @Override
  @Nullable
  public HackHtmlStatement getHtmlStatement() {
    return findChildByClass(HackHtmlStatement.class);
  }

  @Override
  @Nullable
  public HackIfStatement getIfStatement() {
    return findChildByClass(HackIfStatement.class);
  }

  @Override
  @Nullable
  public HackInnerStatementList getInnerStatementList() {
    return findChildByClass(HackInnerStatementList.class);
  }

  @Override
  @Nullable
  public HackLabelStatement getLabelStatement() {
    return findChildByClass(HackLabelStatement.class);
  }

  @Override
  @Nullable
  public HackReturnStatement getReturnStatement() {
    return findChildByClass(HackReturnStatement.class);
  }

  @Override
  @Nullable
  public HackStaticStatement getStaticStatement() {
    return findChildByClass(HackStaticStatement.class);
  }

  @Override
  @Nullable
  public HackSwitchStatement getSwitchStatement() {
    return findChildByClass(HackSwitchStatement.class);
  }

  @Override
  @Nullable
  public HackThrowStatement getThrowStatement() {
    return findChildByClass(HackThrowStatement.class);
  }

  @Override
  @Nullable
  public HackTryStatement getTryStatement() {
    return findChildByClass(HackTryStatement.class);
  }

  @Override
  @Nullable
  public HackUnsetStatement getUnsetStatement() {
    return findChildByClass(HackUnsetStatement.class);
  }

  @Override
  @Nullable
  public HackWhileStatement getWhileStatement() {
    return findChildByClass(HackWhileStatement.class);
  }

  @Override
  @Nullable
  public HackYieldStatement getYieldStatement() {
    return findChildByClass(HackYieldStatement.class);
  }

}
