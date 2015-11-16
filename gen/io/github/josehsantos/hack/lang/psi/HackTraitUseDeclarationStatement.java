// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTraitUseDeclarationStatement extends HackStatement {

  @NotNull
  List<HackTraitAliasRule> getTraitAliasRuleList();

  @Nullable
  HackTraitList getTraitList();

  @NotNull
  List<HackTraitPrecedenceRule> getTraitPrecedenceRuleList();

}
