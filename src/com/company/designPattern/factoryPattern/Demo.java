package com.company.designPattern.factoryPattern;

import com.company.designPattern.factoryPattern.dialog.Dialog;
import com.company.designPattern.factoryPattern.dialog.HtmlDialog;
import com.company.designPattern.factoryPattern.dialog.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configurate();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();

    }

    private static void configurate() {
//        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog=new WindowsDialog();
//        } else {
//            dialog=new HtmlDialog();
//        }
    }


}
