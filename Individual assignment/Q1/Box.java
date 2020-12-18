package com.company;

public class Box {
    private final int L1;
    private final int H1;
    private final int W1;
    private final int Weight;


    public Box() {
        this.L1 = 0;
        this.H1 = 0;
        this.W1 = 0;
        this.Weight = 0;
    }

    public Box(int l, int w, int h, int weight) {
        this.L1 = l;
        this.H1 = h;
        this.W1 = w;
        this.Weight = weight;
    }

    int calculateVolume()
    {
        int volume;
        volume=L1*H1*W1;
        return volume;
    }
    double calculateDensity()
    {
        int volume=calculateVolume();
        double density;
        density=Weight/(double)volume;
        return density;
    }
}
