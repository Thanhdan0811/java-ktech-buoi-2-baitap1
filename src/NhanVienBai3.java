public class NhanVienBai3 {
    String name = "";
    String address = "";
    String role = "";
    float salary = 0f;

    String manageProject = "";

    // phần trăm bonus từ lương
    float bonus = 0;
    String performanceReport = "";

    NhanVienBai3() {

    }

    NhanVienBai3(String name, String address, String role, float salary) {
        this.name = name;
        this.address = address;
        this.role = role;
        this.salary = salary;


    }
    NhanVienBai3(String name, String address, float salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void getBonus() {
        float bonus = this.salary * (this.bonus / 100);
        System.out.println(this.role + "'s Bonus: $" + bonus);
    }
    public void performanceReport() {
        System.out.println("Performance report for " + this.role + " " + this.name + ": " + this.performanceReport);
    }
    public void getManageProject() {
        System.out.println(this.role + " " + this.name + " is " + this.manageProject);
    }

    public  void setPerformanceReport(String performanceReport) {
        this.performanceReport = performanceReport;
    }

    public void setBonus(float newBonus) {
        this.bonus = newBonus;
        System.out.println("Your current bonus : " + this.bonus);
    }

    public void setManageProject(String manageProject) {
        this.manageProject = manageProject;
        System.out.println("Your current manage project : " + this.manageProject);
    }

    public void getInfo() {
        this.getBonus();
        this.performanceReport();
        this.getManageProject();
    }

}
