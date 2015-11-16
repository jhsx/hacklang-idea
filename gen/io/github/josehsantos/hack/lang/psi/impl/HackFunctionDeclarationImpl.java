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

public class HackFunctionDeclarationImpl extends HackFunctionImpl implements HackFunctionDeclaration {

  public HackFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitFunctionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAttributes getAttributes() {
    return findChildByClass(HackAttributes.class);
  }

  @Override
  @Nullable
  public HackBlock getBlock() {
    return findChildByClass(HackBlock.class);
  }

  @Override
  @NotNull
  public List<HackMemberModifier> getMemberModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberModifier.class);
  }

  @Override
  @NotNull
  public HackNameHolder getNameHolder() {
    return findNotNullChildByClass(HackNameHolder.class);
  }

  @Override
  @NotNull
  public List<HackParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackParameter.class);
  }

  @Override
  @Nullable
  public HackReturnType getReturnType() {
    return findChildByClass(HackReturnType.class);
  }

  @Override
  @Nullable
  public HackTypeVar getTypeVar() {
    return findChildByClass(HackTypeVar.class);
  }

}
