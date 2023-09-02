package p391task15;

import p391task14.OnOffException1;
import p391task14.OnOffException2;
import p391task14.OnOffSwitch;
import p391task14.Switch;

public class WithFinally {
    static Switch sw = null;

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
            System.out.println("s");
        }
    }
}