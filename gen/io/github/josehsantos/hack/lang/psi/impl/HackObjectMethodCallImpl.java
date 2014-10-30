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

public class HackObjectMethodCallImpl extends ASTWrapperPsiElement implements HackObjectMethodCall {

  public HackObjectMethodCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitObjectMethodCall(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackExprWithParens getExprWithParens() {
    return findChildByClass(HackExprWithParens.class);
  }

  @Override
  @NotNull
  public HackFunctionCallParameterList getFunctionCallParameterList() {
    return findNotNullChildByClass(HackFunctionCallParameterList.class);
  }

  @Override
  @Nullable
  public HackHhTypeargsOpt getHhTypeargsOpt() {
    return findChildByClass(HackHhTypeargsOpt.class);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

  @Override
  @Nullable
  public HackVariableWithoutObjects getVariableWithoutObjects() {
    return findChildByClass(HackVariableWithoutObjects.class);
  }

}
