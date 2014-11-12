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

public class HackClassDeclarationStatementImpl extends ASTWrapperPsiElement implements HackClassDeclarationStatement {

  public HackClassDeclarationStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassDeclarationStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassStatementList getClassStatementList() {
    return findChildByClass(HackClassStatementList.class);
  }

  @Override
  @Nullable
  public HackExtendsFrom getExtendsFrom() {
    return findChildByClass(HackExtendsFrom.class);
  }

  @Override
  @Nullable
  public HackHhTypevar getHhTypevar() {
    return findChildByClass(HackHhTypevar.class);
  }

  @Override
  @Nullable
  public HackIdentifier getIdentifier() {
    return findChildByClass(HackIdentifier.class);
  }

  @Override
  @Nullable
  public HackImplementsList getImplementsList() {
    return findChildByClass(HackImplementsList.class);
  }

  @Override
  @Nullable
  public HackUserAttributes getUserAttributes() {
    return findChildByClass(HackUserAttributes.class);
  }

}
