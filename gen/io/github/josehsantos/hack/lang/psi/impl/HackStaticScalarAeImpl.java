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

public class HackStaticScalarAeImpl extends ASTWrapperPsiElement implements HackStaticScalarAe {

  public HackStaticScalarAeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticScalarAe(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackCommonScalarAe getCommonScalarAe() {
    return findChildByClass(HackCommonScalarAe.class);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

  @Override
  @Nullable
  public HackStaticArrayPairListAe getStaticArrayPairListAe() {
    return findChildByClass(HackStaticArrayPairListAe.class);
  }

  @Override
  @Nullable
  public HackStaticNumericScalarAe getStaticNumericScalarAe() {
    return findChildByClass(HackStaticNumericScalarAe.class);
  }

  @Override
  @Nullable
  public HackStaticShapePairListAe getStaticShapePairListAe() {
    return findChildByClass(HackStaticShapePairListAe.class);
  }

}
