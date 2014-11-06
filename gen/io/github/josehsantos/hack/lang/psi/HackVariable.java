// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackVariable extends PsiElement {

  @NotNull
  List<HackArrayAccess> getArrayAccessList();

  @Nullable
  HackCallableVariable getCallableVariable();

  @Nullable
  HackClassMethodCall getClassMethodCall();

  @Nullable
  HackExpr getExpr();

  @Nullable
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackObjectMethodCall getObjectMethodCall();

  @NotNull
  List<HackPropertyAccess> getPropertyAccessList();

  @Nullable
  HackSimpleFunctionCall getSimpleFunctionCall();

  @Nullable
  HackStaticClassName getStaticClassName();

  @Nullable
  HackVariable getVariable();

  @Nullable
  HackVariableWithoutObjects getVariableWithoutObjects();

}
