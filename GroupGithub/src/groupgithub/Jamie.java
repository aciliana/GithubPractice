/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupgithub;

import java.io.*;
/**
 *
 * @author alicia
 */
public class Jamie {
     public static boolean creditCardChecker(String credNum)
    {
        int sum = 0;
        int tempNum = 0;
        for (int i = 0; i < credNum.length(); i += 2)
        {
            tempNum = Integer.parseInt(credNum.substring(i,i+1)) * 2;
            if (tempNum >= 10)
            {
                sum += (tempNum % 10) + ((tempNum - (tempNum % 10)) / 10);
            }
            else
            {
                sum += tempNum;
            }
        }
        for (int i = 1; i < credNum.length(); i += 2)
        {
            tempNum = Integer.parseInt(credNum.substring(i,i+1));
            sum += tempNum;
        }
        
        if (sum % 10 == 0)
        {
            return true;
        }
        return false;
    }
    public static void fourMultiplyHighest()
    {
        try
        {
            FileReader fr = new FileReader("src\\groupgithub\\DataGrid1.txt");
            BufferedReader br = new BufferedReader(fr);
            String[][] stringGrid = new String[20][20];
            int numberGrid[][] = new int[20][20];
            for (int i = 1; i <= 10; i++)
            {
                stringGrid[i] = br.readLine().split(" ");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
