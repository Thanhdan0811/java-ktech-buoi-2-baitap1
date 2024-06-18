public class XeCoBai4 {
    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    String nhanHieu = "";
    String kieuDang = "";
    int nam = 0;
    String loaiNhienLieu = "";
    float tocDoToiDa = 0f;
    double quangDuongToiDa = 0;


    public void getModel() {

    }

    public void getFuelEff() {

    }

    public void getDistanceTraveled() {

    }

    public void getMaxSpeed() {

    }

    public void getInfo() {
        this.getModel();
        this.getFuelEff();
        this.getDistanceTraveled();
        this.getMaxSpeed();
    }




}
