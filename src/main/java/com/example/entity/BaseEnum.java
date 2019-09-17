package com.example.entity;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author iisheng
 * @date 2019/09/17 10:59:04
 */
public interface BaseEnum {
    /**
     * 获取 code
     *
     * @return
     */
    @JsonValue
    int getCode();

    static <E extends Enum<?> & BaseEnum> Optional<E> codeOf(Class<E> enumClass, int code) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getCode() == code).findAny();
    }
}
