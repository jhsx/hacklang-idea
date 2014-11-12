// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInnerStatementList extends PsiElement {

  @NotNull
  List<HackBlockStatement> getBlockStatementList();

  @NotNull
  List<HackBreakStatement> getBreakStatementList();

  @NotNull
  List<HackClassDeclarationStatement> getClassDeclarationStatementList();

  @NotNull
  List<HackContinueStatement> getContinueStatementList();

  @NotNull
  List<HackDeclareStatement> getDeclareStatementList();

  @NotNull
  List<HackDoWhileStatement> getDoWhileStatementList();

  @NotNull
  List<HackEchoStatement> getEchoStatementList();

  @NotNull
  List<HackExprStatement> getExprStatementList();

  @NotNull
  List<HackForStatement> getForStatementList();

  @NotNull
  List<HackForeachStatement> getForeachStatementList();

  @NotNull
  List<HackFunctionDeclarationStatement> getFunctionDeclarationStatementList();

  @NotNull
  List<HackGlobalStatement> getGlobalStatementList();

  @NotNull
  List<HackGotoStatement> getGotoStatementList();

  @NotNull
  List<HackHtmlStatement> getHtmlStatementList();

  @NotNull
  List<HackIfStatement> getIfStatementList();

  @NotNull
  List<HackInterfaceDeclarationStatement> getInterfaceDeclarationStatementList();

  @NotNull
  List<HackLabelStatement> getLabelStatementList();

  @NotNull
  List<HackReturnStatement> getReturnStatementList();

  @NotNull
  List<HackSemicolonStatement> getSemicolonStatementList();

  @NotNull
  List<HackStaticStatement> getStaticStatementList();

  @NotNull
  List<HackSwitchStatement> getSwitchStatementList();

  @NotNull
  List<HackThrowStatement> getThrowStatementList();

  @NotNull
  List<HackTraitDeclarationStatement> getTraitDeclarationStatementList();

  @NotNull
  List<HackTryStatement> getTryStatementList();

  @NotNull
  List<HackUnsetStatement> getUnsetStatementList();

  @NotNull
  List<HackWhileStatement> getWhileStatementList();

  @NotNull
  List<HackYieldStatement> getYieldStatementList();

}
