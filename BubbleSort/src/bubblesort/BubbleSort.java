/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;
import java.util.Scanner;
/**
 *
 * @author Hann17-FIA-Stud02
 */
public class BubbleSort 
{
    static int[] feld = new int[6];
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        einlesen();
        abc(feld);
        ausgeben();
    }
    
    public static void einlesen()
    {
       for(int i = 0; i<feld.length; i++)
        {
            feld[i]= sc.nextInt();
        } 
    }
    
    public static void ausgeben()
    {
       for(int i = 0; i<feld.length; i++)
        {
            System.out.print(feld[i]+" ");
        } 
    }
    
    public static void abc(int [] feld)
    {
        int temp;
        do 
        {
            temp = feld[0];
            for (int j = 1; j < feld.length; j++)
            {
                if (feld[j] < feld[j-1]) 
                {
                    temp = feld[j-1];
                    feld[j-1] = feld[j]; feld[j] = temp;
                }
            }
       } while (temp != feld[0]);
   }

                }
