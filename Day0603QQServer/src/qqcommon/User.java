package qqcommon;


import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVerionUID = 1L;//增强兼容性
    private String userId;
    private String passwd;

    public User() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;


    }
}

