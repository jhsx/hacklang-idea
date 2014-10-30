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

public class HackTryStatementImpl extends ASTWrapperPsiElement implements HackTryStatement {

  public HackTryStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTryStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAdditionalCatches getAdditionalCatches() {
    return findChildByClass(HackAdditionalCatches.class);
  }

  @Override
  @Nullable
  public HackOptionalFinally getOptionalFinally() {
    return findChildByClass(HackOptionalFinally.class);
  }

  @Override
  @Nullable
  public HackTryCatch getTryCatch() {
    return findChildByClass(HackTryCatch.class);
  }

  @Override
  @Nullable
  public HackTryFinally getTryFinally() {
    return findChildByClass(HackTryFinally.class);
  }

  @Override
  @NotNull
  public HackTryStatementList getTryStatementList() {
    return findNotNullChildByClass(HackTryStatementList.class);
  }

}
