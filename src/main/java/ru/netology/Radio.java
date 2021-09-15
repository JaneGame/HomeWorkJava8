package ru.netology;

public class Radio {
    private int radioStation;
    private int volume;
    int maxStation = 9;
    int minStation = 0;

    public int StationNext(int radioStation){
        if (radioStation==9)
            radioStation = 0;
        else radioStation=radioStation+1;
        return radioStation;
    }

    public int StationPrev(int radioStation){
        if (radioStation==0)
            radioStation = 9;
        else radioStation=radioStation-1;
        return radioStation;
    }

    public void setChoiceStation(int radioStation){
        if (radioStation>maxStation){
            return;
        }
        if (radioStation<minStation) {
            return;
        }
        this.radioStation=radioStation;
    }


    public int getRadioStation(){
        return radioStation;
    }



    public int VolumePlus(int volume){
        if (volume==10)
            volume = 10;
        else volume=volume+1;
        return volume;
    }

    public int VolumeMinus(int volume){
        if (volume==0)
            volume = 0;
        else volume=volume-1;
        return volume;
    }


}


