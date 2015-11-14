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

public class HackStaticScalarAeImpl extends HackPsiElementImpl implements HackStaticScalarAe {

  public HackStaticScalarAeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticScalarAe(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
  }

  @Override
  @Nullable
  public HackLiteralScalarAe getLiteralScalarAe() {
    return findChildByClass(HackLiteralScalarAe.class);
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
