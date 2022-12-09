package model;

public class Route {
    private int id;
    private String grade;
    private String countryCode;
    private String users;

    public Route() {
    }

    public Route(int id, String grade, String countryCode, String users) {
        this.id = id;
        this.grade = grade;
        this.countryCode = countryCode;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
