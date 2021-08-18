package com.example.birthdaynote;

public class Notes {
    private String name;
    private String desc;

    public Notes(String name, String desc) {
        this.desc = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
