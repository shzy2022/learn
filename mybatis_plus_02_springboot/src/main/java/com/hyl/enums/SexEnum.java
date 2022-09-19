package com.hyl.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum SexEnum implements IEnum<Integer> {
    MAN(1,"男"),
    WOMAN(2,"女");

    SexEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    @Override
    public Integer getValue() {
        return code;
    }

    @Override
    public String toString() {
        return "SexEnum{" +
                "value=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
