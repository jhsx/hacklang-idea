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

public class HackExprNoVariableImpl extends ASTWrapperPsiElement implements HackExprNoVariable {

  public HackExprNoVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitExprNoVariable(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackArrayLiteral getArrayLiteral() {
    return findChildByClass(HackArrayLiteral.class);
  }

  @Override
  @Nullable
  public HackAssignmentList getAssignmentList() {
    return findChildByClass(HackAssignmentList.class);
  }

  @Override
  @Nullable
  public HackBackticksExpr getBackticksExpr() {
    return findChildByClass(HackBackticksExpr.class);
  }

  @Override
  @Nullable
  public HackClassNameReference getClassNameReference() {
    return findChildByClass(HackClassNameReference.class);
  }

  @Override
  @Nullable
  public HackClosureExpression getClosureExpression() {
    return findChildByClass(HackClosureExpression.class);
  }

  @Override
  @Nullable
  public HackCtorArguments getCtorArguments() {
    return findChildByClass(HackCtorArguments.class);
  }

  @Override
  @Nullable
  public HackDimExpr getDimExpr() {
    return findChildByClass(HackDimExpr.class);
  }

  @Override
  @Nullable
  public HackExitExpr getExitExpr() {
    return findChildByClass(HackExitExpr.class);
  }

  @Override
  @Nullable
  public HackExpr getExpr() {
    return findChildByClass(HackExpr.class);
  }

  @Override
  @Nullable
  public HackExprNoVariable getExprNoVariable() {
    return findChildByClass(HackExprNoVariable.class);
  }

  @Override
  @Nullable
  public HackInternalFunctions getInternalFunctions() {
    return findChildByClass(HackInternalFunctions.class);
  }

  @Override
  @Nullable
  public HackLambdaExpression getLambdaExpression() {
    return findChildByClass(HackLambdaExpression.class);
  }

  @Override
  @Nullable
  public HackMapArrayLiteral getMapArrayLiteral() {
    return findChildByClass(HackMapArrayLiteral.class);
  }

  @Override
  @Nullable
  public HackScalar getScalar() {
    return findChildByClass(HackScalar.class);
  }

  @Override
  @Nullable
  public HackShapeLiteral getShapeLiteral() {
    return findChildByClass(HackShapeLiteral.class);
  }

  @Override
  @Nullable
  public HackVariable getVariable() {
    return findChildByClass(HackVariable.class);
  }

  @Override
  @Nullable
  public HackVarrayLiteral getVarrayLiteral() {
    return findChildByClass(HackVarrayLiteral.class);
  }

}
