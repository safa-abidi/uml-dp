import java.util.*;

public abstract class CoupeGlacee  {
    protected ArrayList<Parfum> parfums;

    protected CoupeGlacee() {
        parfums = new ArrayList();
    }


    public String description() {
        StringBuilder sb = new StringBuilder("");
    int i = 0;
        for(Parfum parfum : this.parfums) {
            if(i != 0) {
                sb.append(" ");
            }

            i = 1;

            sb.append(parfum.toString());
        }

        return "coupe "+sb.toString();
    }


    public abstract float cout();
}