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

public class HackTraitAliasRuleImpl extends ASTWrapperPsiElement implements HackTraitAliasRule {

  public HackTraitAliasRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTraitAliasRule(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

  @Override
  @Nullable
  public HackMethodModifiers getMethodModifiers() {
    return findChildByClass(HackMethodModifiers.class);
  }

  @Override
  @Nullable
  public HackNonEmptyMemberModifiers getNonEmptyMemberModifiers() {
    return findChildByClass(HackNonEmptyMemberModifiers.class);
  }

  @Override
  @NotNull
  public HackTraitAliasRuleMethod getTraitAliasRuleMethod() {
    return findNotNullChildByClass(HackTraitAliasRuleMethod.class);
  }

}
