/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

/**
 *
 * @author pc
 */
public final class MyUtil {
    public static double calculateBMI(double weight,double height){
        double BMI = weight/((height*height)/10000);
        return BMI;
    }
    public static double average(int v1,int v2,int v3){
        double avg = (v1+ v2+v3) / 3;
        return avg;
    }
    
}
