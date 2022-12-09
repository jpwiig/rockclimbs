package model;

public class SavedRoutes {
    private int id;
    private String userID;
    private String route;

    public SavedRoutes() {
    }

    public SavedRoutes(int id, String userID, String route) {
        this.id = id;
        this.userID = userID;
        this.route = route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
