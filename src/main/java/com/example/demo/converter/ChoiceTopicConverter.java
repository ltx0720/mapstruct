package com.example.demo.converter;

import com.example.demo.model.Dto;
import com.example.demo.model.Query;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * @Author ltx
 * @Date 23:20 2020/8/5
 */
@Mapper
public interface ChoiceTopicConverter extends TopicConverter<Query, Dto> {

    ChoiceTopicConverter INSTANCE = Mappers.getMapper(ChoiceTopicConverter.class );

    @Override
    Query cast(Dto dto);
}
