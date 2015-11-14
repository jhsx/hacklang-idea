// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import io.github.josehsantos.hack.lang.psi.*;

public class HackLambdaUseVarsImpl extends HackPsiElementImpl implements HackLambdaUseVars {

  public HackLambdaUseVarsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitLambdaUseVars(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackLexicalVarList getLexicalVarList() {
    return findChildByClass(HackLexicalVarList.class);
  }

}
