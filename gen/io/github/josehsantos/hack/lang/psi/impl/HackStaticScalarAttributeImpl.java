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

public class HackStaticScalarAttributeImpl extends HackPsiElementImpl implements HackStaticScalarAttribute {

  public HackStaticScalarAttributeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticScalarAttribute(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
  }

  @Override
  @Nullable
  public HackLiteralScalarAttribute getLiteralScalarAttribute() {
    return findChildByClass(HackLiteralScalarAttribute.class);
  }

  @Override
  @Nullable
  public HackStaticArrayPairListAttribute getStaticArrayPairListAttribute() {
    return findChildByClass(HackStaticArrayPairListAttribute.class);
  }

  @Override
  @Nullable
  public HackStaticNumericScalarAttribute getStaticNumericScalarAttribute() {
    return findChildByClass(HackStaticNumericScalarAttribute.class);
  }

  @Override
  @Nullable
  public HackStaticShapePairListAttribute getStaticShapePairListAttribute() {
    return findChildByClass(HackStaticShapePairListAttribute.class);
  }

}
