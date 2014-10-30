// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTraitAliasRule extends PsiElement {

  @Nullable
  HackIdent getIdent();

  @Nullable
  HackMethodModifiers getMethodModifiers();

  @Nullable
  HackNonEmptyMemberModifiers getNonEmptyMemberModifiers();

  @NotNull
  HackTraitAliasRuleMethod getTraitAliasRuleMethod();

}