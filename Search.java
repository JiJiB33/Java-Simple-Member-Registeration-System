/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PGAssignment;

/**
 *
 * @author Ji Ji
 */
public class Search {
    static int NameSearch(String[]regname, String ath_name){
        int l=0, r=regname.length-1;
            while(l<=r){
                int m=(l+r)/2;

                int res=ath_name.compareTo(regname[m]);

                    if (res==0) {
                        return m;                
                    }
                    if (res>0) {
                        l=m+1;                
                    }
                    else{
                        r=m-1;
                    }
            }   
        return-1;           
    }    
   
}
