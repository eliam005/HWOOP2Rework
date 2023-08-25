package ru.netology.javaqa.HWOOOP;

public class Radio {

    public int radiostation;
    public int volume;

    public int getRadiostation() {
        return radiostation;
    }

    public void nextRadio() {

        if (radiostation != 9) {
            radiostation++;
        } else {
            radiostation = 0;
        }
    }

    public void prevRadio() {

        if (radiostation != 0) {
            radiostation--;
        } else {
            radiostation = 9;
        }

    }

    public void nextVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }


        public void prevVolume() {
            if (volume > 0) {
                volume--;
            } else {
                volume = 0;
            }
        }




    public void setRadiostation(int radiostation) {
        if (radiostation < 0) {
            return;
        }

        if (radiostation > 9) {
            return;
        }

        this.radiostation = radiostation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }

        if (volume > 100) {
            return;
        }

        this.volume = volume;
    }
}
