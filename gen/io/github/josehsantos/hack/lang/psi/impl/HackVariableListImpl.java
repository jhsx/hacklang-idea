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

public class HackVariableListImpl extends ASTWrapperPsiElement implements HackVariableList {

  public HackVariableListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitVariableList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackCallableFunctionCallExpr> getCallableFunctionCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallableFunctionCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackClassMethodCallExpr> getClassMethodCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackClassMethodCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackDimmableVariableAccessExpr> getDimmableVariableAccessExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDimmableVariableAccessExpr.class);
  }

  @Override
  @NotNull
  public List<HackEspecialParenthesisedExpr> getEspecialParenthesisedExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEspecialParenthesisedExpr.class);
  }

  @Override
  @NotNull
  public List<HackMemberVariableExpr> getMemberVariableExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberVariableExpr.class);
  }

  @Override
  @NotNull
  public List<HackMethodCallExpr> getMethodCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMethodCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackSimpleFunctionCallExpr> getSimpleFunctionCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackSimpleFunctionCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackStaticClassVariableExpr> getStaticClassVariableExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticClassVariableExpr.class);
  }

  @Override
  @NotNull
  public List<HackVariableWithoutObjectsExpr> getVariableWithoutObjectsExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVariableWithoutObjectsExpr.class);
  }

}
