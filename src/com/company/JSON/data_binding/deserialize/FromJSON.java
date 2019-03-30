package com.company.JSON.data_binding.deserialize;

import com.company.JSON.data_binding.deserialize.CatFronJSON;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class FromJSON {
//    public static void main(String[] args) throws IOException{
//
//
//        String jsonString = "{ \"name\":\"Murka\", \"age\":5, \"weight\":4}";
//        StringReader reader = new StringReader(jsonString);
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        CatFronJSON cat = mapper.readValue(reader, CatFronJSON.class);
//
//        System.out.println(cat.age);
//    }

    public static void main(String[] args) throws IOException{
    Second s=(Second) convertOneToAnother(new First(), Second.class);
    First f=(First) convertOneToAnother(new Second(), First.class);
        System.out.println(s.i + s.name);
}

    public static Object convertOneToAnother(Object one, Class resultClassObject) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        StringWriter stringWriter=new StringWriter();
        mapper.writeValue(stringWriter, one);

        StringReader stringReader=new StringReader(stringWriter.toString().replace (one.getClass().getSimpleName().toLowerCase(),
                resultClassObject.getSimpleName().toLowerCase()));

        System.out.println(stringWriter.toString());
        System.out.println(stringReader.toString());

        return mapper.readValue(stringReader, resultClassObject);
    }

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="className")
@JsonSubTypes(@JsonSubTypes.Type(value=First.class, name="first"))
public static class First {
    public int i = 1;
    public String name = "Vasia";
}

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="className")
@JsonSubTypes(@JsonSubTypes.Type(value=Second.class, name="second"))
public static class Second {
    public int i =2;
    public String name= "Petia";
}
}
