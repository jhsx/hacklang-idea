// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticPrefixExpression extends HackExpression {

  @Nullable
  HackLiteralExpression getLiteralExpression();

  @Nullable
  HackNamespaceString getNamespaceString();

  @Nullable
  HackStaticArrayExpression getStaticArrayExpression();

  @Nullable
  HackStaticClassConstant getStaticClassConstant();

  @Nullable
  HackStaticCollectionLiteral getStaticCollectionLiteral();

  @Nullable
  HackStaticMapArrayLiteral getStaticMapArrayLiteral();

  @Nullable
  HackStaticParenthesizedExpression getStaticParenthesizedExpression();

  @Nullable
  HackStaticPrefixExpression getStaticPrefixExpression();

  @Nullable
  HackStaticPrefixOperator getStaticPrefixOperator();

  @Nullable
  HackStaticShapeExpression getStaticShapeExpression();

  @Nullable
  HackStaticVarrayLiteral getStaticVarrayLiteral();

}
