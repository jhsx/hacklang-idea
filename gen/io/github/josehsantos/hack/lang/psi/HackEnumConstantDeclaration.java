// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackEnumConstantDeclaration extends PsiElement {

  @Nullable
  HackArrayType getArrayType();

  @Nullable
  HackCallableType getCallableType();

  @Nullable
  HackHhFunctionType getHhFunctionType();

  @Nullable
  HackHhNullableType getHhNullableType();

  @Nullable
  HackHhShapeType getHhShapeType();

  @Nullable
  HackHhSoftType getHhSoftType();

  @Nullable
  HackHhTupleType getHhTupleType();

  @Nullable
  HackHhXhpType getHhXhpType();

  @Nullable
  HackIdentType getIdentType();

  @NotNull
  HackIdentifier getIdentifier();

  @Nullable
  HackStaticExpr getStaticExpr();

}
