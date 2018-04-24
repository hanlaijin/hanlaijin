package com.hlj.common.enums;

public enum BooleanEnum {
    TRUE(1),
    FALSE(0);

    private int code;

    BooleanEnum(int code) {
        this.code = code;
    }
}