public class Main {
    public static void main(String[] args) {
        Telewizor tv1 = new Telewizor("Samsung", 2013, 43.5);
//        tv1.producent = "Samsung";
//        tv1.year = 2013;
//        tv1.inch = 43.5;

        Telewizor tv2 = new Telewizor("Sony", 2018, 65);
//        tv2.producent = "Sony";
//        tv2.year = 2018;
//        tv2.inch = 65.0;

        System.out.println("Telewizor 1: "+tv1.producent+" "+tv1.year+" "+tv1.inch);
        System.out.println("Telewizor 2: "+tv2.producent+" "+tv2.year+" "+tv2.inch);
    }

}
