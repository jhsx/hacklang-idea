package io.github.josehsantos.hack.ide.refactory;

import com.intellij.lang.refactoring.NamesValidator;
import com.intellij.openapi.project.Project;

/**
 * Created by josesantos on 17/11/14.
 */
public class HackNamesValidator implements NamesValidator {
    @Override
    public boolean isKeyword(String s, Project project) {
        return false;
    }

    @Override
    public boolean isIdentifier(String s, Project project) {
        return s.charAt(0) == '$';
    }
}
