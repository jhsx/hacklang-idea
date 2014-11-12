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

public class HackLetClauseImpl extends ASTWrapperPsiElement implements HackLetClause {

  public HackLetClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitLetClause(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAdditiveOrConcatenationExpr getAdditiveOrConcatenationExpr() {
    return findChildByClass(HackAdditiveOrConcatenationExpr.class);
  }

  @Override
  @Nullable
  public HackArrayLiteralExpr getArrayLiteralExpr() {
    return findChildByClass(HackArrayLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackAssignmentExpr getAssignmentExpr() {
    return findChildByClass(HackAssignmentExpr.class);
  }

  @Override
  @Nullable
  public HackBackticksExpr getBackticksExpr() {
    return findChildByClass(HackBackticksExpr.class);
  }

  @Override
  @Nullable
  public HackBitwiseExpr getBitwiseExpr() {
    return findChildByClass(HackBitwiseExpr.class);
  }

  @Override
  @Nullable
  public HackCallableFunctionCallExpr getCallableFunctionCallExpr() {
    return findChildByClass(HackCallableFunctionCallExpr.class);
  }

  @Override
  @NotNull
  public List<HackCastExpr> getCastExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackCastExpr.class);
  }

  @Override
  @Nullable
  public HackClassMethodCallExpr getClassMethodCallExpr() {
    return findChildByClass(HackClassMethodCallExpr.class);
  }

  @Override
  @Nullable
  public HackCloneExpr getCloneExpr() {
    return findChildByClass(HackCloneExpr.class);
  }

  @Override
  @Nullable
  public HackClosureExpr getClosureExpr() {
    return findChildByClass(HackClosureExpr.class);
  }

  @Override
  @Nullable
  public HackCollectionLiteralExpr getCollectionLiteralExpr() {
    return findChildByClass(HackCollectionLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackComparativeExpr getComparativeExpr() {
    return findChildByClass(HackComparativeExpr.class);
  }

  @Override
  @Nullable
  public HackDimExpr getDimExpr() {
    return findChildByClass(HackDimExpr.class);
  }

  @Override
  @Nullable
  public HackDimmableVariableAccessExpr getDimmableVariableAccessExpr() {
    return findChildByClass(HackDimmableVariableAccessExpr.class);
  }

  @Override
  @Nullable
  public HackEspecialParenthesisedExpr getEspecialParenthesisedExpr() {
    return findChildByClass(HackEspecialParenthesisedExpr.class);
  }

  @Override
  @Nullable
  public HackExitExpr getExitExpr() {
    return findChildByClass(HackExitExpr.class);
  }

  @Override
  @Nullable
  public HackInstanceofExpr getInstanceofExpr() {
    return findChildByClass(HackInstanceofExpr.class);
  }

  @Override
  @Nullable
  public HackInternalEmptyExpr getInternalEmptyExpr() {
    return findChildByClass(HackInternalEmptyExpr.class);
  }

  @Override
  @Nullable
  public HackInternalEvalExpr getInternalEvalExpr() {
    return findChildByClass(HackInternalEvalExpr.class);
  }

  @Override
  @Nullable
  public HackInternalIncludeExpr getInternalIncludeExpr() {
    return findChildByClass(HackInternalIncludeExpr.class);
  }

  @Override
  @Nullable
  public HackInternalIssetExpr getInternalIssetExpr() {
    return findChildByClass(HackInternalIssetExpr.class);
  }

  @Override
  @Nullable
  public HackInternalRequireExpr getInternalRequireExpr() {
    return findChildByClass(HackInternalRequireExpr.class);
  }

  @Override
  @Nullable
  public HackInternalTupleExpr getInternalTupleExpr() {
    return findChildByClass(HackInternalTupleExpr.class);
  }

  @Override
  @Nullable
  public HackLambdaExpr getLambdaExpr() {
    return findChildByClass(HackLambdaExpr.class);
  }

  @Override
  @Nullable
  public HackListAssignmentExpr getListAssignmentExpr() {
    return findChildByClass(HackListAssignmentExpr.class);
  }

  @Override
  @Nullable
  public HackLogicalExpr getLogicalExpr() {
    return findChildByClass(HackLogicalExpr.class);
  }

  @Override
  @Nullable
  public HackMapArrayLiteralExpr getMapArrayLiteralExpr() {
    return findChildByClass(HackMapArrayLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackMemberVariableExpr getMemberVariableExpr() {
    return findChildByClass(HackMemberVariableExpr.class);
  }

  @Override
  @Nullable
  public HackMethodCallExpr getMethodCallExpr() {
    return findChildByClass(HackMethodCallExpr.class);
  }

  @Override
  @Nullable
  public HackMultiplicativeExpr getMultiplicativeExpr() {
    return findChildByClass(HackMultiplicativeExpr.class);
  }

  @Override
  @Nullable
  public HackNewExpr getNewExpr() {
    return findChildByClass(HackNewExpr.class);
  }

  @Override
  @Nullable
  public HackParenthesizedExpr getParenthesizedExpr() {
    return findChildByClass(HackParenthesizedExpr.class);
  }

  @Override
  @Nullable
  public HackPrefixExpr getPrefixExpr() {
    return findChildByClass(HackPrefixExpr.class);
  }

  @Override
  @Nullable
  public HackPrintExpr getPrintExpr() {
    return findChildByClass(HackPrintExpr.class);
  }

  @Override
  @Nullable
  public HackScalarExpr getScalarExpr() {
    return findChildByClass(HackScalarExpr.class);
  }

  @Override
  @Nullable
  public HackShapeLiteralExpr getShapeLiteralExpr() {
    return findChildByClass(HackShapeLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackShiftExpr getShiftExpr() {
    return findChildByClass(HackShiftExpr.class);
  }

  @Override
  @Nullable
  public HackSimpleFunctionCallExpr getSimpleFunctionCallExpr() {
    return findChildByClass(HackSimpleFunctionCallExpr.class);
  }

  @Override
  @Nullable
  public HackStaticClassVariableExpr getStaticClassVariableExpr() {
    return findChildByClass(HackStaticClassVariableExpr.class);
  }

  @Override
  @Nullable
  public HackTernaryExpr getTernaryExpr() {
    return findChildByClass(HackTernaryExpr.class);
  }

  @Override
  @Nullable
  public HackVariableWithoutObjectsExpr getVariableWithoutObjectsExpr() {
    return findChildByClass(HackVariableWithoutObjectsExpr.class);
  }

  @Override
  @Nullable
  public HackVarrayLiteralExpr getVarrayLiteralExpr() {
    return findChildByClass(HackVarrayLiteralExpr.class);
  }

  @Override
  @Nullable
  public HackXhpExpr getXhpExpr() {
    return findChildByClass(HackXhpExpr.class);
  }

}
