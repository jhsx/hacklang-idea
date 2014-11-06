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

public class HackHhTypeListImpl extends ASTWrapperPsiElement implements HackHhTypeList {

  public HackHhTypeListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhTypeList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackArrayType> getArrayTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackArrayType.class);
  }

  @Override
  @NotNull
  public List<HackCallableType> getCallableTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallableType.class);
  }

  @Override
  @NotNull
  public List<HackHhFunctionType> getHhFunctionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhFunctionType.class);
  }

  @Override
  @NotNull
  public List<HackHhNullableType> getHhNullableTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhNullableType.class);
  }

  @Override
  @NotNull
  public List<HackHhShapeType> getHhShapeTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhShapeType.class);
  }

  @Override
  @NotNull
  public List<HackHhSoftType> getHhSoftTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhSoftType.class);
  }

  @Override
  @NotNull
  public List<HackHhTupleType> getHhTupleTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhTupleType.class);
  }

  @Override
  @NotNull
  public List<HackHhXhpType> getHhXhpTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackHhXhpType.class);
  }

  @Override
  @NotNull
  public List<HackIdentType> getIdentTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackIdentType.class);
  }

}
