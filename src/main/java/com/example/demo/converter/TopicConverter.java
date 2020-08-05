package com.example.demo.converter;

import com.example.demo.model.DtoFather;
import com.example.demo.model.QueryFather;

/**
 * @Author ltx
 * @Date 23:19 2020/8/5
 */
public interface TopicConverter<T extends QueryFather, R extends DtoFather> {
    T cast(R r);
}
