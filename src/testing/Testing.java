/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

///
// *
//// * @author haseena
// */
import junit.framework.Assert;
public class Testing {

//    /
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Assert.assertEquals(9, demo(4,5));
//        Assert.assertEquals(demo(4,9), true);
Assert.assertEquals('A', grade(50));
    }

    public static int demo(int x,int y){
        return x+y;
    }
    
    public static char grade(int number){
        if(number <40){
            return 'D';
        }
        else if(number<60){
            return 'A'; 
        }
        return 0;
    }
}
