package com.company.workWithFileAndDirectory;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter { //класс исключение имплеметирует интерфейс если не использовать listFile
    String ext;
    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
