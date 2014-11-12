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

public class HackEspecialParenthesisedExprImpl extends ASTWrapperPsiElement implements HackEspecialParenthesisedExpr {

  public HackEspecialParenthesisedExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitEspecialParenthesisedExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackCloneExpr getCloneExpr() {
    return findChildByClass(HackCloneExpr.class);
  }

  @Override
  @Nullable
  public HackCollectionLiteralExpr getCollectionLiteralExpr() {
    return findChildByClass(HackCollectionLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpr getEspecialParenthesisedExpr() {
    return findChildByClass(HackEspecialParenthesisedExpr.class);
  }

  @Override
  @Nullable
  public HackNewExpr getNewExpr() {
    return findChildByClass(HackNewExpr.class);
  }

  @Override
  @Nullable
  public HackXhpExpr getXhpExpr() {
    return findChildByClass(HackXhpExpr.class);
  }

}
