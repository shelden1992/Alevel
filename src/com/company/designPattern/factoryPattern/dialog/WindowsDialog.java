package com.company.designPattern.factoryPattern.dialog;

import com.company.designPattern.factoryPattern.Button;
import com.company.designPattern.factoryPattern.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
