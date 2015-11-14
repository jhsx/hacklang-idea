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

public class HackTraitAliasRuleMethodImpl extends HackPsiElementImpl implements HackTraitAliasRuleMethod {

  public HackTraitAliasRuleMethodImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTraitAliasRuleMethod(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackIdentifier getIdentifier() {
    return findNotNullChildByClass(HackIdentifier.class);
  }

  @Override
  @Nullable
  public HackNamespaceName getNamespaceName() {
    return findChildByClass(HackNamespaceName.class);
  }

  @Override
  @Nullable
  public HackTypeargs getTypeargs() {
    return findChildByClass(HackTypeargs.class);
  }

}
