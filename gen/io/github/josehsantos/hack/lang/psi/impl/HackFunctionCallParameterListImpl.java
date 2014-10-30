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

public class HackFunctionCallParameterListImpl extends ASTWrapperPsiElement implements HackFunctionCallParameterList {

  public HackFunctionCallParameterListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitFunctionCallParameterList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HackHhPossibleComma getHhPossibleComma() {
    return findNotNullChildByClass(HackHhPossibleComma.class);
  }

  @Override
  @NotNull
  public HackNonEmptyFcallParameterList getNonEmptyFcallParameterList() {
    return findNotNullChildByClass(HackNonEmptyFcallParameterList.class);
  }

}