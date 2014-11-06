package io.github.josehsantos.hack;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by josesantos on 29/10/14.
 */
public class HackFileType extends LanguageFileType {

    public static final HackFileType INSTANCE = new HackFileType();

    private HackFileType() {
        super(HackLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Hack file type";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Hack language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return ".hh";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return HackIcons.FILE;
    }
}
