package cap.bean;

public class Province {
    private int provinceID;
    private String provinceName;

    public Province(){

    }

    public Province(int proviceID,String provinceName){
        this.provinceID=proviceID;
        this.provinceName=provinceName;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }


}
