package com.example.demo.factory;

import com.example.demo.converter.ChoiceTopicConverter;
import com.example.demo.converter.TopicConverter;
import com.example.demo.model.DtoFather;
import com.example.demo.model.QueryFather;

/**
 * @Author ltx
 * @Date 23:34 2020/8/5
 */
public class ConverterFactory {

    public static TopicConverter<? extends QueryFather, ? extends DtoFather> getConverter(Integer type){
        switch (type){
            case 1:
                return ChoiceTopicConverter.INSTANCE;
        }

        return null;
    }
}
