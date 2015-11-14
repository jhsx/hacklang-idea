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

public class HackXhpAttributeDeclImpl extends HackPsiElementImpl implements HackXhpAttributeDecl {

  public HackXhpAttributeDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitXhpAttributeDecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackXhpAttributeDeclType getXhpAttributeDeclType() {
    return findChildByClass(HackXhpAttributeDeclType.class);
  }

  @Override
  @Nullable
  public HackXhpAttributeDefault getXhpAttributeDefault() {
    return findChildByClass(HackXhpAttributeDefault.class);
  }

  @Override
  @Nullable
  public HackXhpAttributeIsRequired getXhpAttributeIsRequired() {
    return findChildByClass(HackXhpAttributeIsRequired.class);
  }

  @Override
  @Nullable
  public HackXhpIdentifier getXhpIdentifier() {
    return findChildByClass(HackXhpIdentifier.class);
  }

  @Override
  @Nullable
  public HackXhpLabelWs getXhpLabelWs() {
    return findChildByClass(HackXhpLabelWs.class);
  }

}
