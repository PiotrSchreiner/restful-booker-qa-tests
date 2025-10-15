package com.booker.models;

public class Auth {

    private String username;
    private String password;

    // Konstruktor
    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Standard-Konstruktor für Deserialisierung
    public Auth() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}