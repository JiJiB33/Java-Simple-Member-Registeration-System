/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PGAssignment;

/**
 *
 * @author Ji Ji
 */
public class Sorting {
    public static void nameSort(String[] regname) {
        for (int j = 0; j < regname.length; j++) {
            int min=j;
                for (int k = j+1; k < regname.length; k++) {
                    if (regname[k].compareTo(regname[min])<0) {
                        min=k;
                        String temp=regname[j];
                        regname[j]=regname[min];
                        regname[min]=temp;
                    }
                }
            }
        }
}


