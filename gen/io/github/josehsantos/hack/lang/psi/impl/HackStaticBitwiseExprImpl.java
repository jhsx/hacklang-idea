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

public class HackStaticBitwiseExprImpl extends ASTWrapperPsiElement implements HackStaticBitwiseExpr {

  public HackStaticBitwiseExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticBitwiseExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackBitwiseOperator getBitwiseOperator() {
    return findNotNullChildByClass(HackBitwiseOperator.class);
  }

  @Override
  @NotNull
  public List<HackStaticAdditiveOrConcatenationExpr> getStaticAdditiveOrConcatenationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAdditiveOrConcatenationExpr.class);
  }

  @Override
  @Nullable
  public HackStaticBitwiseExpr getStaticBitwiseExpr() {
    return findChildByClass(HackStaticBitwiseExpr.class);
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
