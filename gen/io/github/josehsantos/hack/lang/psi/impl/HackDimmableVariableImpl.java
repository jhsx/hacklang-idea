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

public class HackDimmableVariableImpl extends ASTWrapperPsiElement implements HackDimmableVariable {

  public HackDimmableVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitDimmableVariable(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackCallableVariable getCallableVariable() {
    return findChildByClass(HackCallableVariable.class);
  }

  @Override
  @Nullable
  public HackClassMethodCall getClassMethodCall() {
    return findChildByClass(HackClassMethodCall.class);
  }

  @Override
  @Nullable
  public HackDimmableVariableAccess getDimmableVariableAccess() {
    return findChildByClass(HackDimmableVariableAccess.class);
  }

  @Override
  @Nullable
  public HackExprWithParens getExprWithParens() {
    return findChildByClass(HackExprWithParens.class);
  }

  @Override
  @Nullable
  public HackFunctionCallParameterList getFunctionCallParameterList() {
    return findChildByClass(HackFunctionCallParameterList.class);
  }

  @Override
  @Nullable
  public HackObjectMethodCall getObjectMethodCall() {
    return findChildByClass(HackObjectMethodCall.class);
  }

  @Override
  @Nullable
  public HackPropertyAccessWithoutVariables getPropertyAccessWithoutVariables() {
    return findChildByClass(HackPropertyAccessWithoutVariables.class);
  }

  @Override
  @Nullable
  public HackSimpleFunctionCall getSimpleFunctionCall() {
    return findChildByClass(HackSimpleFunctionCall.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

}
