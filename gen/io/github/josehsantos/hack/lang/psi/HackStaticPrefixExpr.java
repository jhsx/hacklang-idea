// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticPrefixExpr extends PsiElement {

  @Nullable
  HackLiteralExpr getLiteralExpr();

  @Nullable
  HackNamespaceString getNamespaceString();

  @Nullable
  HackStaticArrayExpr getStaticArrayExpr();

  @Nullable
  HackStaticClassConstant getStaticClassConstant();

  @Nullable
  HackStaticCollectionLiteral getStaticCollectionLiteral();

  @Nullable
  HackStaticMapArrayLiteral getStaticMapArrayLiteral();

  @Nullable
  HackStaticParenthesizedExpr getStaticParenthesizedExpr();

  @Nullable
  HackStaticPrefixExpr getStaticPrefixExpr();

  @Nullable
  HackStaticPrefixOperator getStaticPrefixOperator();

  @Nullable
  HackStaticShapeExpr getStaticShapeExpr();

  @Nullable
  HackStaticVarrayLiteral getStaticVarrayLiteral();

}
