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

public class HackClassStatementImpl extends ASTWrapperPsiElement implements HackClassStatement {

  public HackClassStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackClassVariableDeclaration getClassVariableDeclaration() {
    return findNotNullChildByClass(HackClassVariableDeclaration.class);
  }

  @Override
  @NotNull
  public HackVariableModifiers getVariableModifiers() {
    return findNotNullChildByClass(HackVariableModifiers.class);
  }

}
