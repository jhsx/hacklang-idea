// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackVariableExpression extends HackExpression {

  @NotNull
  List<HackArrayOffsetAccess> getArrayOffsetAccessList();

  @NotNull
  List<HackExpressionVariable> getExpressionVariableList();

  @NotNull
  List<HackSimpleVariableName> getSimpleVariableNameList();

  @NotNull
  List<HackVariableExpressionVariable> getVariableExpressionVariableList();

}
