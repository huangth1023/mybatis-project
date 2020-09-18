package com.dcits.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/18 16:11
 * @Version:
 * @Description:
 */
public class MyTypeHandler implements TypeHandler<String> {
    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
