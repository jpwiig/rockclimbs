package model;

public class countries {
    private int id;
    private String country;
    private String code;
    private String region;

    public countries() {
    }

    public countries(int id, String country, String code, String region) {
        this.id = id;
        this.country = country;
        this.code = code;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
