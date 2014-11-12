// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackHhNewTypeDeclarationStatement extends PsiElement {

  @NotNull
  List<HackArrayType> getArrayTypeList();

  @NotNull
  List<HackCallableType> getCallableTypeList();

  @NotNull
  List<HackHhFunctionType> getHhFunctionTypeList();

  @NotNull
  List<HackHhNullableType> getHhNullableTypeList();

  @NotNull
  List<HackHhShapeType> getHhShapeTypeList();

  @NotNull
  List<HackHhSoftType> getHhSoftTypeList();

  @NotNull
  List<HackHhTupleType> getHhTupleTypeList();

  @Nullable
  HackHhTypevar getHhTypevar();

  @NotNull
  List<HackHhXhpType> getHhXhpTypeList();

  @NotNull
  List<HackIdentType> getIdentTypeList();

  @Nullable
  HackIdentifier getIdentifier();

}
