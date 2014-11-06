package io.github.josehsantos.hack.ide;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * Created by josesantos on 01/11/14.
 */
public class HackCommenter implements Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return "//";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return "*/";
    }
}
