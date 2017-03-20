package org.pavan.java8.learning;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class JsEngine {
    public static void main(String[] d) {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        try {
            engine.eval("function sum(a, b) { return a+b; }");
            System.out.println(engine.eval("sum(1, 2);"));
            System.out.println("Adding two numbers using javascript");
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}
