package security;

public class PasswordMasker {
    // Method to mask password
    public static String maskPassword(String password) {
        StringBuffer maskedPassword = new StringBuffer(password);
        for (int i = 0; i < maskedPassword.length(); i++) {
            maskedPassword.setCharAt(i, '*');
        }
        return maskedPassword.toString();
    }
}
