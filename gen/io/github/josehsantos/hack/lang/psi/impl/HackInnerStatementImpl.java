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

public class HackInnerStatementImpl extends ASTWrapperPsiElement implements HackInnerStatement {

  public HackInnerStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitInnerStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassDeclarationStatement getClassDeclarationStatement() {
    return findChildByClass(HackClassDeclarationStatement.class);
  }

  @Override
  @Nullable
  public HackFunctionDeclarationStatement getFunctionDeclarationStatement() {
    return findChildByClass(HackFunctionDeclarationStatement.class);
  }

  @Override
  @Nullable
  public HackStatement getStatement() {
    return findChildByClass(HackStatement.class);
  }

  @Override
  @Nullable
  public HackTraitDeclarationStatement getTraitDeclarationStatement() {
    return findChildByClass(HackTraitDeclarationStatement.class);
  }

}
