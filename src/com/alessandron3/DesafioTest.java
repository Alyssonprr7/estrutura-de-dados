package com.alessandron3;

import org.junit.Assert;
import org.junit.Test;

import static com.alessandron3.Desafio.estaBalanceado;

public class DesafioTest {


    @Test
    public void test1() {
        String s = "{(([])[])[]}";

        boolean balanced = estaBalanceado(s);

        Assert.assertTrue(balanced);
    }

    @Test
    public void test2() {
        String s = "{{[[(())]]}}";

        boolean balanced = estaBalanceado(s);

        Assert.assertTrue(balanced);
    }


    @Test
    public void test3() {
        String s = "}][}}(}][))]";

        boolean balanced = estaBalanceado(s);

        Assert.assertFalse(balanced);
    }


    @Test
    public void test4() {
        String s = "{}[[{[((}[(}[[]{{]([(}]][[";

        boolean balanced = estaBalanceado(s);

        Assert.assertFalse(balanced);
    }

}
