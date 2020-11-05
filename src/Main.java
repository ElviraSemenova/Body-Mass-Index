public class Main {
    public static void main(String[] args) {
        BmService service = new BmService();
        double imt1 = service.calculate(46, 1.57);
        System.out.format("%.1f\n", imt1);
        double imt2 = service.calculate(56, 1.57);
        System.out.format("%.1f\n", imt2);
        double imt3 = service.calculate(66, 1.57);
        System.out.format("%.1f\n", imt3);
        double imt4 = service.calculate(76, 1.57);
        System.out.format("%.1f\n", imt4);
        double imt5 = service.calculate(86, 1.57);
        System.out.format("%.1f\n", imt5);
        double imt6 = service.calculate(96, 1.57);
        System.out.format("%.1f\n", imt6);
        double imt7 = service.calculate(106, 1.57);
        System.out.format("%.1f\n", imt7);
        double imt8 = service.calculate(116, 1.57);
        System.out.format("%.1f\n", imt8);
        double imt9 = service.calculate(126, 1.57);
        System.out.format("%.1f\n", imt9);
        double imt10 = service.calculate(136, 1.57);
        System.out.format("%.1f\n", imt10);

    }

}


