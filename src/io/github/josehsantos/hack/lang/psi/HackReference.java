package io.github.josehsantos.hack.lang.psi;

import com.intellij.psi.PsiReference;
import io.github.josehsantos.hack.lang.resolve.HackTypeResolveResult;
import org.jetbrains.annotations.NotNull;

/**
 * Created by josesantos on 13/11/14.
 */
public interface HackReference extends HackExpression, PsiReference {
    @NotNull
    HackTypeResolveResult resolveHackType();
}
