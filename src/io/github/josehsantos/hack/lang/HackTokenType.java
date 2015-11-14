package io.github.josehsantos.hack.lang;

import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.HackLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 29/10/14.
 */
public class HackTokenType extends IElementType {

    public HackTokenType(@NotNull @NonNls String debugName) {
        super(debugName, HackLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "HackTokenType." + super.toString();
    }
}
