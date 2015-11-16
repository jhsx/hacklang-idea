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

public class HackClassDeclarationImpl extends HackPsiElementImpl implements HackClassDeclaration {

  public HackClassDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAttributes getAttributes() {
    return findChildByClass(HackAttributes.class);
  }

  @Override
  @Nullable
  public HackClassBlock getClassBlock() {
    return findChildByClass(HackClassBlock.class);
  }

  @Override
  @Nullable
  public HackExtends getExtends() {
    return findChildByClass(HackExtends.class);
  }

  @Override
  @Nullable
  public HackImplements getImplements() {
    return findChildByClass(HackImplements.class);
  }

  @Override
  @Nullable
  public HackNameHolder getNameHolder() {
    return findChildByClass(HackNameHolder.class);
  }

  @Override
  @Nullable
  public HackTypeVar getTypeVar() {
    return findChildByClass(HackTypeVar.class);
  }

  @Override
  @Nullable
  public HackXhpNameHolder getXhpNameHolder() {
    return findChildByClass(HackXhpNameHolder.class);
  }

}
