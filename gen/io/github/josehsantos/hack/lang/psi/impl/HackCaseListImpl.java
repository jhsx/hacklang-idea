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

public class HackCaseListImpl extends HackPsiElementImpl implements HackCaseList {

  public HackCaseListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitCaseList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackCaseBlock> getCaseBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCaseBlock.class);
  }

  @Override
  @NotNull
  public List<HackDefaultCaseBlock> getDefaultCaseBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDefaultCaseBlock.class);
  }

}
