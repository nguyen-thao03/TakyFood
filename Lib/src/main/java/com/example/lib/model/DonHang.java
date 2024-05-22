package com.example.lib.model;

import java.io.Serializable;
import java.util.List;

public class DonHang implements Serializable {
    public class DonHangResult implements Serializable {
        private int id;
        private String tenkhachhang;
        private String email;
        private String sodienthoai;
        private String tongtien;
        private String ghichu;



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTenkhachhang() {
            return tenkhachhang;
        }

        public void setTenkhachhang(String tenkhachhang) {
            this.tenkhachhang = tenkhachhang;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSodienthoai() {
            return sodienthoai;
        }

        public void setSodienthoai(String sodienthoai) {
            this.sodienthoai = sodienthoai;
        }

        public String getTongtien() {
            return tongtien;
        }

        public void setTongtien(String tongtien) {
            this.tongtien = tongtien;
        }

        public String getGhichu() {
            return ghichu;
        }

        public void setGhichu(String ghichu) {
            this.ghichu = ghichu;
        }
    }

    boolean success;
    String message;
    List<DonHang.DonHangResult> result;


    // Thêm getters và setters

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DonHang.DonHangResult> getResult() {
        return result;
    }

    public void setResult(List<DonHang.DonHangResult> result) {
        this.result = result;
    }
}
