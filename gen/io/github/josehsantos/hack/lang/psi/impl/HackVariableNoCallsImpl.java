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

public class HackVariableNoCallsImpl extends ASTWrapperPsiElement implements HackVariableNoCalls {

  public HackVariableNoCallsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitVariableNoCalls(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackDimmableVariableNoCallsAccess getDimmableVariableNoCallsAccess() {
    return findChildByClass(HackDimmableVariableNoCallsAccess.class);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackPropertyAccess getPropertyAccess() {
    return findChildByClass(HackPropertyAccess.class);
  }

  @Override
  @Nullable
  public HackStaticClassName getStaticClassName() {
    return findChildByClass(HackStaticClassName.class);
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

  @Override
  @Nullable
  public HackVariableWithoutObjects getVariableWithoutObjects() {
    return findChildByClass(HackVariableWithoutObjects.class);
  }

}
