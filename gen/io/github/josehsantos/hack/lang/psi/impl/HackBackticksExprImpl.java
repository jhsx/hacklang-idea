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

public class HackBackticksExprImpl extends HackExprImpl implements HackBackticksExpr {

  public HackBackticksExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitBackticksExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackEncapsList> getEncapsListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEncapsList.class);
  }

}
