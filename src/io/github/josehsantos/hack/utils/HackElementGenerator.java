package io.github.josehsantos.hack.utils;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.testFramework.LightVirtualFile;
import io.github.josehsantos.hack.HackFileType;
import io.github.josehsantos.hack.HackLanguage;

/**
 * Created by josesantos on 15/11/14.
 */
public class HackElementGenerator {
//    public static HackVariableIdentifier createIdentifierVariableFromText(Project project, String name) {
//        if (name.length() == 0)
//            name = "$";
//        if (name.charAt(0) != '$')
//            name = "$" + name;
//        PsiFile dummyFile = createDummyFile(project, "<?hh \n" + name + ";");
//        HackExpressionStatement childOfType = PsiTreeUtil.findChildOfType(dummyFile, HackExpressionStatement.class);
//        HackVariableExpression childOfType1 = PsiTreeUtil.findChildOfType(childOfType, HackVariableExpression.class);
//        return childOfType1.getVariableE().get(0).getVariableIdentifier();
//    }


    public static PsiFile createDummyFile(Project myProject, String text) {
        final PsiFileFactory factory = PsiFileFactory.getInstance(myProject);
        final String name = "dummy." + HackFileType.INSTANCE.getDefaultExtension();
        final LightVirtualFile virtualFile = new LightVirtualFile(name, HackFileType.INSTANCE, text);
        final PsiFile psiFile = ((PsiFileFactoryImpl) factory).trySetupPsiForFile(virtualFile, HackLanguage.INSTANCE, false, true);
        assert psiFile != null;
        return psiFile;
    }

}
