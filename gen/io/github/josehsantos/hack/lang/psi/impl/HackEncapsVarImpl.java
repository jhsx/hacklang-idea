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

public class HackEncapsVarImpl extends HackPsiElementImpl implements HackEncapsVar {

  public HackEncapsVarImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitEncapsVar(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackEncapsBraceExpression getEncapsBraceExpression() {
    return findChildByClass(HackEncapsBraceExpression.class);
  }

  @Override
  @Nullable
  public HackEncapsBraceIndexOffsetExpression getEncapsBraceIndexOffsetExpression() {
    return findChildByClass(HackEncapsBraceIndexOffsetExpression.class);
  }

  @Override
  @Nullable
  public HackEncapsExpression getEncapsExpression() {
    return findChildByClass(HackEncapsExpression.class);
  }

  @Override
  @Nullable
  public HackEncapsFieldAccessExpression getEncapsFieldAccessExpression() {
    return findChildByClass(HackEncapsFieldAccessExpression.class);
  }

  @Override
  @Nullable
  public HackEncapsIndexOffsetExpression getEncapsIndexOffsetExpression() {
    return findChildByClass(HackEncapsIndexOffsetExpression.class);
  }

  @Override
  @Nullable
  public HackVariableIdentifier getVariableIdentifier() {
    return findChildByClass(HackVariableIdentifier.class);
  }

}
