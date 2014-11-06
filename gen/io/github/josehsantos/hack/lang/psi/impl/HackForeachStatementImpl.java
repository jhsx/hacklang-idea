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

public class HackForeachStatementImpl extends HackStatementImpl implements HackForeachStatement {

  public HackForeachStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitForeachStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackForeachOptionalArg getForeachOptionalArg() {
    return findChildByClass(HackForeachOptionalArg.class);
  }

  @Override
  @Nullable
  public HackForeachStatementBody getForeachStatementBody() {
    return findChildByClass(HackForeachStatementBody.class);
  }

  @Override
  @Nullable
  public HackForeachVariable getForeachVariable() {
    return findChildByClass(HackForeachVariable.class);
  }

}
