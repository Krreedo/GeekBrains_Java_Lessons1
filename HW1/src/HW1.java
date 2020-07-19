public class HW1 {

    public static void main(String[] args) {
        int a = 5;
        byte b = 127;
        short c = 54;
        long d = 1234L;
        boolean e;
        char f = 'a';
        float g = 154.99f;
        double h = 4848.9955;
        float g2 = floatExample(16.7f,98.9f,887f,44.887f);
        boolean b1 = checkSum(8, 9);

//	System.out.println(g2); // вызов для контроля
//    System.out.println(b1); // вызов для контроля
        posNegNumber(99);
        boolPosNegNumber(-133);
        myNameIs("Slim Shady");
        bissextile(2300);
    }

    public static float floatExample(float a,float b,float c,float d) {
        float exp = a*(b+(c/d));
        return exp;
    }

    public static boolean checkSum(int a, int b) { // целые числа берем из инта
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void posNegNumber(int a){  // целые числа берем из инта
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void boolPosNegNumber(int a) {
        boolean b = a >= 0;
        System.out.println(b);
    }

    public static void myNameIs(String name) {
        System.out.println("Привет, " + name + "!"  );

    }

    public static void bissextile(int year) {
        if((year%4 == 0 && year%100!=0) || year%400 == 0){
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

}