package pl.pjatk.s24298nbp;

import java.util.ArrayList;

public class Data {

    private String table;
    private String currency;
    private String code;
    ArrayList<Record> rates = new ArrayList<Record>();

    public Data() {
    }

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Data{" +
                "rates=" + rates +
                '}';
    }
}
