package com.generation.f20220601.modelos;

public class Michi extends Gato {

    private boolean famosoEnInternet;

    public Michi() {
    }

    public Michi(boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    public boolean isFamosoEnInternet() {
        return famosoEnInternet;
    }

    public void setFamosoEnInternet(boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    @Override
    public String toString() {
        return "Michi [" +
                "famosoEnInternet=" + famosoEnInternet +
                ']';
    }
}
