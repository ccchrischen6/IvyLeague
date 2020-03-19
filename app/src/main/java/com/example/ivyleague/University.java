package com.example.ivyleague;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String info;
    private Integer icon;

    public University(String name, String info, Integer icon) {
        this.name = name;
        this.info = info;
        this.icon = icon;
        Universities.add(this);
    }



    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public Integer getIcon() {
        return icon;
    }


}
