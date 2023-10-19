package noninstantiability;

public class XUtilitySubClass extends XUtility {
    private static XUtilitySubClass xUtilitySubClass = new XUtilitySubClass();
    private XUtilitySubClass() {
        System.out.println("XUtilitySubClass constructor");
    }

    public static XUtilitySubClass getInstance() {
        return xUtilitySubClass;
    }
}
