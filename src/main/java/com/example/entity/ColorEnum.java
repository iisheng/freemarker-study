package com.example.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author iisheng
 * @date 2019/09/22 22:35:09
 */
public enum ColorEnum implements BaseEnum {
    /**
     * 灰白
     */
    GRAY_WHITE(1),
    /**
     * 黑白
     */
    BLACK_WHITE(2);

    private final int code;

    ColorEnum(int code) {
        this.code = code;
    }

    @JsonCreator
    public static ColorEnum create(String name) {
        try {
            return ColorEnum.valueOf(name);
        } catch (IllegalArgumentException e) {
            int code = Integer.parseInt(name);
            for (ColorEnum value : ColorEnum.values()) {
                if (value.code == code) {
                    return value;
                }
            }
        }
        throw new IllegalArgumentException("No element matches " + name);
    }

    @Override
    public int getCode() {
        return code;
    }
}
