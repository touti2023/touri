package Day0616.listdemo.test;

public class User {
    private String id;
    private String username;
    private String psw;

    public User() {
    }

    public User(String id, String username, String psw) {
        this.id = id;
        this.username = username;
        this.psw = psw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
