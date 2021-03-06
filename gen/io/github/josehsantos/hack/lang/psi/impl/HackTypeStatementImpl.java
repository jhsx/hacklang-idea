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

public class HackTypeStatementImpl extends HackStatementImpl implements HackTypeStatement {

  public HackTypeStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTypeStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackNameHolder getNameHolder() {
    return findChildByClass(HackNameHolder.class);
  }

  @Override
  @Nullable
  public HackType getType() {
    return findChildByClass(HackType.class);
  }

  @Override
  @Nullable
  public HackTypeVar getTypeVar() {
    return findChildByClass(HackTypeVar.class);
  }

}
