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

public class HackTryStatementImpl extends HackBaseStatementImpl implements HackTryStatement {

  public HackTryStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTryStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackBlockStatement getBlockStatement() {
    return findNotNullChildByClass(HackBlockStatement.class);
  }

  @Override
  @NotNull
  public List<HackTryCatch> getTryCatchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTryCatch.class);
  }

  @Override
  @Nullable
  public HackTryFinally getTryFinally() {
    return findChildByClass(HackTryFinally.class);
  }

}
