
package Entity;

/**
 *
 * @author ADMIN
 */
public class TheLoai {
    private String MaTL;
    private String TenTL;
    private String MaVT;
    private int TrangThai;

    public TheLoai() {
    }

    public TheLoai(String MaTL, String TenTL, String MaVT, int TrangThai) {
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.MaVT = MaVT;
        this.TrangThai = TrangThai;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public String getMaVT() {
        return MaVT;
    }

    public void setMaVT(String MaVT) {
        this.MaVT = MaVT;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    
    
}
