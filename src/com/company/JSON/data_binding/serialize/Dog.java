package com.company.JSON.data_binding.serialize;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public   class Dog extends Pet{

        public int age;
        public String owner;


}
