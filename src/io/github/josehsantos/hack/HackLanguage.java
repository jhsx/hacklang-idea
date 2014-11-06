package io.github.josehsantos.hack;

import com.intellij.lang.Language;

/**
 * Created by josesantos on 29/10/14.
 */
public class HackLanguage extends Language {
    public static final HackLanguage INSTANCE = new HackLanguage();

    private HackLanguage() {
        super("Hack");
    }
}
