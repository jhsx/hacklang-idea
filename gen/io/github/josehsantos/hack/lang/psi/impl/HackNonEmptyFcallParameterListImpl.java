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

public class HackNonEmptyFcallParameterListImpl extends ASTWrapperPsiElement implements HackNonEmptyFcallParameterList {

  public HackNonEmptyFcallParameterListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitNonEmptyFcallParameterList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackNonEmptyFcallParameterList getNonEmptyFcallParameterList() {
    return findChildByClass(HackNonEmptyFcallParameterList.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

}
