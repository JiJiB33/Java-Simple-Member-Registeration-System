/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PGAssignment;

/**
 *
 * @author Ji Ji
 */



import java.util.*;
public class MainProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

//  Method calling from other class       
        Sorting sort=new Sorting();
        Search s=new Search();
        

//  Registered name array list        
        String[] regname={"Kyaw Kyaw", "Thura Htun", "Pyae Thet", "La Yaung"};
            sort.nameSort(regname);
                System.out.println("Sorted registered members:" +Arrays.toString(regname) );
     
        System.out.print("Enter Your Name : ");
            String ath_name=scan.nextLine();

//  Name Searching Method calling         
        int result=s.NameSearch(regname,ath_name);     
            boolean findName=false;         
                if (result==-1) {
                    System.out.println("Unregistered! \nTo register, Please continue to fill the following forms");
                }
                else{
                    System.out.println("Registered Member!");
                }
        
       
//  Age                
        System.out.print("Enter Your Age : ");
            int age=Integer.parseInt(scan.nextLine());
                
//  Weight            
        int kg=0;
            boolean Kgvalid=true;
                while(Kgvalid){
                    System.out.print("Enter YOur Weight in kg : ");
                    kg=Integer.parseInt(scan.nextLine());

                        if (kg<=0) {
                            System.out.println("Invalid Weight");               
                        }     
                        else{
                            Kgvalid=false;
                        }
                }  
                
// Training Plan & competition       
        System.out.println("Choose Training Plan (Beginner / Intermediate / Elite) : ");
            String trn_pl=scan.nextLine();
        
        String bg="Beginner";
        String Im="Intermediate";
        String El="Elite";
        
        int wctg=0;
        int Cnum=0;
            if (trn_pl.equalsIgnoreCase(Im) || (trn_pl.equalsIgnoreCase(El))) {

                boolean valid=true;
                    while (valid)    {   
                        System.out.println("\n"+" \"Competitions are held on Second Staurday of each month\" \n");
                        
                        System.out.print("Choose Competition weight category in kg :");
                            wctg=Integer.parseInt(scan.nextLine());
                                if (wctg<=0) {
                                    System.out.println("Invalid Number!");                    
                                }

                                else{
                                    valid=false;
                                }                
                    }

                System.out.print("Numbers of competitions entered this month :");
                    Cnum=Integer.parseInt(scan.nextLine());            
            }   
        
//  Private Hour      
        int pt=0;
            boolean res=true;
                while(res){
                    System.out.println("Add numbers of hour for private coaching");
                        pt=scan.nextInt();
                            if (pt<0) {
                                System.out.println("Invalid Hour");                
                            }
                            else if (pt>5) {
                                System.out.println("Sorry! You get only maximum 5 hours"); 

                            }
                            else{
                                res=false;
                            }          
                }
        
        
        
        
        
//====================================Output Section================================ 

        System.out.println(" \n Calculating......Please Wait! \n ");
 
        System.out.println("Athlete's Name : "+ath_name);
        System.out.println("Athlete's Age : "+age);
        
//  Tution fees        
        double pt_total=0;
            pt_total=(int) (( pt*10.50)*4); //4 weeks per month
                System.out.printf("Private tution fee per month : %.2f$ \n",pt_total);

//  All cost        
        double totalcom=0;
            totalcom=Cnum*25;
        
        double allcost_1,allcost_2,allcost_3=0;
        double trntotal_1,trntotal_2,trntotal_3=0;
        
            if (trn_pl == bg) {
                trntotal_1=20*4;
                allcost_1=trntotal_1+pt_total + totalcom;

                System.out.printf("Itemized list of all cost per month : %.2f$ \n",allcost_1);
                System.out.printf("Total cost of training for a month : %.2f$ \n",trntotal_1);
            }
            else if (trn_pl == Im) {
                trntotal_2=35*4;
                allcost_2=trntotal_2 + pt_total + totalcom;

                System.out.printf("Itemized list of all cost per month : %.2f$ \n",allcost_2);
                System.out.printf("Total cost of training for a month : %.2f$ \n ",trntotal_2);
                System.out.printf("Total cost of competitions : %.2f$ \n",totalcom);
            }
            else   {
                trntotal_3=50*4;
                allcost_3=trntotal_3 + pt_total + totalcom;

                System.out.printf("Itemized list of all cost per month : %.2f$ \n",allcost_3);
                System.out.printf("Total cost of training for a month : %.2f$ \n",trntotal_3);
                System.out.printf("Total cost of competitions : %.2f$ \n \n",totalcom);
            }    
        
//  weight category        
            System.out.print("Your current weight compares to competition : "); 
                       
                if (kg>0 && kg<=66) {
                    System.out.println("Fly Weight");
                }

                else if (kg>66 && kg<=73) {
                    System.out.println("Light Weight");
                }

                else if (kg>73 && kg<=81) {
                    System.out.println("Light-Middle Weight");
                }

                else if (kg>81 && kg<=90) {
                    System.out.println("Middle Weight");
                }

                else if (kg>90 && kg<=100) {
                    System.out.println("Light-Heavy Weight");
                }

                else{
                    System.out.println("Heavy weight");
                }
     
           
    }  
        
 }
            
  
    
        
    
          
    
    
    
    
    
    
    
    
    

    
    
 
    
    
 



