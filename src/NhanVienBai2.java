public class NhanVienBai2 {
    int salary = 0;
    String role = "";

    NhanVienBai2() {}

    NhanVienBai2(int salary, String role) {
        this.salary = salary;
        this.role = role;

    }

    public void work() {
        System.out.println("Working as an employee!");
    }

    public void getSalary() {
        System.out.println(this.role + " salary: " + this.salary);
    }

    public void addEmployee() {
        System.out.println("Adding new employee!");
    }

}
