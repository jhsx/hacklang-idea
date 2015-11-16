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

public class HackTernaryExpressionImpl extends HackExpressionImpl implements HackTernaryExpression {

  public HackTernaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitTernaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackAdditiveConcatenationExpression> getAdditiveConcatenationExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackAdditiveConcatenationExpression.class);
  }

  @Override
  @NotNull
  public List<HackArrayAccessExpression> getArrayAccessExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackArrayAccessExpression.class);
  }

  @Override
  @NotNull
  public List<HackArrayLiteralExpression> getArrayLiteralExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackArrayLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackAssignmentExpression getAssignmentExpression() {
    return findChildByClass(HackAssignmentExpression.class);
  }

  @Override
  @NotNull
  public List<HackBackticksExpression> getBackticksExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBackticksExpression.class);
  }

  @Override
  @NotNull
  public List<HackBitwiseExpression> getBitwiseExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBitwiseExpression.class);
  }

  @Override
  @NotNull
  public List<HackCallableFunctionCallExpression> getCallableFunctionCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallableFunctionCallExpression.class);
  }

  @Override
  @NotNull
  public List<HackCastExpression> getCastExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCastExpression.class);
  }

  @Override
  @NotNull
  public List<HackCloneExpression> getCloneExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCloneExpression.class);
  }

  @Override
  @NotNull
  public List<HackClosureExpression> getClosureExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackClosureExpression.class);
  }

  @Override
  @NotNull
  public List<HackCollectionLiteralExpression> getCollectionLiteralExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCollectionLiteralExpression.class);
  }

  @Override
  @NotNull
  public List<HackComparativeExpression> getComparativeExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackComparativeExpression.class);
  }

  @Override
  @NotNull
  public List<HackDynamicVariableExpression> getDynamicVariableExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDynamicVariableExpression.class);
  }

  @Override
  @NotNull
  public List<HackEmptyExpression> getEmptyExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEmptyExpression.class);
  }

  @Override
  @NotNull
  public List<HackEspecialParenthesisedExpression> getEspecialParenthesisedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEspecialParenthesisedExpression.class);
  }

  @Override
  @NotNull
  public List<HackEvalExpression> getEvalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEvalExpression.class);
  }

  @Override
  @NotNull
  public List<HackExitExpression> getExitExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExitExpression.class);
  }

  @Override
  @NotNull
  public List<HackFunctionCallExpression> getFunctionCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFunctionCallExpression.class);
  }

  @Override
  @NotNull
  public List<HackIncludeExpression> getIncludeExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackIncludeExpression.class);
  }

  @Override
  @NotNull
  public List<HackInstanceofExpression> getInstanceofExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInstanceofExpression.class);
  }

  @Override
  @NotNull
  public List<HackIssetExpression> getIssetExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackIssetExpression.class);
  }

  @Override
  @NotNull
  public List<HackLambdaExpression> getLambdaExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLambdaExpression.class);
  }

  @Override
  @Nullable
  public HackListAssignmentExpression getListAssignmentExpression() {
    return findChildByClass(HackListAssignmentExpression.class);
  }

  @Override
  @NotNull
  public List<HackLogicalExpression> getLogicalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLogicalExpression.class);
  }

  @Override
  @NotNull
  public List<HackMapArrayLiteralExpression> getMapArrayLiteralExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMapArrayLiteralExpression.class);
  }

  @Override
  @NotNull
  public List<HackMemberVariableExpression> getMemberVariableExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberVariableExpression.class);
  }

  @Override
  @NotNull
  public List<HackMethodCallExpression> getMethodCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMethodCallExpression.class);
  }

  @Override
  @NotNull
  public List<HackMultiplicativeExpression> getMultiplicativeExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMultiplicativeExpression.class);
  }

  @Override
  @NotNull
  public List<HackNewExpression> getNewExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackNewExpression.class);
  }

  @Override
  @NotNull
  public List<HackParenthesizedExpression> getParenthesizedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public HackPrefixOperator getPrefixOperator() {
    return findChildByClass(HackPrefixOperator.class);
  }

  @Override
  @NotNull
  public List<HackPrintExpression> getPrintExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackPrintExpression.class);
  }

  @Override
  @NotNull
  public List<HackRequireExpression> getRequireExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackRequireExpression.class);
  }

  @Override
  @NotNull
  public List<HackScalarExpression> getScalarExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackScalarExpression.class);
  }

  @Override
  @NotNull
  public List<HackShapeLiteralExpression> getShapeLiteralExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShapeLiteralExpression.class);
  }

  @Override
  @NotNull
  public List<HackShiftExpression> getShiftExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShiftExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticClassVariableExpression> getStaticClassVariableExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticClassVariableExpression.class);
  }

  @Override
  @NotNull
  public List<HackStaticMethodCallExpression> getStaticMethodCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticMethodCallExpression.class);
  }

  @Override
  @NotNull
  public List<HackSuffixOperator> getSuffixOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackSuffixOperator.class);
  }

  @Override
  @NotNull
  public List<HackTernaryExpression> getTernaryExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTernaryExpression.class);
  }

  @Override
  @NotNull
  public List<HackTupleExpression> getTupleExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTupleExpression.class);
  }

  @Override
  @NotNull
  public List<HackVArrayLiteralExpression> getVArrayLiteralExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVArrayLiteralExpression.class);
  }

  @Override
  @NotNull
  public List<HackVariableExpression> getVariableExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVariableExpression.class);
  }

  @Override
  @Nullable
  public HackVariableNameHolder getVariableNameHolder() {
    return findChildByClass(HackVariableNameHolder.class);
  }

  @Override
  @NotNull
  public List<HackXhpExpression> getXhpExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackXhpExpression.class);
  }

}
