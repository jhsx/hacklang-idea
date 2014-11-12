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

public class HackStaticExprImpl extends ASTWrapperPsiElement implements HackStaticExpr {

  public HackStaticExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackStaticAdditiveOrConcatenationExpr getStaticAdditiveOrConcatenationExpr() {
    return findChildByClass(HackStaticAdditiveOrConcatenationExpr.class);
  }

  @Override
  @Nullable
  public HackStaticBitwiseExpr getStaticBitwiseExpr() {
    return findChildByClass(HackStaticBitwiseExpr.class);
  }

  @Override
  @Nullable
  public HackStaticComparativeExpr getStaticComparativeExpr() {
    return findChildByClass(HackStaticComparativeExpr.class);
  }

  @Override
  @Nullable
  public HackStaticLogicalExpr getStaticLogicalExpr() {
    return findChildByClass(HackStaticLogicalExpr.class);
  }

  @Override
  @Nullable
  public HackStaticMultiplicativeExpr getStaticMultiplicativeExpr() {
    return findChildByClass(HackStaticMultiplicativeExpr.class);
  }

  @Override
  @Nullable
  public HackStaticPrefixExpr getStaticPrefixExpr() {
    return findChildByClass(HackStaticPrefixExpr.class);
  }

  @Override
  @Nullable
  public HackStaticShiftExpr getStaticShiftExpr() {
    return findChildByClass(HackStaticShiftExpr.class);
  }

  @Override
  @Nullable
  public HackStaticTernaryExpr getStaticTernaryExpr() {
    return findChildByClass(HackStaticTernaryExpr.class);
  }

}
