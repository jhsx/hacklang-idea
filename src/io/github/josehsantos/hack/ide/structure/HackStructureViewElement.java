package io.github.josehsantos.hack.ide.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private final PsiElement myElement;

    public HackStructureViewElement(PsiFile psiFile) {
        myElement = psiFile;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean b) {

    }

    @Override
    public boolean canNavigate() {
        return false;
    }

    @Override
    public boolean canNavigateToSource() {
        return false;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return null;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return null;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        //TODO: implement this after reference provider
        return new TreeElement[0];
    }
}
