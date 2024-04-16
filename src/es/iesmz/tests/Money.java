package es.iesmz.tests;

public class Money {
    static final float EUR_USD = 1.18798f;
    static final float USD_EUR = 0.841815f;

    static final float EUR_GBP = 0.857839f;
    static final float GBP_EUR = 1.165826f;
    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        if (money < 0) {
            return  -1;
        }
        if (origen == TipoMoneda.PTS || destino == TipoMoneda.PTS) {
            return -1;
        }

        if (origen == TipoMoneda.EUR){
            if (destino == TipoMoneda.USD) {
                 money = money * EUR_USD;
            } else if (destino == TipoMoneda.GBP) {
                money = money * EUR_GBP;
            }
        }else if (origen == TipoMoneda.USD) {
            if (destino == TipoMoneda.EUR) {
                money = money * USD_EUR;
            } else if (destino == TipoMoneda.GBP) {
                money = money * USD_EUR;
                money = money * EUR_GBP;
            }
        }else {
            if (destino == TipoMoneda.EUR) {
                money = money * GBP_EUR;
            } else if (destino == TipoMoneda.USD) {
                money = money * GBP_EUR;
                money = money * EUR_USD;
            }
        }

        return money;
    }
}
