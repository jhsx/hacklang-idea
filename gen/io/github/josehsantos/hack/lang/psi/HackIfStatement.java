// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackIfStatement extends PsiElement {

  @Nullable
  HackBlockStatement getBlockStatement();

  @Nullable
  HackBreakStatement getBreakStatement();

  @Nullable
  HackContinueStatement getContinueStatement();

  @Nullable
  HackDeclareStatement getDeclareStatement();

  @Nullable
  HackDoWhileStatement getDoWhileStatement();

  @Nullable
  HackEchoStatement getEchoStatement();

  @Nullable
  HackElseSingle getElseSingle();

  @Nullable
  HackElseifList getElseifList();

  @Nullable
  HackExprStatement getExprStatement();

  @Nullable
  HackForStatement getForStatement();

  @Nullable
  HackForeachStatement getForeachStatement();

  @Nullable
  HackGlobalStatement getGlobalStatement();

  @Nullable
  HackGotoStatement getGotoStatement();

  @Nullable
  HackHtmlStatement getHtmlStatement();

  @Nullable
  HackIfStatement getIfStatement();

  @Nullable
  HackInnerStatementList getInnerStatementList();

  @Nullable
  HackLabelStatement getLabelStatement();

  @Nullable
  HackNewElseSingle getNewElseSingle();

  @Nullable
  HackNewElseifList getNewElseifList();

  @Nullable
  HackParenthesizedExpr getParenthesizedExpr();

  @Nullable
  HackReturnStatement getReturnStatement();

  @Nullable
  HackSemicolonStatement getSemicolonStatement();

  @Nullable
  HackStaticStatement getStaticStatement();

  @Nullable
  HackSwitchStatement getSwitchStatement();

  @Nullable
  HackThrowStatement getThrowStatement();

  @Nullable
  HackTryStatement getTryStatement();

  @Nullable
  HackUnsetStatement getUnsetStatement();

  @Nullable
  HackWhileStatement getWhileStatement();

  @Nullable
  HackYieldStatement getYieldStatement();

}
