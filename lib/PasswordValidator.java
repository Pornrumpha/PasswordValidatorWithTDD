package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param รับค่า String ต้องไม่เป็นค่า null หรือ empty
     * @return ส่งค่าไปยัง PasswordStrength
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        int count=0;
  boolean Lower = false, Upper = false, Digit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                Lower = true;
            } else if (Character.isUpperCase(c)) {
                Upper = true;
            } else if (Character.isDigit(c)) {
                Digit = true;
            }
        }

        if (password == null || password.length() < 8) {
            return PasswordStrength.INVALID;
        }
        if (Lower && Upper && Digit) {
            return PasswordStrength.STRONG;
        }
        if ((Lower && Digit) || (Upper && Digit)) {
            return PasswordStrength.MEDIUM;
        }
        return PasswordStrength.WEAK;}}