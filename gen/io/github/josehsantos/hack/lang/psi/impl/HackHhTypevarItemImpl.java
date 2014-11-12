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

public class HackHhTypevarItemImpl extends ASTWrapperPsiElement implements HackHhTypevarItem {

  public HackHhTypevarItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhTypevarItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackArrayType getArrayType() {
    return findChildByClass(HackArrayType.class);
  }

  @Override
  @Nullable
  public HackCallableType getCallableType() {
    return findChildByClass(HackCallableType.class);
  }

  @Override
  @Nullable
  public HackHhFunctionType getHhFunctionType() {
    return findChildByClass(HackHhFunctionType.class);
  }

  @Override
  @Nullable
  public HackHhNullableType getHhNullableType() {
    return findChildByClass(HackHhNullableType.class);
  }

  @Override
  @Nullable
  public HackHhShapeType getHhShapeType() {
    return findChildByClass(HackHhShapeType.class);
  }

  @Override
  @Nullable
  public HackHhSoftType getHhSoftType() {
    return findChildByClass(HackHhSoftType.class);
  }

  @Override
  @Nullable
  public HackHhTupleType getHhTupleType() {
    return findChildByClass(HackHhTupleType.class);
  }

  @Override
  @Nullable
  public HackHhTypevarVariance getHhTypevarVariance() {
    return findChildByClass(HackHhTypevarVariance.class);
  }

  @Override
  @Nullable
  public HackHhXhpType getHhXhpType() {
    return findChildByClass(HackHhXhpType.class);
  }

  @Override
  @Nullable
  public HackIdentType getIdentType() {
    return findChildByClass(HackIdentType.class);
  }

  @Override
  @NotNull
  public HackIdentifier getIdentifier() {
    return findNotNullChildByClass(HackIdentifier.class);
  }

}
