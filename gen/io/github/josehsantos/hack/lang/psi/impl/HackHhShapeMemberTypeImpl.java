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

public class HackHhShapeMemberTypeImpl extends ASTWrapperPsiElement implements HackHhShapeMemberType {

  public HackHhShapeMemberTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhShapeMemberType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassNamespaceStringTypeargs getClassNamespaceStringTypeargs() {
    return findChildByClass(HackClassNamespaceStringTypeargs.class);
  }

  @Override
  @NotNull
  public HackHhType getHhType() {
    return findNotNullChildByClass(HackHhType.class);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

}
