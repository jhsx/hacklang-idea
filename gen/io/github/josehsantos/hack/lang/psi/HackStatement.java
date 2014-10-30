// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStatement extends PsiElement {

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
  HackReturnStatement getReturnStatement();

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
