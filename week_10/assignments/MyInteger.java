package week_10.assigments;

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (getValue() % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        for (int i = 2; i <= getValue() / 2; i++) {
            if (getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        if (myInteger.getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger myInteger) {
        if (myInteger.getValue() % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int i = 2; i <= myInteger.getValue() / 2; i++) {
            if (myInteger.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
        if (this.getValue() == value) {
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger myInteger) {
        if (this.getValue() == myInteger.getValue()) {
            return true;
        }
        return false;
    }

    public static int parseInt(char[] list) {
        String num = "";
        for (int i = 0; i < list.length; i++) {
            if (Character.isDigit(list[i])) {
                num += list[i];
            }
        }
        return Integer.parseInt(num);
    }

    public static int parseInt(String str) {

        return Integer.parseInt(str);

    }


}
