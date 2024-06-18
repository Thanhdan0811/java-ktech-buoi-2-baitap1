public class NguoiQuanLyBai3 extends NhanVienBai3{


    NguoiQuanLyBai3(String name, String address, float salary, String manageProject) {
        super(name, address, salary);
        this.role = "Manager";
        this.manageProject = manageProject;
        this.bonus = 12;
    }


}
