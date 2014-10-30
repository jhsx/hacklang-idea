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

public class HackTopStatementListImpl extends ASTWrapperPsiElement implements HackTopStatementList {

  public HackTopStatementListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTopStatementList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackClassDeclarationStatement> getClassDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackClassDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackConstantDeclarationStatement> getConstantDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackConstantDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackEnumDeclarationStatement> getEnumDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEnumDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackFunctionDeclarationStatement> getFunctionDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFunctionDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackHaltCompilerStatement> getHaltCompilerStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHaltCompilerStatement.class);
  }

  @Override
  @NotNull
  public List<HackHhTypeAliasStatement> getHhTypeAliasStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhTypeAliasStatement.class);
  }

  @Override
  @NotNull
  public List<HackNamespaceStatement> getNamespaceStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackNamespaceStatement.class);
  }

  @Override
  @NotNull
  public List<HackStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStatement.class);
  }

  @Override
  @NotNull
  public List<HackTraitDeclarationStatement> getTraitDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTraitDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackUseStatement> getUseStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackUseStatement.class);
  }

}
