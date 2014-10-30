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

public class HackHhTypevarListImpl extends ASTWrapperPsiElement implements HackHhTypevarList {

  public HackHhTypevarListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhTypevarList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackHhType getHhType() {
    return findChildByClass(HackHhType.class);
  }

  @Override
  @Nullable
  public HackHhTypevarList getHhTypevarList() {
    return findChildByClass(HackHhTypevarList.class);
  }

  @Override
  @NotNull
  public HackHhTypevarVariance getHhTypevarVariance() {
    return findNotNullChildByClass(HackHhTypevarVariance.class);
  }

  @Override
  @NotNull
  public HackIdent getIdent() {
    return findNotNullChildByClass(HackIdent.class);
  }

}
