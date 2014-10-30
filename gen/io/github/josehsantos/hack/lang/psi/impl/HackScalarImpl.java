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

public class HackScalarImpl extends ASTWrapperPsiElement implements HackScalar {

  public HackScalarImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitScalar(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassConstant getClassConstant() {
    return findChildByClass(HackClassConstant.class);
  }

  @Override
  @Nullable
  public HackCommonScalar getCommonScalar() {
    return findChildByClass(HackCommonScalar.class);
  }

  @Override
  @Nullable
  public HackEncapsList getEncapsList() {
    return findChildByClass(HackEncapsList.class);
  }

  @Override
  @Nullable
  public HackNamespaceString getNamespaceString() {
    return findChildByClass(HackNamespaceString.class);
  }

}
