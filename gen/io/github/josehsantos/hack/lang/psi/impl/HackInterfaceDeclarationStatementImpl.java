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

public class HackInterfaceDeclarationStatementImpl extends HackStatementImpl implements HackInterfaceDeclarationStatement {

  public HackInterfaceDeclarationStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) ((HackVisitor)visitor).visitInterfaceDeclarationStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackClassStatementList getClassStatementList() {
    return findChildByClass(HackClassStatementList.class);
  }

  @Override
  @Nullable
  public HackHhTypevar getHhTypevar() {
    return findChildByClass(HackHhTypevar.class);
  }

  @Override
  @Nullable
  public HackIdent getIdent() {
    return findChildByClass(HackIdent.class);
  }

  @Override
  @Nullable
  public HackInterfaceExtendsList getInterfaceExtendsList() {
    return findChildByClass(HackInterfaceExtendsList.class);
  }

  @Override
  @Nullable
  public HackUserAttributes getUserAttributes() {
    return findChildByClass(HackUserAttributes.class);
  }

}
