// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackDimmableVariable extends PsiElement {

  @Nullable
  HackCallableVariable getCallableVariable();

  @Nullable
  HackClassMethodCall getClassMethodCall();

  @Nullable
  HackDimmableVariableAccess getDimmableVariableAccess();

  @Nullable
  HackExprWithParens getExprWithParens();

  @Nullable
  HackFunctionCallParameterList getFunctionCallParameterList();

  @Nullable
  HackObjectMethodCall getObjectMethodCall();

  @Nullable
  HackPropertyAccessWithoutVariables getPropertyAccessWithoutVariables();

  @Nullable
  HackSimpleFunctionCall getSimpleFunctionCall();

  @Nullable
  HackVariable getVariable();

}
