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

public class HackHhTypeImpl extends ASTWrapperPsiElement implements HackHhType {

  public HackHhTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassNamespaceStringTypeargs getClassNamespaceStringTypeargs() {
    return findChildByClass(HackClassNamespaceStringTypeargs.class);
  }

  @Override
  @Nullable
  public HackHhFuncTypeList getHhFuncTypeList() {
    return findChildByClass(HackHhFuncTypeList.class);
  }

  @Override
  @Nullable
  public HackHhNonEmptyTypeList getHhNonEmptyTypeList() {
    return findChildByClass(HackHhNonEmptyTypeList.class);
  }

  @Override
  @Nullable
  public HackHhNullType getHhNullType() {
    return findChildByClass(HackHhNullType.class);
  }

  @Override
  @Nullable
  public HackHhShapeType getHhShapeType() {
    return findChildByClass(HackHhShapeType.class);
  }

  @Override
  @Nullable
  public HackHhType getHhType() {
    return findChildByClass(HackHhType.class);
  }

  @Override
  @Nullable
  public HackPossibleComma getPossibleComma() {
    return findChildByClass(HackPossibleComma.class);
  }

}
