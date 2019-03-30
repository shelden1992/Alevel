package com.company.designPattern.factoryPattern.dialog;

import com.company.designPattern.factoryPattern.Button;
import com.company.designPattern.factoryPattern.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }


}
