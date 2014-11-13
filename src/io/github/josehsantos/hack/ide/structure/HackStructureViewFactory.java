package io.github.josehsantos.hack.ide.structure;

import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackStructureViewFactory implements PsiStructureViewFactory {
    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile) {
        //TODO: uncomment later
        return null;
//        return new TreeBasedStructureViewBuilder() {
//            @Override
//            @NotNull
//            public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
//                return new HackStructureViewModel(psiFile, editor);
//            }
//
//            @Override
//            public boolean isRootNodeShown() {
//                return false;
//            }
//        };
    }
}
