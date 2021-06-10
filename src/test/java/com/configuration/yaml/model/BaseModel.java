package com.configuration.yaml.model;

import java.util.Objects;

public class BaseModel {
    private String url;
    private String eTitle;
    private String login;
    private String password;
    private String accountName;

    public BaseModel() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseModel baseModel = (BaseModel) o;
        return url.equals(baseModel.url) &&
                eTitle.equals(baseModel.eTitle) &&
                login.equals(baseModel.login) &&
                password.equals(baseModel.password) &&
                accountName.equals(baseModel.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, eTitle, login, password, accountName);
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "url='" + url + '\'' +
                ", eTitle='" + eTitle + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
