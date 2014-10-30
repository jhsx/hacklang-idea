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

public class HackNonEmptyStaticShapePairListAeImpl extends ASTWrapperPsiElement implements HackNonEmptyStaticShapePairListAe {

  public HackNonEmptyStaticShapePairListAeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitNonEmptyStaticShapePairListAe(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackNonEmptyStaticShapePairListAe getNonEmptyStaticShapePairListAe() {
    return findChildByClass(HackNonEmptyStaticShapePairListAe.class);
  }

  @Override
  @NotNull
  public HackShapeKeyname getShapeKeyname() {
    return findNotNullChildByClass(HackShapeKeyname.class);
  }

  @Override
  @NotNull
  public HackStaticScalarAe getStaticScalarAe() {
    return findNotNullChildByClass(HackStaticScalarAe.class);
  }

}
