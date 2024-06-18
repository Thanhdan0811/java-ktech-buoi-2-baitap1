public class HRManagerBai2 extends NhanVienBai2 {
    HRManagerBai2(int salary, String role) {
        this.salary = salary;
        this.role = role;
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }
}
