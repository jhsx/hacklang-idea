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

public class HackMethodCallExpressionImpl extends HackExpressionImpl implements HackMethodCallExpression {

  public HackMethodCallExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitMethodCallExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpression.class);
  }

  @Override
  @Nullable
  public HackFunctionCallParameterList getFunctionCallParameterList() {
    return findChildByClass(HackFunctionCallParameterList.class);
  }

  @Override
  @Nullable
  public HackHhTypeargsOpt getHhTypeargsOpt() {
    return findChildByClass(HackHhTypeargsOpt.class);
  }

  @Override
  @Nullable
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
  }

}
