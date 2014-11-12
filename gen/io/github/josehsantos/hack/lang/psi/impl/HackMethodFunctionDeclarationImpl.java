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

public class HackMethodFunctionDeclarationImpl extends HackFunctionDeclarationStatementImpl implements HackMethodFunctionDeclaration {

  public HackMethodFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitMethodFunctionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackFunctionBody getFunctionBody() {
    return findNotNullChildByClass(HackFunctionBody.class);
  }

  @Override
  @Nullable
  public HackHhOptReturnType getHhOptReturnType() {
    return findChildByClass(HackHhOptReturnType.class);
  }

  @Override
  @Nullable
  public HackHhTypevar getHhTypevar() {
    return findChildByClass(HackHhTypevar.class);
  }

  @Override
  @NotNull
  public HackIdentifier getIdentifier() {
    return findNotNullChildByClass(HackIdentifier.class);
  }

  @Override
  @Nullable
  public HackMethodModifiers getMethodModifiers() {
    return findChildByClass(HackMethodModifiers.class);
  }

  @Override
  @NotNull
  public HackParameterList getParameterList() {
    return findNotNullChildByClass(HackParameterList.class);
  }

  @Override
  @Nullable
  public HackUserAttributes getUserAttributes() {
    return findChildByClass(HackUserAttributes.class);
  }

}
