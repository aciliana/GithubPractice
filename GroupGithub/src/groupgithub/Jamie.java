/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupgithub;

import java.io.*;
/**
 *
 * @author JAMIE
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
        
        return sum % 10 == 0;
    }
    public static String[][] fourNumberMultiply(String grid)
    {
        try
        {
            FileReader fr = new FileReader("src\\groupgithub\\DataGrid1.txt");
            BufferedReader br = new BufferedReader(fr);
            String[][] numberGrid = new String[20][20];
            String line;
            for (int i = 1; i <= 10; i++)
            {
                line = br.readLine();
                for (int j = 1; i <= 10; i++)
                {
                
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
