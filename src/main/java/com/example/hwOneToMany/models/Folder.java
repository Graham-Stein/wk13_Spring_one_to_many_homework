package com.example.hwOneToMany.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private Long id;
    private User user;
    private List<File> files;

    public Folder(User user) {
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}