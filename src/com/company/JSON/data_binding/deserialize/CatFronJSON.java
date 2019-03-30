package com.company.JSON.data_binding.deserialize;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
public class CatFronJSON {
    /**vК объектам, которые сериализуются/десериализуются в JSON есть несколько требований:

     1) поля должны быть видимые: или public или иметь getter’ы и setter’ы

     2) должен быть конструктор по умолчанию (без параметров)*/

    public String name;
    @JsonDeserialize(as=ArrayList.class,contentAs=CatFronJSON.class)

    public List<CatFronJSON> children = new ArrayList<>();
}


