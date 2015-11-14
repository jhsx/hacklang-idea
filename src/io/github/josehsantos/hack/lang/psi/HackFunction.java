package io.github.josehsantos.hack.lang.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 16/11/14.
 */
public interface HackFunction extends HackPsiElement {

    @Nullable
    HackOptReturnType getOptReturnType();

    @NotNull
    HackParameterList getParameterList();
}
