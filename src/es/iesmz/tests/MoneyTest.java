package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    public static void main(String[] args) {

    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("prueba realizada");
    }

    @Test
    public void test1() {
        Money m = new Money();
        assertEquals(28.37f, m.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f));
    }

    @Test
    public void test2() {
        Money m = new Money();
        assertEquals(1165.83f, m.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f));
    }

    @Test
    public void test3() {
        Money m = new Money();
        assertEquals(201.21f, m.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f));
    }

    @Test
    public void test4() {
        Money m = new Money();
        assertEquals(37.51f, m.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f));
    }

    @Test
    public void test5() {
        Money m = new Money();
        assertEquals(138.49f, m.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f));
    }

    @Test
    public void test6() {
        Money m = new Money();
        assertEquals(722.14f, m.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f));
    }

    @Test
    public void test7() {
        Money m = new Money();
        assertEquals(-1f, m.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f));
    }

    @Test
    public void test8() {
        Money m = new Money();
        assertEquals(-1f, m.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f));
    }

    @Test
    public void test9() {
        Money m = new Money();
        assertEquals(-1f, m.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f));
    }
}
