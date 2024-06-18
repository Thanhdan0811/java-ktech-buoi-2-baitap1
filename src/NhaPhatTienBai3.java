
public class NhaPhatTienBai3 extends NhanVienBai3{


    NhaPhatTienBai3(String name, String address, float salary, String manageProject) {
        super(name, address, salary);
        this.role = "Developer";
        this.manageProject = manageProject;
        this.bonus = 10;
    }


}
