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

public class HackTraitUseDeclarationStatementImpl extends HackStatementImpl implements HackTraitUseDeclarationStatement {

  public HackTraitUseDeclarationStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTraitUseDeclarationStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackTraitAliasRule> getTraitAliasRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTraitAliasRule.class);
  }

  @Override
  @Nullable
  public HackTraitList getTraitList() {
    return findChildByClass(HackTraitList.class);
  }

  @Override
  @NotNull
  public List<HackTraitPrecedenceRule> getTraitPrecedenceRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTraitPrecedenceRule.class);
  }

}
