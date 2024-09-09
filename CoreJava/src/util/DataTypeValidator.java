package util;

public class DataTypeValidator {

    public static String validateDataType(Object obj) {
        if (obj instanceof Integer) {
            return "Integer";
        } else if (obj instanceof String) {
            return "String";
        } else if (obj instanceof Double) {
            return "Double";
        } else if (obj instanceof Boolean) {
            return "Boolean";
        } else if (obj instanceof Character) {
            return "Character";
        } else {
            return "Unknown Type";
        }
    }

    public static void main(String[] args) {
        System.out.println(validateDataType(123)); // Output: Integer
        System.out.println(validateDataType("Hello")); // Output: String
        System.out.println(validateDataType(45.67)); // Output: Double
        System.out.println(validateDataType(true)); // Output: Boolean
        System.out.println(validateDataType('A')); // Output: Character
    }
}
