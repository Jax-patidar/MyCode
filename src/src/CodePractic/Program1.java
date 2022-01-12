package CodePractic;

import kotlin.jvm.Synchronized;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.PublicKey;

public class Program1 {

    public static void main(String[] args) {
        Double d = new Double(1111111111.00);
        String kk = getFormattedAmountValue(d);
        System.out.println(kk);
    }

    public static String getFormattedAmountValue(Double amount) {
            BigDecimal decimal = BigDecimal.valueOf(amount);
            return getRoundedValue(decimal);
    }

    private static String getRoundedValue(BigDecimal decimal) {
        StringBuilder amountBuilder = new StringBuilder();
        amountBuilder.append("$");
        amountBuilder.append(" ");
        amountBuilder.append(decimal.setScale(2, RoundingMode.HALF_UP));
        return amountBuilder.toString();
    }
}
















