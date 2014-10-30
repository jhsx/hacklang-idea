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
  public HackCommonScalar getCommonScalar() {
    return findChildByClass(HackCommonScalar.class);
  }

  @Override
  @Nullable
  public HackNamespaceString getNamespaceString() {
    return findChildByClass(HackNamespaceString.class);
  }

  @Override
  @Nullable
  public HackStaticArrayPairList getStaticArrayPairList() {
    return findChildByClass(HackStaticArrayPairList.class);
  }

  @Override
  @Nullable
  public HackStaticClassConstant getStaticClassConstant() {
    return findChildByClass(HackStaticClassConstant.class);
  }

  @Override
  @Nullable
  public HackStaticCollectionLiteral getStaticCollectionLiteral() {
    return findChildByClass(HackStaticCollectionLiteral.class);
  }

  @Override
  @Nullable
  public HackStaticExpr getStaticExpr() {
    return findChildByClass(HackStaticExpr.class);
  }

  @Override
  @Nullable
  public HackStaticMapArrayLiteral getStaticMapArrayLiteral() {
    return findChildByClass(HackStaticMapArrayLiteral.class);
  }

  @Override
  @Nullable
  public HackStaticShapePairList getStaticShapePairList() {
    return findChildByClass(HackStaticShapePairList.class);
  }

  @Override
  @Nullable
  public HackStaticVarrayLiteral getStaticVarrayLiteral() {
    return findChildByClass(HackStaticVarrayLiteral.class);
  }

}
