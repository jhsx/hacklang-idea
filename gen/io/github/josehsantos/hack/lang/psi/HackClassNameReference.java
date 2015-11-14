// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassNameReference extends HackPsiElement {

  @Nullable
  HackCallableFunctionCallExpression getCallableFunctionCallExpression();

  @Nullable
  HackClassMethodCallExpression getClassMethodCallExpression();

  @Nullable
  HackCloneExpression getCloneExpression();

  @Nullable
  HackCollectionLiteralExpression getCollectionLiteralExpression();

  @Nullable
  HackDimmableVariableAccessExpression getDimmableVariableAccessExpression();

  @Nullable
  HackEspecialParenthesisedExpression getEspecialParenthesisedExpression();

  @Nullable
  HackFullyQualifiedClassName getFullyQualifiedClassName();

  @Nullable
  HackMemberOnlyAccessExpression getMemberOnlyAccessExpression();

  @Nullable
  HackMemberVariableExpression getMemberVariableExpression();

  @Nullable
  HackMethodCallExpression getMethodCallExpression();

  @Nullable
  HackNewExpression getNewExpression();

  @Nullable
  HackSimpleFunctionCallExpression getSimpleFunctionCallExpression();

  @Nullable
  HackStaticClassVariableExpression getStaticClassVariableExpression();

  @Nullable
  HackVariableExpression getVariableExpression();

  @Nullable
  HackXhpExpression getXhpExpression();

}
