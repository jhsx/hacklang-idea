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

public class HackClassMethodCallImpl extends ASTWrapperPsiElement implements HackClassMethodCall {

  public HackClassMethodCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassMethodCall(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackFunctionCallParameterList getFunctionCallParameterList() {
    return findChildByClass(HackFunctionCallParameterList.class);
  }

  @Override
  @Nullable
  public HackHhTypeargsOpt getHhTypeargsOpt() {
    return findChildByClass(HackHhTypeargsOpt.class);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

  @Override
  @NotNull
  public HackStaticClassName getStaticClassName() {
    return findNotNullChildByClass(HackStaticClassName.class);
  }

  @Override
  @Nullable
  public HackVariableWithoutObjects getVariableWithoutObjects() {
    return findChildByClass(HackVariableWithoutObjects.class);
  }

}
