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

public class HackClassNameReferenceImpl extends HackPsiElementImpl implements HackClassNameReference {

  public HackClassNameReferenceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitClassNameReference(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpression getCallableFunctionCallExpression() {
    return findChildByClass(HackCallableFunctionCallExpression.class);
  }

  @Override
  @Nullable
  public HackClassMethodCallExpression getClassMethodCallExpression() {
    return findChildByClass(HackClassMethodCallExpression.class);
  }

  @Override
  @Nullable
  public HackCloneExpression getCloneExpression() {
    return findChildByClass(HackCloneExpression.class);
  }

  @Override
  @Nullable
  public HackCollectionLiteralExpression getCollectionLiteralExpression() {
    return findChildByClass(HackCollectionLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackDimmableVariableAccessExpression getDimmableVariableAccessExpression() {
    return findChildByClass(HackDimmableVariableAccessExpression.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpression getEspecialParenthesisedExpression() {
    return findChildByClass(HackEspecialParenthesisedExpression.class);
  }

  @Override
  @Nullable
  public HackFullyQualifiedClassName getFullyQualifiedClassName() {
    return findChildByClass(HackFullyQualifiedClassName.class);
  }

  @Override
  @Nullable
  public HackMemberOnlyAccessExpression getMemberOnlyAccessExpression() {
    return findChildByClass(HackMemberOnlyAccessExpression.class);
  }

  @Override
  @Nullable
  public HackMemberVariableExpression getMemberVariableExpression() {
    return findChildByClass(HackMemberVariableExpression.class);
  }

  @Override
  @Nullable
  public HackMethodCallExpression getMethodCallExpression() {
    return findChildByClass(HackMethodCallExpression.class);
  }

  @Override
  @Nullable
  public HackNewExpression getNewExpression() {
    return findChildByClass(HackNewExpression.class);
  }

  @Override
  @Nullable
  public HackSimpleFunctionCallExpression getSimpleFunctionCallExpression() {
    return findChildByClass(HackSimpleFunctionCallExpression.class);
  }

  @Override
  @Nullable
  public HackStaticClassVariableExpression getStaticClassVariableExpression() {
    return findChildByClass(HackStaticClassVariableExpression.class);
  }

  @Override
  @Nullable
  public HackVariableExpression getVariableExpression() {
    return findChildByClass(HackVariableExpression.class);
  }

  @Override
  @Nullable
  public HackXhpExpression getXhpExpression() {
    return findChildByClass(HackXhpExpression.class);
  }

}
