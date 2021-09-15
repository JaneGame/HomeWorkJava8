package ru.netology;

public class Radio {
    private int radioStation;
    private int volume;

    public int setStationNext(int radioStation){
        if (radioStation==9)
            radioStation = 0;
        else radioStation=radioStation+1;
        return radioStation;
    }

    public int setStationPrev(int radioStation){
        if (radioStation==0)
            radioStation = 9;
        else radioStation=radioStation-1;
        return radioStation;
    }

    public int choiceStation(int radioStation){
        if (radioStation>9)
            return this.radioStation;
        if (radioStation<0)
            return this.radioStation;
        else  return radioStation;
    }

    public int setVolumePlus(int volume){
        if (volume==10)
            volume = 10;
        else volume=volume+1;
        return volume;
    }

    public int setVolumeMinus(int volume){
        if (volume==0)
            volume = 0;
        else volume=volume-1;
        return volume;
    }


}


