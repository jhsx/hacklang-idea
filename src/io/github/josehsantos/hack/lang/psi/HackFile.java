package io.github.josehsantos.hack.lang.psi;

/**
 * Created by josesantos on 29/10/14.
 */


import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.github.josehsantos.hack.ide.HackFileType;
import io.github.josehsantos.hack.ide.HackLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HackFile extends PsiFileBase {
    public HackFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, HackLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return HackFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Hack File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
