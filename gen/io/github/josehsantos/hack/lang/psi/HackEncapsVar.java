// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackEncapsVar extends HackPsiElement {

  @Nullable
  HackEncapsBraceExpression getEncapsBraceExpression();

  @Nullable
  HackEncapsBraceIndexOffsetExpression getEncapsBraceIndexOffsetExpression();

  @Nullable
  HackEncapsExpression getEncapsExpression();

  @Nullable
  HackEncapsFieldAccessExpression getEncapsFieldAccessExpression();

  @Nullable
  HackEncapsIndexOffsetExpression getEncapsIndexOffsetExpression();

  @Nullable
  HackVariableIdentifier getVariableIdentifier();

}
