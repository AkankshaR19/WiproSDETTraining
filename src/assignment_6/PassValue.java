package assignment_6;

public class PassValue {
	public static void changeNumber(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int value = 5;

        System.out.println("Before method call: " + value);

        changeNumber(value);

        System.out.println("After method call: " + value);
    }

}
