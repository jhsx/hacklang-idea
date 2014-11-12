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

public class HackStaticVarListImpl extends ASTWrapperPsiElement implements HackStaticVarList {

  public HackStaticVarListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitStaticVarList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackStaticAssignment> getStaticAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticAssignment.class);
  }

}
