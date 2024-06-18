public class Main {
    public static void main(String[] args) {
        // Bài 1
        System.out.println("=============Bài 1==============");
        // tạo Car
        CarBai1 carBai1 = new CarBai1(10);
        BicycleBai1 bic = new BicycleBai1(10);

        carBai1.speedUp();
        bic.speedUp();

        // Bài 2
        System.out.println("=============Bài 2==============");
        NhanVienBai2 nhanVienBai2 = new NhanVienBai2(40000, "Employee");
        HRManagerBai2 hrManagerBai2 = new HRManagerBai2(70000, "Manager");

        nhanVienBai2.work();
        nhanVienBai2.getSalary();

        System.out.println("\n");
        hrManagerBai2.work();
        hrManagerBai2.getSalary();

        System.out.println("\n");
        hrManagerBai2.addEmployee();

        // Bài 3
        System.out.println("=============Bài 3==============");
        NguoiQuanLyBai3 ngQuanLy = new NguoiQuanLyBai3("Avril Aroldo", "somewhere", 100000, "managing a project");
        ngQuanLy.setPerformanceReport("Excellent");

        NhaPhatTienBai3 nhaPT = new NhaPhatTienBai3("Iver Dipali", "somewhere", 72000, "writting code in Java");
        nhaPT.setPerformanceReport("Good");

        LapTrinhVienBai3 lapTV = new LapTrinhVienBai3("Yaron Gabriel", "somewhere", 114000, "debugging code in Python");
        lapTV.setPerformanceReport("Excellent");


        ngQuanLy.getBonus();
        nhaPT.getBonus();
        lapTV.getBonus();
        System.out.println("===================");
        ngQuanLy.performanceReport();
        nhaPT.performanceReport();
        lapTV.performanceReport();
        System.out.println("===================");
        ngQuanLy.getManageProject();
        nhaPT.getManageProject();
        lapTV.getManageProject();

        // Bài 4
        System.out.println("=============Bài 4==============");
        XeCoBai4 xeTai = new XeTaiBai4();
        xeTai.setNhanHieu("Tatra 810 4x4");
        XeCoBai4 oTo = new OTo();
        oTo.setNhanHieu("Virtus");
        XeCoBai4 xeMay = new XeMayBai4();
        xeMay.setNhanHieu("Warrior200");

        xeTai.getInfo();
        System.out.println("===================");
        oTo.getInfo();
        System.out.println("===================");
        xeMay.getInfo();


    }
}