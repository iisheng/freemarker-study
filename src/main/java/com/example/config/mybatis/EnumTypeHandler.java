package com.example.config.mybatis;

import com.example.entity.BaseEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Optional;

/**
 * @author iisheng
 * @date 2019/09/17 11:10:10
 */
@MappedTypes({BaseEnum.class})
public class EnumTypeHandler<E extends Enum<?> & BaseEnum> implements TypeHandler<E> {

    private Class<E> type;

    public EnumTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null ");
        }
        this.type = type;
    }

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, E parameter, JdbcType jdbcType) throws SQLException {
        if (parameter == null) {
            preparedStatement.setNull(i, Types.TINYINT);
        } else {
            preparedStatement.setInt(i, parameter.getCode());
        }
    }

    @Override
    public E getResult(ResultSet resultSet, String s) throws SQLException {
        int columnValue = resultSet.getInt(s);
        return resultSet.wasNull() ? null : enumOf(columnValue);
    }

    @Override
    public E getResult(ResultSet resultSet, int i) throws SQLException {
        int columnValue = resultSet.getInt(i);
        return resultSet.wasNull() ? null : enumOf(columnValue);
    }

    @Override
    public E getResult(CallableStatement callableStatement, int i) throws SQLException {
        int columnValue = callableStatement.getInt(i);
        return callableStatement.wasNull() ? null : enumOf(columnValue);
    }

    private E enumOf(int code) {
        final Optional<E> enumOpt = BaseEnum.codeOf(type, code);
        if (enumOpt.isPresent()) {
            return enumOpt.get();
        } else {
            throw new IllegalArgumentException("Cannot convert " + code + " to " + type.getSimpleName() + " by code value. ");
        }
    }
}
