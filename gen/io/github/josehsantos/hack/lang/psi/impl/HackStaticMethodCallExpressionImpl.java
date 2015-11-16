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

public class HackStaticMethodCallExpressionImpl extends HackExpressionImpl implements HackStaticMethodCallExpression {

  public HackStaticMethodCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticMethodCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackCallParameter> getCallParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallParameter.class);
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
  public HackTypeArgs getTypeArgs() {
    return findChildByClass(HackTypeArgs.class);
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
