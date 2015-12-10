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
    public static void fourMultiplyHighest()
    {
        try
        {
            FileReader fr = new FileReader("src\\groupgithub\\DataGrid1.txt");
            BufferedReader br = new BufferedReader(fr);
            String[][] stringGrid = new String[20][20];
            int numberGrid[][] = new int[20][20];
            for (int i = 0; i <= 19; i++)
            {
                stringGrid[i] = br.readLine().split(" ");
                for (int j = 0; j <= 19; j++)
                {
                    numberGrid[i][j] = Integer.parseInt(stringGrid[i][j]);
                }
            }
            int greatestProduct = 0;
            int currentProduct = 0;
            for (int i = 0; i <= 19; i++)
            {
                //vertical
                if (i <= 16)
                {
                    for (int j = 0; j <= 19; j++)
                    {
                        currentProduct = numberGrid[i][j] * numberGrid[i+1][j] * numberGrid[i+2][j] * numberGrid[i+3][j];
                        if (currentProduct > greatestProduct)
                        {
                            greatestProduct = currentProduct;
                        }
                    }
                    //up left to down right
                    for (int m = 0; m <= 16; m++)
                    {
                        currentProduct = numberGrid[i][m] * numberGrid[i+1][m+1] * numberGrid[i+2][m+2] * numberGrid[i+3][m+3];
                        if (currentProduct > greatestProduct)
                        {
                            greatestProduct = currentProduct;
                        }
                    }
                    //up right to down left
                    for (int n = 3; n <= 19; n++)
                    {
                        currentProduct = numberGrid[i][n] * numberGrid[i+1][n-1] * numberGrid[i+2][n-2] * numberGrid[i+3][n-3];
                        if (currentProduct > greatestProduct)
                        {
                            greatestProduct = currentProduct;
                        }
                    }
                }
                //horizontal
                for (int k = 0; k <= 16; k++)
                {
                    currentProduct = numberGrid[i][k] * numberGrid[i][k+1] * numberGrid[i][k+2] * numberGrid[i][k+3];
                    if (currentProduct > greatestProduct)
                    {
                         greatestProduct = currentProduct;
                    }
                }
                
                
            }
            br.close();
            System.out.println(greatestProduct);
            
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
    public static void letterCount()
    {
        int letterAmount = 0;
        String currentNumber;
        for (int i = 1; i <= 9999; i++)
        {
            currentNumber = "";
            switch (i % 100) 
            {
                //add 3 letters if the tens and ones are 1, 2, 4, 6
                case 1:
                case 2:
                case 6:
                case 10:
                    currentNumber += "aaa";
                    break;
                //add 4 letters if 4, 5, 9
                case 4:
                case 5:
                case 9:
                    currentNumber += "aaaa";
                    break;
                //add 5 letters if 3, 7, 8
                case 3:
                case 7:
                case 8:
                    currentNumber += "aaaaa";
                    break;
                //add 6 letters if 11, 12
                case 11:
                case 12:
                    currentNumber += "aaaaaa";
                    break;
                //add 7 letters if 15, 16
                case 15:
                case 16:
                    currentNumber += "aaaaaaa";
                    break;
                //add 8 letters if 13, 14, 18, 19
                case 13:
                case 14:
                case 18:
                case 19:
                    currentNumber += "andaaaaaaaa";
                    break;
                //add 9 letters if 17
                case 17:
                    currentNumber += "andaaaaaaaaa";
                    break;
                default:
                    break;
            }
            if ((i % 100 >= 40 && i % 100 <= 69) )
            {
                currentNumber += "ccccc";
                switch (i % 10)
                {
                    case 1:
                    case 2:
                    case 6:
                        currentNumber += "ddd";
                        break;
                    case 4:
                    case 5:
                    case 9:
                        currentNumber += "dddd";
                        break;
                    case 3:
                    case 7:
                    case 8:
                        currentNumber += "ddddd";
                        break;
                    default:
                        break;
                }
            }
            else if ((i % 100 >= 20 && i % 100 <= 39) || (i % 100 >= 80 && i % 100 <= 99))
            {        
                currentNumber += "cccccc";
                switch (i % 10)
                {
                    case 1:
                    case 2:
                    case 6:
                        currentNumber += "ddd";
                        break;
                    case 4:
                    case 5:
                    case 9:
                        currentNumber += "dddd";
                        break;
                    case 3:
                    case 7:
                    case 8:
                        currentNumber += "ddddd";
                        break;
                    default:
                        break;
                }
            }
            else
            {
                currentNumber += "ccccccc";
                switch (i % 10)
                {
                    case 1:
                    case 2:
                    case 6:
                        currentNumber += "ddd";
                        break;
                    case 4:
                    case 5:
                    case 9:
                        currentNumber += "dddd";
                        break;
                    case 3:
                    case 7:
                    case 8:
                        currentNumber += "ddddd";
                        break;
                    default:
                        break;
                }
            }
            
                    
                    
                    
                    
                    
            if (i > 100)
            {
                //"and" will be before tens if number is greater than 100
                if (i % 100 != 0)
                {
                    currentNumber += "and";
                }
                if (i % 1000 >= 100)
                {
                    currentNumber += "hundred";
                    if (i % 1000 <= 299 || (i % 1000 >= 600 && i % 1000 <= 699))
                    {
                        currentNumber += "lol";
                    }
                    else if ((i % 1000 <= 400 && i % 1000 >= 599) || i % 1000 >= 900)
                    {
                        currentNumber += "lolo";
                    }
                    else if (i % 1000 <= 300 && i % 1000 >= 399 || (i % 1000 >= 700 && i % 1000 <= 899))
                    {
                        
                    }
                }
            }
        }
    }
}
