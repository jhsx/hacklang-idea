// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackLambdaExpr extends HackExpr {

  @Nullable
  HackHhOptReturnType getHhOptReturnType();

  @NotNull
  HackLambdaBody getLambdaBody();

  @Nullable
  HackParameterList getParameterList();

}
