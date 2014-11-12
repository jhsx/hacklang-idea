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

public class HackNamespaceDeclarationStatementImpl extends ASTWrapperPsiElement implements HackNamespaceDeclarationStatement {

  public HackNamespaceDeclarationStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitNamespaceDeclarationStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackBlockStatement> getBlockStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBlockStatement.class);
  }

  @Override
  @NotNull
  public List<HackBreakStatement> getBreakStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBreakStatement.class);
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
  public List<HackContinueStatement> getContinueStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackContinueStatement.class);
  }

  @Override
  @NotNull
  public List<HackDeclareStatement> getDeclareStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDeclareStatement.class);
  }

  @Override
  @NotNull
  public List<HackDoWhileStatement> getDoWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDoWhileStatement.class);
  }

  @Override
  @NotNull
  public List<HackEchoStatement> getEchoStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEchoStatement.class);
  }

  @Override
  @NotNull
  public List<HackEnumDeclarationStatement> getEnumDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEnumDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackExprStatement> getExprStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExprStatement.class);
  }

  @Override
  @NotNull
  public List<HackForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackForStatement.class);
  }

  @Override
  @NotNull
  public List<HackForeachStatement> getForeachStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackForeachStatement.class);
  }

  @Override
  @NotNull
  public List<HackFunctionDeclarationStatement> getFunctionDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFunctionDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackGlobalStatement> getGlobalStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackGlobalStatement.class);
  }

  @Override
  @NotNull
  public List<HackGotoStatement> getGotoStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackGotoStatement.class);
  }

  @Override
  @NotNull
  public List<HackHaltCompilerStatement> getHaltCompilerStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHaltCompilerStatement.class);
  }

  @Override
  @NotNull
  public List<HackHhNewTypeDeclarationStatement> getHhNewTypeDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhNewTypeDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackHhTypeDeclarationStatement> getHhTypeDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhTypeDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackHtmlStatement> getHtmlStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHtmlStatement.class);
  }

  @Override
  @NotNull
  public List<HackIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackIfStatement.class);
  }

  @Override
  @NotNull
  public List<HackInterfaceDeclarationStatement> getInterfaceDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInterfaceDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackLabelStatement> getLabelStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLabelStatement.class);
  }

  @Override
  @NotNull
  public List<HackNamespaceDeclarationStatement> getNamespaceDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackNamespaceDeclarationStatement.class);
  }

  @Override
  @Nullable
  public HackNamespaceName getNamespaceName() {
    return findChildByClass(HackNamespaceName.class);
  }

  @Override
  @NotNull
  public List<HackReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackReturnStatement.class);
  }

  @Override
  @NotNull
  public List<HackSemicolonStatement> getSemicolonStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackSemicolonStatement.class);
  }

  @Override
  @NotNull
  public List<HackStaticStatement> getStaticStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticStatement.class);
  }

  @Override
  @NotNull
  public List<HackSwitchStatement> getSwitchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackSwitchStatement.class);
  }

  @Override
  @NotNull
  public List<HackThrowStatement> getThrowStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackThrowStatement.class);
  }

  @Override
  @NotNull
  public List<HackTraitDeclarationStatement> getTraitDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTraitDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackTryStatement> getTryStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTryStatement.class);
  }

  @Override
  @NotNull
  public List<HackUnsetStatement> getUnsetStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackUnsetStatement.class);
  }

  @Override
  @NotNull
  public List<HackUseDeclarationStatement> getUseDeclarationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackUseDeclarationStatement.class);
  }

  @Override
  @NotNull
  public List<HackWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackWhileStatement.class);
  }

  @Override
  @NotNull
  public List<HackYieldStatement> getYieldStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackYieldStatement.class);
  }

}
