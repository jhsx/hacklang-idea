package io.github.josehsantos.hack.lang;

import java.util.Stack;

/**
 * Created by josesantos on 28/10/14.
 */
public class StateStack {
    private Stack<Integer> stack = new Stack<Integer>();

    public int pushStack(int state) {
        stack.push(new Integer(state));
        return state;
    }

    public int popStack() {
        return stack.pop().intValue();
    }

    public int size() {
        return stack.size();
    }

}
