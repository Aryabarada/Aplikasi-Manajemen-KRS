package com.company;

public class nilai {
    int tugas;
    int uts;
    int uas;

    public nilai(int tugas, int uas, int uts){
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public int getTugas() {
        return tugas;
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }

    public float nilai_akhir(){
        return (tugas+uts+uas)/3;
    }
}

