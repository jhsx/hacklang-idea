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

public class HackCaseBlockImpl extends ASTWrapperPsiElement implements HackCaseBlock {

  public HackCaseBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitCaseBlock(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackCaseSeparator getCaseSeparator() {
    return findNotNullChildByClass(HackCaseSeparator.class);
  }

  @Override
  @NotNull
  public HackExpr getExpr() {
    return findNotNullChildByClass(HackExpr.class);
  }

  @Override
  @NotNull
  public HackInnerStatementList getInnerStatementList() {
    return findNotNullChildByClass(HackInnerStatementList.class);
  }

}
