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

public class HackFunctionDeclarationImpl extends HackFunctionImpl implements HackFunctionDeclaration {

  public HackFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitFunctionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackFunctionBody getFunctionBody() {
    return findChildByClass(HackFunctionBody.class);
  }

  @Override
  @Nullable
  public HackMethodModifiers getMethodModifiers() {
    return findChildByClass(HackMethodModifiers.class);
  }

  @Override
  @NotNull
  public HackNameHolder getNameHolder() {
    return findNotNullChildByClass(HackNameHolder.class);
  }

  @Override
  @Nullable
  public HackOptReturnType getOptReturnType() {
    return findChildByClass(HackOptReturnType.class);
  }

  @Override
  @Nullable
  public HackParameterList getParameterList() {
    return findChildByClass(HackParameterList.class);
  }

  @Override
  @Nullable
  public HackTypevar getTypevar() {
    return findChildByClass(HackTypevar.class);
  }

  @Override
  @Nullable
  public HackUserAttributes getUserAttributes() {
    return findChildByClass(HackUserAttributes.class);
  }

}