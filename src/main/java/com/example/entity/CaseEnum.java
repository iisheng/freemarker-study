package com.example.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author iisheng
 * @date 2019/09/17 10:24:04
 */
public enum CaseEnum implements BaseEnum {

    /**
     * logo/vi 设计
     */
    LOGO(1),
    /**
     * 画册设计
     */
    ALBUM(2),
    /**
     * 包装设计
     */
    PACKAGE(3),
    /**
     * 文化墙设计
     */
    CULTURE(4),
    /**
     * 线上与宣传
     */
    PROPAGANDA(5);

    private final int code;

    @JsonCreator
    public static CaseEnum create(String name) {
        try {
            return CaseEnum.valueOf(name);
        } catch (IllegalArgumentException e) {
            int code = Integer.parseInt(name);
            for (CaseEnum value : CaseEnum.values()) {
                if (value.code == code) {
                    return value;
                }
            }
        }
        throw new IllegalArgumentException("No element matches " + name);
    }

    CaseEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}

