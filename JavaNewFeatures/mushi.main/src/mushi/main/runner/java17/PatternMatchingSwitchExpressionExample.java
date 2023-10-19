package mushi.main.runner.java17;

public class PatternMatchingSwitchExpressionExample {

    public static void main(String[] args) {
        getDoubleUsingSwitch(2);
        getDoubleUsingSwitch(3.0);
        getDoubleUsingSwitch(4.00);
    }

    static double getDoubleUsingIf(Object o) {
        double result;

        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        } else {
            result = 0d;
        }

        return result;
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;

            String composeUsingPlus(String feelsLike, String temperature, String unit){
                return "Today's weather is " + feelsLike + ", with a temperature of " + temperature + " degrees " + unit;
            }

            String interpolationUsingSTRProcessor(String feelsLike, String temperature, String unit) {
                return STR
                        . "Today's weather is \{ feelsLike }, with a temperature of \{ temperature } degrees \{ unit }" ;
            }
        };
    }
}