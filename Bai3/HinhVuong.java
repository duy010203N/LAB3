package Bai3;
public class HinhVuong {
     private double canh;

public HinhVuong(double canh) {
    this.canh = canh;
}

public double getCanh() {
    return canh;
}

public void setCanh(double canh) {
    this.canh = canh;
}

public double tinhChuVi() {
    return 4 * canh;
}

public double tinhDienTich() {
    return canh * canh;
}
}
