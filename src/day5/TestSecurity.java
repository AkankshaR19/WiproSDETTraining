package day5;

final class SecurityModule {

    void encrypt() {
        System.out.println("Encrypting data securely...");
    }
}

public class TestSecurity {
    public static void main(String[] args) {

        SecurityModule sm = new SecurityModule();
        sm.encrypt();
    }
}
