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

public class HackThrowStatementImpl extends HackBaseStatementImpl implements HackThrowStatement {

  public HackThrowStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitThrowStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAdditiveOrConcatenationExpression getAdditiveOrConcatenationExpression() {
    return findChildByClass(HackAdditiveOrConcatenationExpression.class);
  }

  @Override
  @Nullable
  public HackArrayLiteralExpression getArrayLiteralExpression() {
    return findChildByClass(HackArrayLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackAssignmentExpression getAssignmentExpression() {
    return findChildByClass(HackAssignmentExpression.class);
  }

  @Override
  @Nullable
  public HackBackticksExpression getBackticksExpression() {
    return findChildByClass(HackBackticksExpression.class);
  }

  @Override
  @Nullable
  public HackBitwiseExpression getBitwiseExpression() {
    return findChildByClass(HackBitwiseExpression.class);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpression getCallableFunctionCallExpression() {
    return findChildByClass(HackCallableFunctionCallExpression.class);
  }

  @Override
  @NotNull
  public List<HackCastExpression> getCastExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCastExpression.class);
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
  public HackClosureExpression getClosureExpression() {
    return findChildByClass(HackClosureExpression.class);
  }

  @Override
  @Nullable
  public HackCollectionLiteralExpression getCollectionLiteralExpression() {
    return findChildByClass(HackCollectionLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackComparativeExpression getComparativeExpression() {
    return findChildByClass(HackComparativeExpression.class);
  }

  @Override
  @Nullable
  public HackDimExpression getDimExpression() {
    return findChildByClass(HackDimExpression.class);
  }

  @Override
  @Nullable
  public HackDimmableVariableAccessExpression getDimmableVariableAccessExpression() {
    return findChildByClass(HackDimmableVariableAccessExpression.class);
  }

  @Override
  @Nullable
  public HackEmptyExpression getEmptyExpression() {
    return findChildByClass(HackEmptyExpression.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpression getEspecialParenthesisedExpression() {
    return findChildByClass(HackEspecialParenthesisedExpression.class);
  }

  @Override
  @Nullable
  public HackEvalExpression getEvalExpression() {
    return findChildByClass(HackEvalExpression.class);
  }

  @Override
  @Nullable
  public HackExitExpression getExitExpression() {
    return findChildByClass(HackExitExpression.class);
  }

  @Override
  @Nullable
  public HackIncludeExpression getIncludeExpression() {
    return findChildByClass(HackIncludeExpression.class);
  }

  @Override
  @Nullable
  public HackInstanceofExpression getInstanceofExpression() {
    return findChildByClass(HackInstanceofExpression.class);
  }

  @Override
  @Nullable
  public HackIssetExpression getIssetExpression() {
    return findChildByClass(HackIssetExpression.class);
  }

  @Override
  @Nullable
  public HackLambdaExpression getLambdaExpression() {
    return findChildByClass(HackLambdaExpression.class);
  }

  @Override
  @Nullable
  public HackListAssignmentExpression getListAssignmentExpression() {
    return findChildByClass(HackListAssignmentExpression.class);
  }

  @Override
  @Nullable
  public HackLogicalExpression getLogicalExpression() {
    return findChildByClass(HackLogicalExpression.class);
  }

  @Override
  @Nullable
  public HackMapArrayLiteralExpression getMapArrayLiteralExpression() {
    return findChildByClass(HackMapArrayLiteralExpression.class);
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
  public HackMultiplicativeExpression getMultiplicativeExpression() {
    return findChildByClass(HackMultiplicativeExpression.class);
  }

  @Override
  @Nullable
  public HackNewExpression getNewExpression() {
    return findChildByClass(HackNewExpression.class);
  }

  @Override
  @Nullable
  public HackParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(HackParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public HackPrefixOperator getPrefixOperator() {
    return findChildByClass(HackPrefixOperator.class);
  }

  @Override
  @Nullable
  public HackPrintExpression getPrintExpression() {
    return findChildByClass(HackPrintExpression.class);
  }

  @Override
  @Nullable
  public HackRequireExpression getRequireExpression() {
    return findChildByClass(HackRequireExpression.class);
  }

  @Override
  @Nullable
  public HackScalarExpression getScalarExpression() {
    return findChildByClass(HackScalarExpression.class);
  }

  @Override
  @Nullable
  public HackShapeLiteralExpression getShapeLiteralExpression() {
    return findChildByClass(HackShapeLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackShiftExpression getShiftExpression() {
    return findChildByClass(HackShiftExpression.class);
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
  public HackSuffixOperator getSuffixOperator() {
    return findChildByClass(HackSuffixOperator.class);
  }

  @Override
  @Nullable
  public HackTernaryExpression getTernaryExpression() {
    return findChildByClass(HackTernaryExpression.class);
  }

  @Override
  @Nullable
  public HackTupleExpression getTupleExpression() {
    return findChildByClass(HackTupleExpression.class);
  }

  @Override
  @Nullable
  public HackVariableExpression getVariableExpression() {
    return findChildByClass(HackVariableExpression.class);
  }

  @Override
  @Nullable
  public HackVariableNameHolder getVariableNameHolder() {
    return findChildByClass(HackVariableNameHolder.class);
  }

  @Override
  @Nullable
  public HackVarrayLiteralExpression getVarrayLiteralExpression() {
    return findChildByClass(HackVarrayLiteralExpression.class);
  }

  @Override
  @Nullable
  public HackXhpExpression getXhpExpression() {
    return findChildByClass(HackXhpExpression.class);
  }

}
