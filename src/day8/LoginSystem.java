package day8;

public class LoginSystem {
	public static void main(String[] args) {
		Integer generatedOTP=1234;
		Integer userEnteredOTP = 12345;

        if (generatedOTP.equals(userEnteredOTP)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid OTP");
        }
    }
	}


