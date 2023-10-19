package mushi.main.runner.java14;

public class SwitchExpression {

    public static void main(String[] args) {
        String day = "SUNDAY";
        // Old switch statement
        boolean isTodayHolidayOld = false;
        switch (day) {
            case "SATURDAY":
            case "SUNDAY":
                isTodayHolidayOld = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }

        // Switch expression
        boolean isTodayHolidayNew;
        isTodayHolidayNew = switch (day) {
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };

        // Compare the results
        System.out.println("Old switch statement: " + isTodayHolidayOld);
        System.out.println("Switch expression: " + isTodayHolidayNew);
    }
}

