package practice2;

public class Number {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public boolean isZero() {
        if (getNumber() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive() {
        if (this.getNumber() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isNegative() {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven() {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        int c = 1;
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                c = 2;
                break;
            }

        }
        if (c == 2) {
            return false;
        } else {
            return true;
        }
    }


        public boolean isArmstrong () {
            int num = (int) (number);
            int number2 = Integer.reverse(num);
            if (num == number2) {
                return true;
            } else {
                return false;
            }

        }

        public double getFactorial () {
            int num = (int) (number);
            int fact = 1;
            for (int i = 1; i <=num; i++) {
                fact = fact * i;
            }
            return (double) (fact);
        }

        public double getSqr () {
            return number * number;
        }

        public double getSqrt () {
            return Math.sqrt(number);
        }

        public double sumDigits () {
            int num = (int) number;
            int f;
            int g = 0;
            while (num > 0) {
                f = num % 10;
                g = g + f;
                num = num / 10;
            }
            return (double) (g);
        }

        public double getReverse () {
            int num = (int) (number);
            int num2 = Integer.reverse(num);
            return (double) num2;

        }

        public void listFactor () {
            System.out.println("ListFactor");
        }

        public void dispBinary () {
            int num = (int) number;
            String bin = Integer.toBinaryString(num);
            System.out.println(bin);
        }

    }
