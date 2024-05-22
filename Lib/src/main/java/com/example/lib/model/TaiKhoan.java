package com.example.lib.model;

import java.io.Serializable;
import java.util.List;

public class TaiKhoan implements Serializable {
    private static String email;
    private String password;
    private boolean success;
    private List<Result> result;

    public TaiKhoan() {
    }
    public static class Result {
        public String getEmail() {
            return email;
        }
    }

    public TaiKhoan(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

