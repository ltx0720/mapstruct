package com.example.demo.controller;

import com.example.demo.converter.TopicConverter;
import com.example.demo.factory.ConverterFactory;
import com.example.demo.model.Dto;
import com.example.demo.model.DtoFather;
import com.example.demo.model.Query;
import com.example.demo.model.QueryFather;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ltx
 * @Date 23:41 2020/8/5
 */
@RestController
@SuppressWarnings("unchecked")
public class TestController {

    @RequestMapping("/test")
    public void test(){
        TopicConverter converter = ConverterFactory.getConverter(1);

        DtoFather df = new Dto("1");
        df.setHight("2");

        assert converter != null;
        QueryFather query = converter.cast(df);

    }
}
