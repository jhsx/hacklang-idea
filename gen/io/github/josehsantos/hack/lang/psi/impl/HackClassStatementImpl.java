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

public class HackClassStatementImpl extends HackStatementImpl implements HackClassStatement {

  public HackClassStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassVariableDeclarations getClassVariableDeclarations() {
    return findChildByClass(HackClassVariableDeclarations.class);
  }

  @Override
  @Nullable
  public HackConstantDeclaration getConstantDeclaration() {
    return findChildByClass(HackConstantDeclaration.class);
  }

  @Override
  @Nullable
  public HackTraitRequireDeclaration getTraitRequireDeclaration() {
    return findChildByClass(HackTraitRequireDeclaration.class);
  }

  @Override
  @Nullable
  public HackTraitUseDeclaration getTraitUseDeclaration() {
    return findChildByClass(HackTraitUseDeclaration.class);
  }

  @Override
  @Nullable
  public HackXhpAttributeDeclaration getXhpAttributeDeclaration() {
    return findChildByClass(HackXhpAttributeDeclaration.class);
  }

  @Override
  @Nullable
  public HackXhpCategoryDeclaration getXhpCategoryDeclaration() {
    return findChildByClass(HackXhpCategoryDeclaration.class);
  }

  @Override
  @Nullable
  public HackXhpChildrenDeclaration getXhpChildrenDeclaration() {
    return findChildByClass(HackXhpChildrenDeclaration.class);
  }

}
