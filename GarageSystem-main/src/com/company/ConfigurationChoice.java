package com.company;

public class ConfigurationChoice {

    public  void setConfiguration(int chooseConf,Configuration configuration)
    {
        if (chooseConf == 1)
            configuration = new FirstSlot();
        else
            configuration = new BestSlot();
    }

}
