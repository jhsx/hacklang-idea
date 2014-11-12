// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackScalarExpr extends PsiElement {

  @Nullable
  HackClassConstant getClassConstant();

  @Nullable
  HackEncapsList getEncapsList();

  @Nullable
  HackLiteralExpr getLiteralExpr();

  @Nullable
  HackNamespaceString getNamespaceString();

}
