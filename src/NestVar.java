public class NestVar {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("cpount= " + count);
        {
            int count = 2;
            System.out.println("Первый независимы блок: count=" + count);
            int n = 3;
            System.out.println("Первый независимый блок: n=" + n);
        }
        {
            int n = 5;
            System.out.println("Второй независимы бок: n =" + n);
        }
    } // main(String[]) method
} //NestVar class
