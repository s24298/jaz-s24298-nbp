package pl.pjatk.s24298nbp;

public class Record {

    private String no;
    private String effectiveDate;
    private float mid;


    // Getter Methods

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public float getMid() {
        return mid;
    }

    // Setter Methods

    public void setNo(String no) {
        this.no = no;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setMid(float mid) {
        this.mid = mid;
    }

    public Record() {

    }

    public Record(String no, String effectiveDate, float mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }
}
