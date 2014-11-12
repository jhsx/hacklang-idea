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

public class HackAwaitAssignExprImpl extends ASTWrapperPsiElement implements HackAwaitAssignExpr {

  public HackAwaitAssignExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitAwaitAssignExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAwaitExpr getAwaitExpr() {
    return findChildByClass(HackAwaitExpr.class);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpr getCallableFunctionCallExpr() {
    return findChildByClass(HackCallableFunctionCallExpr.class);
  }

  @Override
  @Nullable
  public HackClassMethodCallExpr getClassMethodCallExpr() {
    return findChildByClass(HackClassMethodCallExpr.class);
  }

  @Override
  @Nullable
  public HackDimmableVariableAccessExpr getDimmableVariableAccessExpr() {
    return findChildByClass(HackDimmableVariableAccessExpr.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpr getEspecialParenthesisedExpr() {
    return findChildByClass(HackEspecialParenthesisedExpr.class);
  }

  @Override
  @Nullable
  public HackMemberVariableExpr getMemberVariableExpr() {
    return findChildByClass(HackMemberVariableExpr.class);
  }

  @Override
  @Nullable
  public HackMethodCallExpr getMethodCallExpr() {
    return findChildByClass(HackMethodCallExpr.class);
  }

  @Override
  @Nullable
  public HackSimpleFunctionCallExpr getSimpleFunctionCallExpr() {
    return findChildByClass(HackSimpleFunctionCallExpr.class);
  }

  @Override
  @Nullable
  public HackStaticClassVariableExpr getStaticClassVariableExpr() {
    return findChildByClass(HackStaticClassVariableExpr.class);
  }

  @Override
  @Nullable
  public HackVariableWithoutObjectsExpr getVariableWithoutObjectsExpr() {
    return findChildByClass(HackVariableWithoutObjectsExpr.class);
  }

}
