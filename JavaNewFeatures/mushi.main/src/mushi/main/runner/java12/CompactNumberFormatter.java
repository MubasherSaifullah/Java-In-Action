package mushi.main.runner.java12;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatter {
    public static void main(String[] args) {
        Long numberToFormat = 10000000000L;
        // Create a compact number formatter for the US locale.
        NumberFormat generalFormat = CompactNumberFormat.getInstance(Locale.US);
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        likesShort.setMaximumFractionDigits(2);

        System.out.println("Before Java 12 : " + generalFormat.format(numberToFormat));
        System.out.println("After Java 12 : " + likesShort.format(numberToFormat));
        System.out.println("After Java 12 : " + likesLong.format(numberToFormat));
    }
}
