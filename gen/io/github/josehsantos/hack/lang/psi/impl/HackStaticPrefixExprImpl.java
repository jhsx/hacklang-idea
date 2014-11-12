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

public class HackStaticPrefixExprImpl extends ASTWrapperPsiElement implements HackStaticPrefixExpr {

  public HackStaticPrefixExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticPrefixExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackLiteralExpr getLiteralExpr() {
    return findChildByClass(HackLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackNamespaceString getNamespaceString() {
    return findChildByClass(HackNamespaceString.class);
  }

  @Override
  @Nullable
  public HackStaticArrayExpr getStaticArrayExpr() {
    return findChildByClass(HackStaticArrayExpr.class);
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
  public HackStaticMapArrayLiteral getStaticMapArrayLiteral() {
    return findChildByClass(HackStaticMapArrayLiteral.class);
  }

  @Override
  @Nullable
  public HackStaticParenthesizedExpr getStaticParenthesizedExpr() {
    return findChildByClass(HackStaticParenthesizedExpr.class);
  }

  @Override
  @Nullable
  public HackStaticPrefixExpr getStaticPrefixExpr() {
    return findChildByClass(HackStaticPrefixExpr.class);
  }

  @Override
  @Nullable
  public HackStaticPrefixOperator getStaticPrefixOperator() {
    return findChildByClass(HackStaticPrefixOperator.class);
  }

  @Override
  @Nullable
  public HackStaticShapeExpr getStaticShapeExpr() {
    return findChildByClass(HackStaticShapeExpr.class);
  }

  @Override
  @Nullable
  public HackStaticVarrayLiteral getStaticVarrayLiteral() {
    return findChildByClass(HackStaticVarrayLiteral.class);
  }

}
