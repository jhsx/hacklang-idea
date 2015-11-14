// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import io.github.josehsantos.hack.lang.psi.*;

public class HackScalarExpressionImpl extends HackExpressionImpl implements HackScalarExpression {

  public HackScalarExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitScalarExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassConstant getClassConstant() {
    return findChildByClass(HackClassConstant.class);
  }

  @Override
  @Nullable
  public HackDoubleQuotesString getDoubleQuotesString() {
    return findChildByClass(HackDoubleQuotesString.class);
  }

  @Override
  @Nullable
  public HackHereDocString getHereDocString() {
    return findChildByClass(HackHereDocString.class);
  }

  @Override
  @Nullable
  public HackLiteralExpression getLiteralExpression() {
    return findChildByClass(HackLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackNamespaceString getNamespaceString() {
    return findChildByClass(HackNamespaceString.class);
  }

  @Override
  @Nullable
  public HackSingleQuotesString getSingleQuotesString() {
    return findChildByClass(HackSingleQuotesString.class);
  }

}
