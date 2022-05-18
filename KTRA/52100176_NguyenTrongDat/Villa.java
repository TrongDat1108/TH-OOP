public class Villa extends DichVuLuuTru {
    private String tenVilla;
    private int soPhongNgu;

    public Villa() {
        super();
        tenVilla = "";
        soPhongNgu = 0;
    }

    public Villa(String viTri, double giaCoBan, String tenVilla, int soPhongNgu) {
        super(viTri, giaCoBan);
        this.tenVilla = tenVilla;
        this.soPhongNgu = soPhongNgu;
    }

    @Override
    public double tinhGiaThueCoBan() {
        if (soPhongNgu <= 2) {
            return giaCoBan + 3000000;
        } else if (soPhongNgu <= 5 && soPhongNgu > 2) {
            return giaCoBan + 3000000 + (soPhongNgu - 2) * 2000000;
        } else if (soPhongNgu > 5) {
            return giaCoBan + 3000000 + (soPhongNgu - 3) * 2000000 + (soPhongNgu - 5) * 1000000;
        }
        return 0;
    }
}
