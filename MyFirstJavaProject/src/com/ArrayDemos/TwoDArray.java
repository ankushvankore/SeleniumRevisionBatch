package com.ArrayDemos;

public class TwoDArray
{
    public static void main(String[] args) {
        int[][]matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
