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

public class HackDimmableVariableAccessExpressionImpl extends HackExpressionImpl implements HackDimmableVariableAccessExpression {

  public HackDimmableVariableAccessExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitDimmableVariableAccessExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackArrayAccess> getArrayAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackArrayAccess.class);
  }

  @Override
  @Nullable
  public HackCloneExpression getCloneExpression() {
    return findChildByClass(HackCloneExpression.class);
  }

  @Override
  @Nullable
  public HackCollectionLiteralExpression getCollectionLiteralExpression() {
    return findChildByClass(HackCollectionLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpression getEspecialParenthesisedExpression() {
    return findChildByClass(HackEspecialParenthesisedExpression.class);
  }

  @Override
  @Nullable
  public HackNewExpression getNewExpression() {
    return findChildByClass(HackNewExpression.class);
  }

  @Override
  @Nullable
  public HackXhpExpression getXhpExpression() {
    return findChildByClass(HackXhpExpression.class);
  }

}
