// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackStaticExpr extends PsiElement {

  @Nullable
  HackCommonScalar getCommonScalar();

  @Nullable
  HackNamespaceString getNamespaceString();

  @Nullable
  HackStaticArrayPairList getStaticArrayPairList();

  @Nullable
  HackStaticClassConstant getStaticClassConstant();

  @Nullable
  HackStaticCollectionLiteral getStaticCollectionLiteral();

  @Nullable
  HackStaticExpr getStaticExpr();

  @Nullable
  HackStaticMapArrayLiteral getStaticMapArrayLiteral();

  @Nullable
  HackStaticShapePairList getStaticShapePairList();

  @Nullable
  HackStaticVarrayLiteral getStaticVarrayLiteral();

}
