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

public class HackStaticComparativeExprImpl extends ASTWrapperPsiElement implements HackStaticComparativeExpr {

  public HackStaticComparativeExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticComparativeExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackComparativeOperator getComparativeOperator() {
    return findNotNullChildByClass(HackComparativeOperator.class);
  }

  @Override
  @NotNull
  public List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAdditiveOrConcatenationExpr.class);
  }

  @Override
  @NotNull
  public List<HackStaticBitwiseExpr> getStaticBitwiseExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticBitwiseExpr.class);
  }

  @Override
  @Nullable
  public HackStaticComparativeExpr getStaticComparativeExpr() {
    return findChildByClass(HackStaticComparativeExpr.class);
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
  @NotNull
  public List<HackStaticShiftExpr> getStaticShiftExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticShiftExpr.class);
  }

}
