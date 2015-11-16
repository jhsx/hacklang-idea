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

public class HackShapeMemberTypeImpl extends HackTypeImpl implements HackShapeMemberType {

  public HackShapeMemberTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitShapeMemberType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackFullyQualifiedStaticIdentifier getFullyQualifiedStaticIdentifier() {
    return findChildByClass(HackFullyQualifiedStaticIdentifier.class);
  }

  @Override
  @NotNull
  public HackType getType() {
    return findNotNullChildByClass(HackType.class);
  }

}
