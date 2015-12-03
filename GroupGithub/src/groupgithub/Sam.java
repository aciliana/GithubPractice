/*
Sam's godlike code
*/
package groupgithub;


import java.io.*;

public class Sam {

    public static boolean lunhs(String str) {
        int[] nums = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = Integer.parseInt(str.substring(i, i + 1));
            if (i % 2 == 0) {
                nums[i] *= 2;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10) {
                sum += (int) (nums[i] / 10);
                sum += (nums[i] % 10);
            } else {
                sum += nums[i];
            }
        }
        return sum % 10 == 0;
    }

    public static void dataGrid() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\samssolutions\\DataGrid1.txt"));
            String[][] sGrid = new String[20][20];
            int[][] grid = new int[20][20];
            for (int i = 0; i < 20; i++) {
                sGrid[i] = br.readLine().split(" ");
                for (int j = 0; j < 20; j++) {
                    grid[i][j] = Integer.parseInt(sGrid[i][j]);
                }
            }
            
            //traverses through the array
            int highProd = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    //vertical searching
                    //up
                    int currentProd = 1;
                    if(i > 2) {
                        currentProd *= grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //down
                    if(i < 17) {
                         currentProd *= grid[i][j] * grid[i*1][j] * grid[i*2][j] * grid[i*3][j];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //horizontal searching
                    //left
                    if(j > 2)  {
                        currentProd *= grid[i][j] * grid[i][j-1] * grid[i][j-2] * grid[i][j-3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //right
                    if(j < 17)  {
                        currentProd *= grid[i][j] * grid[i][j*1] * grid[i][j*2] * grid[i][j*3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //diagonal searching
                    //upleft
                    if(j > 2 && i > 2)  {
                        currentProd *= grid[i][j] * grid[i-1][j-1] * grid[i-1][j-2] * grid[i-1][j-3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //upright
                    if(j < 17 && i > 2)  {
                        currentProd *= grid[i][j] * grid[i-1][j-1] * grid[i-1][j-2] * grid[i-1][j-3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //downleft
                    if(j < 17 && i > 2)  {
                        currentProd *= grid[i][j] * grid[i*1][j-1] * grid[i*2][j-2] * grid[i*3][j-3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                    //downright
                    if(j < 17 && i < 17)  {
                        currentProd *= grid[i][j] * grid[i*1][j*1] * grid[i*2][j*2] * grid[i*3][j*3];
                    }
                    if(currentProd > highProd) {
                        highProd = currentProd;
                    }
                    currentProd = 1;
                }
            }
            System.out.println(highProd);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}