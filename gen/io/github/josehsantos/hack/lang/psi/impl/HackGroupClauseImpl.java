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

public class HackGroupClauseImpl extends ASTWrapperPsiElement implements HackGroupClause {

  public HackGroupClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitGroupClause(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackAdditiveOrConcatenationExpr> getAdditiveOrConcatenationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackAdditiveOrConcatenationExpr.class);
  }

  @Override
  @NotNull
  public List<HackArrayLiteralExpr> getArrayLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackArrayLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<HackAssignmentExpr> getAssignmentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackAssignmentExpr.class);
  }

  @Override
  @NotNull
  public List<HackBackticksExpr> getBackticksExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBackticksExpr.class);
  }

  @Override
  @NotNull
  public List<HackBitwiseExpr> getBitwiseExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackBitwiseExpr.class);
  }

  @Override
  @NotNull
  public List<HackCallableFunctionCallExpr> getCallableFunctionCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCallableFunctionCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackCastExpr> getCastExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCastExpr.class);
  }

  @Override
  @NotNull
  public List<HackClassMethodCallExpr> getClassMethodCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackClassMethodCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackCloneExpr> getCloneExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCloneExpr.class);
  }

  @Override
  @NotNull
  public List<HackClosureExpr> getClosureExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackClosureExpr.class);
  }

  @Override
  @NotNull
  public List<HackCollectionLiteralExpr> getCollectionLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCollectionLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<HackComparativeExpr> getComparativeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackComparativeExpr.class);
  }

  @Override
  @NotNull
  public List<HackDimExpr> getDimExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDimExpr.class);
  }

  @Override
  @NotNull
  public List<HackDimmableVariableAccessExpr> getDimmableVariableAccessExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackDimmableVariableAccessExpr.class);
  }

  @Override
  @NotNull
  public List<HackEspecialParenthesisedExpr> getEspecialParenthesisedExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackEspecialParenthesisedExpr.class);
  }

  @Override
  @NotNull
  public List<HackExitExpr> getExitExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExitExpr.class);
  }

  @Override
  @NotNull
  public List<HackInstanceofExpr> getInstanceofExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInstanceofExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalEmptyExpr> getInternalEmptyExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalEmptyExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalEvalExpr> getInternalEvalExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalEvalExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalIncludeExpr> getInternalIncludeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalIncludeExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalIssetExpr> getInternalIssetExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalIssetExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalRequireExpr> getInternalRequireExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalRequireExpr.class);
  }

  @Override
  @NotNull
  public List<HackInternalTupleExpr> getInternalTupleExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInternalTupleExpr.class);
  }

  @Override
  @NotNull
  public List<HackLambdaExpr> getLambdaExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLambdaExpr.class);
  }

  @Override
  @NotNull
  public List<HackListAssignmentExpr> getListAssignmentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackListAssignmentExpr.class);
  }

  @Override
  @NotNull
  public List<HackLogicalExpr> getLogicalExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackLogicalExpr.class);
  }

  @Override
  @NotNull
  public List<HackMapArrayLiteralExpr> getMapArrayLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMapArrayLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<HackMemberVariableExpr> getMemberVariableExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMemberVariableExpr.class);
  }

  @Override
  @NotNull
  public List<HackMethodCallExpr> getMethodCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMethodCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackMultiplicativeExpr> getMultiplicativeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMultiplicativeExpr.class);
  }

  @Override
  @NotNull
  public List<HackNewExpr> getNewExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackNewExpr.class);
  }

  @Override
  @NotNull
  public List<HackParenthesizedExpr> getParenthesizedExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackParenthesizedExpr.class);
  }

  @Override
  @NotNull
  public List<HackPrefixExpr> getPrefixExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackPrefixExpr.class);
  }

  @Override
  @NotNull
  public List<HackPrintExpr> getPrintExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackPrintExpr.class);
  }

  @Override
  @NotNull
  public List<HackScalarExpr> getScalarExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackScalarExpr.class);
  }

  @Override
  @NotNull
  public List<HackShapeLiteralExpr> getShapeLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShapeLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<HackShiftExpr> getShiftExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShiftExpr.class);
  }

  @Override
  @NotNull
  public List<HackSimpleFunctionCallExpr> getSimpleFunctionCallExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackSimpleFunctionCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackStaticClassVariableExpr> getStaticClassVariableExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticClassVariableExpr.class);
  }

  @Override
  @NotNull
  public List<HackTernaryExpr> getTernaryExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTernaryExpr.class);
  }

  @Override
  @NotNull
  public List<HackVariableWithoutObjectsExpr> getVariableWithoutObjectsExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVariableWithoutObjectsExpr.class);
  }

  @Override
  @NotNull
  public List<HackVarrayLiteralExpr> getVarrayLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVarrayLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<HackXhpExpr> getXhpExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackXhpExpr.class);
  }

}
