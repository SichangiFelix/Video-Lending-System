/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author SICHANGI
 */
public class Algorithims {
    
    //constructor
    public Algorithims(){
        
    }
    
    //first method to calculate charge for damage or loss
    //this method will be called for each vid that was borrowed by the member
    public int calculateLossDamageCharge(boolean damaged, boolean lost ){
        int result;
        
        if(damaged == true || lost == true){
            result = 700;
        }
        else{
            result = 0;
        }
        return result;
    }
    
    public int computeCostOfBorrow(String Category, int days){
        int result2 = 0,resultOverdue = 0;
        int daysOverdue = days-3;
        
        if(days <= 3){

            switch(Category){
            case "Comedy":
                result2 = 70;
            case "General":
                result2 = 50;
            case "Horror":
                result2 = 40;
            case "Thriller":
                result2 = 60;
            case "Cartoon":
                result2 = 80;
            default:
                System.out.println("invalid input");
            }  
            return result2;
        }
        else{
            switch(Category){
            case "Comedy":
                resultOverdue = 70 + (daysOverdue * 42);
            case "General":
                resultOverdue = 50 + (daysOverdue * 30);
            case "Horror":
                resultOverdue = 40 + (daysOverdue * 24);
            case "Thriller":
                resultOverdue = 60 + (daysOverdue * 36);
            case "Cartoon":
                resultOverdue = 80 + (daysOverdue * 48);
            default:
                System.out.println("invalid input");
            }
            return resultOverdue;
        }
    }
    
    //in assuming that a video is lost, member is charged normal, overdue and loss cost
    //combine methods....computeCostOfBorrow() and calculateLossDamageCharge()
    
    
    //club revenue allocation method
    public void allocate(double revenue){
        double adminAllocation, salaryAllocation, miscellaneousAllocation, clubDevAllocation;
        //administration
        adminAllocation = (0.27 * revenue);
        //Salaries
        salaryAllocation = (0.54 * revenue);
        //miscellaneous
        miscellaneousAllocation = (0.07 * revenue);
        //club developement
        clubDevAllocation = (0.12 * revenue);
        
    }
    
    //main method
    public static void main(String[] args){
        
    }
}
