public class KhachSan extends DichVuLuuTru {
    private String tenKS;
    private int soSao;

    public KhachSan() {
        super();
        tenKS = "";
        soSao = 0;
    }

    public KhachSan(String viTri, double giaCoBan, String tenKS, int soSao) {
        super(viTri, giaCoBan);
        this.tenKS = tenKS;
        this.soSao = soSao;
    }

    @Override
    public double tinhGiaThueCoBan() {
        if (soSao <= 2)
            return giaCoBan + tinhThue() * giaCoBan;
        if (soSao >= 3)
            return giaCoBan * 1.1 + tinhThue() * giaCoBan * 1.1;
        return 0;
    }
}