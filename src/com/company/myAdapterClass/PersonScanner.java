package com.company.myAdapterClass;

import java.io.IOException;
import java.text.ParseException;

public interface PersonScanner {
    public Person read() throws IOException, ParseException;
    public void close() throws IOException;
}
