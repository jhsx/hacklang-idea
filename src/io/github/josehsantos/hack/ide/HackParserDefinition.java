package io.github.josehsantos.hack.ide;

/**
 * Created by josesantos on 29/10/14.
 */

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.github.josehsantos.hack.lang.HackLexer;
import io.github.josehsantos.hack.lang.HackParser;
import io.github.josehsantos.hack.lang.HackTypes;
import io.github.josehsantos.hack.lang.psi.HackFile;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class HackParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE, HackTypes.T_WHITESPACE, HackTypes.T_ENCAPSED_AND_WHITESPACE);
    public static final TokenSet COMMENTS = TokenSet.create(HackTypes.T_COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<HackLanguage>findInstance(HackLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new HackLexer((Reader) null));
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new HackParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new HackFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return io.github.josehsantos.hack.lang.psi.HackTypes.Factory.createElement(node);
    }
}