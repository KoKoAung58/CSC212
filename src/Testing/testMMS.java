package Testing;

import composer.SComposer;

public class testMMS {
    public static void main (String[] args){
                   SComposer c = new SComposer();
                   c.text();
                   System.out.println("c.mms1...."); c.mms1(); space (c);
                   System.out.println("c.mms2...."); c.mms2(); space(c);
                   System.out.println("c.mms3...."); c.mms3(); space(c);
                   System.out.println("c.mms4...."); c.mms4(); space(c);
                   System.out.println("c.mms5...."); c.mms5(); space(c);
                   System.out.println("c.mms6...."); c.mms6(); space(c);
                   System.out.println("c.mms7...."); c.mms7(); space(c);
                   System.out.println("c.mms8...."); c.mms8(); space(c);
                   c.untext();
               }

             private static void space(SComposer c) {
                   c.untext();c.note().rest(2); c.text();
             }
}
