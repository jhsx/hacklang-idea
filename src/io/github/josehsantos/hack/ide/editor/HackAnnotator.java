package io.github.josehsantos.hack.ide.editor;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import io.github.josehsantos.hack.ide.highlighter.HackSyntaxHighlighter;
import io.github.josehsantos.hack.lang.psi.HackAttributes;

/**
 * Created by josesantos on 05/11/14.
 */
public class HackAnnotator implements Annotator {
    @Override
    public void annotate(PsiElement psiElement, AnnotationHolder annotationHolder) {
        if (psiElement instanceof HackAttributes) {
            annotationHolder.createInfoAnnotation(psiElement.getFirstChild(), null).setTextAttributes(HackSyntaxHighlighter.HACK_USER_ATTRIBUTES[0]);
            annotationHolder.createInfoAnnotation(psiElement.getLastChild(), null).setTextAttributes(HackSyntaxHighlighter.HACK_USER_ATTRIBUTES[0]);
        }
    }
}
