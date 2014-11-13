package io.github.josehsantos.hack.ide.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import io.github.josehsantos.hack.lang.psi.HackClassDeclarationStatement;
import io.github.josehsantos.hack.lang.psi.HackClassStatement;
import io.github.josehsantos.hack.lang.psi.HackFunctionDeclarationStatement;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackStructureViewModel  extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
    public HackStructureViewModel(PsiFile psiFile, Editor editor) {
        super(psiFile, editor, new HackStructureViewElement(psiFile));
        withSuitableClasses(HackFunctionDeclarationStatement.class, HackClassDeclarationStatement.class);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }
}
