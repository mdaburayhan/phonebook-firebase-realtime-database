package com.arsoft.phonebookapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    private String username;
    private String phoneNumber;
    private String groupUser;

    public User(String username, String phoneNumber, String groupUser) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.groupUser = groupUser;
    }

    public User() {
    }

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }

    @Bindable
    public String getGroupUser() {
        return groupUser;
    }

    public void setGroupUser(String groupUser) {
        this.groupUser = groupUser;
        notifyPropertyChanged(BR.groupUser);
    }
}
