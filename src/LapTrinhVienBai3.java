
public class LapTrinhVienBai3 extends NhanVienBai3{


    LapTrinhVienBai3(String name, String address, float salary, String manageProject) {
        super(name, address, salary);
        this.role = "Programmer";
        this.manageProject = manageProject;
        this.bonus = 8;
    }


}

