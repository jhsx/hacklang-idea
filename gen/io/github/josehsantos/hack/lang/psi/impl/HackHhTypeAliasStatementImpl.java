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

public class HackHhTypeAliasStatementImpl extends ASTWrapperPsiElement implements HackHhTypeAliasStatement {

  public HackHhTypeAliasStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitHhTypeAliasStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackHhNameWithTypevar getHhNameWithTypevar() {
    return findNotNullChildByClass(HackHhNameWithTypevar.class);
  }

  @Override
  @Nullable
  public HackHhOptConstraint getHhOptConstraint() {
    return findChildByClass(HackHhOptConstraint.class);
  }

  @Override
  @NotNull
  public HackHhType getHhType() {
    return findNotNullChildByClass(HackHhType.class);
  }

}
