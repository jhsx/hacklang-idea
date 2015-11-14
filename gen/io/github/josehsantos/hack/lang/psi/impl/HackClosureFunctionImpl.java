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

public class HackClosureFunctionImpl extends HackFunctionImpl implements HackClosureFunction {

  public HackClosureFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClosureFunction(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackInnerStatementList getInnerStatementList() {
    return findChildByClass(HackInnerStatementList.class);
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
  @Nullable
  public HackOptReturnType getOptReturnType() {
    return findChildByClass(HackOptReturnType.class);
  }

  @Override
  @Nullable
  public HackParameterList getParameterList() {
    return findChildByClass(HackParameterList.class);
  }

}
