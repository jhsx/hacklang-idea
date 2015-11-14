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

public class HackShapePairListImpl extends HackPsiElementImpl implements HackShapePairList {

  public HackShapePairListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitShapePairList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackShapePair> getShapePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShapePair.class);
  }

}
