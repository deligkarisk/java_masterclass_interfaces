package com.deligkarisk;

import java.util.ArrayList;

public interface ISaveable {

    ArrayList<String> convertToSaveable();
    void readFromSaveable(ArrayList<String> parameters);
}
