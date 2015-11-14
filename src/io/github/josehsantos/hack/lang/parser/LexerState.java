package io.github.josehsantos.hack.lang.parser;

import com.intellij.psi.tree.IElementType;

/**
 * Created by josesantos on 03/11/14.
 */
public class LexerState {
    public int zzCurrentPos, zzMarkedPos, zzStartRead, zzPushbackPos;
    public IElementType currentElement=null;

    public LexerState(int zzCurrentPos, int zzMarkedPos, int zzStartRead, int zzPushbackPos) {
        this.zzCurrentPos = zzCurrentPos;
        this.zzMarkedPos = zzMarkedPos;
        this.zzStartRead = zzStartRead;
        this.zzPushbackPos = zzPushbackPos;
    }
}
