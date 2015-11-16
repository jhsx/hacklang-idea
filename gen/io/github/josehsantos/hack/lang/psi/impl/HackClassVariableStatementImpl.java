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

public class HackClassVariableStatementImpl extends HackStatementImpl implements HackClassVariableStatement {

  public HackClassVariableStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassVariableStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackClassVariableDeclaration getClassVariableDeclaration() {
    return findNotNullChildByClass(HackClassVariableDeclaration.class);
  }

  @Override
  @NotNull
  public List<HackMemberModifier> getMemberModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberModifier.class);
  }

  @Override
  @Nullable
  public HackType getType() {
    return findChildByClass(HackType.class);
  }

}
