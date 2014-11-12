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

public class HackClosureExprImpl extends ASTWrapperPsiElement implements HackClosureExpr {

  public HackClosureExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClosureExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackHhOptReturnType getHhOptReturnType() {
    return findChildByClass(HackHhOptReturnType.class);
  }

  @Override
  @NotNull
  public HackInnerStatementList getInnerStatementList() {
    return findNotNullChildByClass(HackInnerStatementList.class);
  }

  @Override
  @Nullable
  public HackLambdaUseVars getLambdaUseVars() {
    return findChildByClass(HackLambdaUseVars.class);
  }

  @Override
  @NotNull
  public List<HackMemberModifier> getMemberModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberModifier.class);
  }

  @Override
  @NotNull
  public HackParameterList getParameterList() {
    return findNotNullChildByClass(HackParameterList.class);
  }

}
