// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTopStatementList extends PsiElement {

  @NotNull
  List<HackClassDeclarationStatement> getClassDeclarationStatementList();

  @NotNull
  List<HackConstantDeclarationStatement> getConstantDeclarationStatementList();

  @NotNull
  List<HackEnumDeclarationStatement> getEnumDeclarationStatementList();

  @NotNull
  List<HackFunctionDeclarationStatement> getFunctionDeclarationStatementList();

  @NotNull
  List<HackHaltCompilerStatement> getHaltCompilerStatementList();

  @NotNull
  List<HackHhTypeAliasStatement> getHhTypeAliasStatementList();

  @NotNull
  List<HackNamespaceStatement> getNamespaceStatementList();

  @NotNull
  List<HackStatement> getStatementList();

  @NotNull
  List<HackTraitDeclarationStatement> getTraitDeclarationStatementList();

  @NotNull
  List<HackUseStatement> getUseStatementList();

}
