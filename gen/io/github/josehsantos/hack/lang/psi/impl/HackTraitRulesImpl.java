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

public class HackTraitRulesImpl extends ASTWrapperPsiElement implements HackTraitRules {

  public HackTraitRulesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTraitRules(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackTraitAliasRule getTraitAliasRule() {
    return findChildByClass(HackTraitAliasRule.class);
  }

  @Override
  @Nullable
  public HackTraitPrecedenceRule getTraitPrecedenceRule() {
    return findChildByClass(HackTraitPrecedenceRule.class);
  }

  @Override
  @NotNull
  public HackTraitRules getTraitRules() {
    return findNotNullChildByClass(HackTraitRules.class);
  }

}
