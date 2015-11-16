package io.github.josehsantos.hack.lang.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by josesantos on 16/11/14.
 */
public interface HackFunction extends HackPsiElement {

    @Nullable
    HackReturnType getReturnType();

    @NotNull
    List<HackParameter> getParameterList();
}
