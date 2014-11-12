// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackNamespaceDeclarationStatement extends PsiElement {

  @NotNull
  List<HackBlockStatement> getBlockStatementList();

  @NotNull
  List<HackBreakStatement> getBreakStatementList();

  @NotNull
  List<HackClassDeclarationStatement> getClassDeclarationStatementList();

  @NotNull
  List<HackConstantDeclarationStatement> getConstantDeclarationStatementList();

  @NotNull
  List<HackContinueStatement> getContinueStatementList();

  @NotNull
  List<HackDeclareStatement> getDeclareStatementList();

  @NotNull
  List<HackDoWhileStatement> getDoWhileStatementList();

  @NotNull
  List<HackEchoStatement> getEchoStatementList();

  @NotNull
  List<HackEnumDeclarationStatement> getEnumDeclarationStatementList();

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
  List<HackHaltCompilerStatement> getHaltCompilerStatementList();

  @NotNull
  List<HackHhNewTypeDeclarationStatement> getHhNewTypeDeclarationStatementList();

  @NotNull
  List<HackHhTypeDeclarationStatement> getHhTypeDeclarationStatementList();

  @NotNull
  List<HackHtmlStatement> getHtmlStatementList();

  @NotNull
  List<HackIfStatement> getIfStatementList();

  @NotNull
  List<HackInterfaceDeclarationStatement> getInterfaceDeclarationStatementList();

  @NotNull
  List<HackLabelStatement> getLabelStatementList();

  @NotNull
  List<HackNamespaceDeclarationStatement> getNamespaceDeclarationStatementList();

  @Nullable
  HackNamespaceName getNamespaceName();

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
  List<HackUseDeclarationStatement> getUseDeclarationStatementList();

  @NotNull
  List<HackWhileStatement> getWhileStatementList();

  @NotNull
  List<HackYieldStatement> getYieldStatementList();

}
