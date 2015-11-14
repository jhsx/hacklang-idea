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

public class HackClassMethodCallExpressionImpl extends HackExpressionImpl implements HackClassMethodCallExpression {

  public HackClassMethodCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassMethodCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackFunctionCallParameterList getFunctionCallParameterList() {
    return findNotNullChildByClass(HackFunctionCallParameterList.class);
  }

  @Override
  @Nullable
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
  }

  @Override
  @NotNull
  public HackStaticClassName getStaticClassName() {
    return findNotNullChildByClass(HackStaticClassName.class);
  }

  @Override
  @Nullable
  public HackTypeargs getTypeargs() {
    return findChildByClass(HackTypeargs.class);
  }

  @Override
  @Nullable
  public HackVariableExpression getVariableExpression() {
    return findChildByClass(HackVariableExpression.class);
  }

  @Override
  @Nullable
  public HackVariableExpressionVariable getVariableExpressionVariable() {
    return findChildByClass(HackVariableExpressionVariable.class);
  }

}
