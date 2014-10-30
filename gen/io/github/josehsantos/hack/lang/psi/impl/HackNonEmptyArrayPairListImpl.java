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

public class HackNonEmptyArrayPairListImpl extends ASTWrapperPsiElement implements HackNonEmptyArrayPairList {

  public HackNonEmptyArrayPairListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitNonEmptyArrayPairList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpr.class);
  }

  @Override
  @Nullable
  public HackNonEmptyArrayPairList getNonEmptyArrayPairList() {
    return findChildByClass(HackNonEmptyArrayPairList.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

}
