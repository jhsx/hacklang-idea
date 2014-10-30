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

public class HackDimmableVariableNoCallsImpl extends ASTWrapperPsiElement implements HackDimmableVariableNoCalls {

  public HackDimmableVariableNoCallsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitDimmableVariableNoCalls(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackDimmableVariableNoCallsAccess getDimmableVariableNoCallsAccess() {
    return findChildByClass(HackDimmableVariableNoCallsAccess.class);
  }

  @Override
  @Nullable
  public HackExprWithParens getExprWithParens() {
    return findChildByClass(HackExprWithParens.class);
  }

  @Override
  @Nullable
  public HackPropertyAccessWithoutVariables getPropertyAccessWithoutVariables() {
    return findChildByClass(HackPropertyAccessWithoutVariables.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

  @Override
  @Nullable
  public HackVariableNoCalls getVariableNoCalls() {
    return findChildByClass(HackVariableNoCalls.class);
  }

}
