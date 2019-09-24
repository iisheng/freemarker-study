package com.example.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author iisheng
 * @date 2019/09/24 22:11:53
 */
public enum NewsEnum implements BaseEnum {
    /**
     * 最新新闻
     */
    LATEST(1),

    /**
     * 六合动态
     */
    ACTIVITY(2);

    private final int code;

    @JsonCreator
    public static NewsEnum create(String name) {
        try {
            return NewsEnum.valueOf(name);
        } catch (IllegalArgumentException e) {
            int code = Integer.parseInt(name);
            for (NewsEnum value : NewsEnum.values()) {
                if (value.code == code) {
                    return value;
                }
            }
        }
        throw new IllegalArgumentException("No element matches " + name);
    }

    NewsEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
