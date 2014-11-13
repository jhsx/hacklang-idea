package io.github.josehsantos.hack.ide.folding;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import io.github.josehsantos.hack.lang.HackTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackFoldingBuilder implements FoldingBuilder {
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        List<FoldingDescriptor> list = new ArrayList<FoldingDescriptor>();
        buildFolding(node, list);
        FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
        return list.toArray(descriptors);
    }

    private static void buildFolding(ASTNode node, List<FoldingDescriptor> list) {
        boolean isBlock = node.getElementType() == HackTypes.BLOCK_STATEMENT || node.getElementType() == HackTypes.CLASS_STATEMENT_BLOCK;
        if (isBlock && !node.getTextRange().isEmpty()) {
            final TextRange range = node.getTextRange();
            if (range.getLength() > 1) {
                list.add(new FoldingDescriptor(node, range));
            }
        }
        for (ASTNode child : node.getChildren(null)) {
            buildFolding(child, list);
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode astNode) {
        return "{...}";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode astNode) {
        return false;
    }
}
