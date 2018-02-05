package info.yangguo.perseus.test.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;

    private String type;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
