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

public class HackStaticShiftExprImpl extends ASTWrapperPsiElement implements HackStaticShiftExpr {

  public HackStaticShiftExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticShiftExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackShiftOperator getShiftOperator() {
    return findNotNullChildByClass(HackShiftOperator.class);
  }

  @Override
  @NotNull
  public List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAdditiveOrConcatenationExpr.class);
  }

  @Override
  @NotNull
  public List<HackStaticMultiplicativeExpr> getStaticMultiplicativeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticMultiplicativeExpr.class);
  }

  @Override
  @NotNull
  public List<HackStaticPrefixExpr> getStaticPrefixExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticPrefixExpr.class);
  }

  @Override
  @Nullable
  public HackStaticShiftExpr getStaticShiftExpr() {
    return findChildByClass(HackStaticShiftExpr.class);
  }

}
