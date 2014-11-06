// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticPrefixExpr extends HackExpr {

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackNamespaceString getNamespaceString();

  @Nullable
  HackStaticClassConstant getStaticClassConstant();

  @Nullable
  HackStaticCollectionLiteral getStaticCollectionLiteral();

  @Nullable
  HackStaticMapArrayLiteral getStaticMapArrayLiteral();

  @Nullable
  HackStaticPrefixOperator getStaticPrefixOperator();

  @Nullable
  HackStaticVarrayLiteral getStaticVarrayLiteral();

}
