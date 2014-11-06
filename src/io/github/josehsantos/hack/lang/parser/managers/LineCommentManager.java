package io.github.josehsantos.hack.lang.parser.managers;


import io.github.josehsantos.hack.lang.parser._HackLexer;

public class LineCommentManager extends ReadingManager {


    public LineCommentManager(_HackLexer lexer) {
        super(lexer);
    }

    public int eat() {
        int pos = 0;
        if(zzBuffer.length()==0)
            zzBuffer = lexer.getBuffer();
        while (true) {
// end seen
            if (!canReadAt(pos) || !canReadAt(pos + 1) || checkForEndDelimiter(pos)) {
                return pos;
            }

            if (checkForClosingTag(pos)) {
                return pos;
            }

            pos++;
        }
    }

    private boolean checkForEndDelimiter(int pos) {
        if (safeReadAt(pos + 1) == '\n' || safeReadAt(pos + 1) == '\r') {
            return true;
        }
        return false;
    }

    private boolean checkForClosingTag(int pos) {
        if (safeReadAt(pos + 1) == '?' || safeReadAt(pos + 1) == '%') {
            if (safeReadAt(pos + 2) == '>') {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        super.reset();
    }
}
