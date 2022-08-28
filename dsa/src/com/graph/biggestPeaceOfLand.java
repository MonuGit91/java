package com.graph;

import java.util.*;


public class biggestPeaceOfLand {
static Scanner scan = new Scanner(System.in);
	
	static int direction[][] = {{0, -1}, 
								{0, +1},
								{-1, 0}, 
								{+1, 0}};
	
	static boolean valid(int n, int r, int c) {
	    return (r >= 0 && c >= 0 && r < n && c < n);
	}

	public static int dfs(int matrix[][], int n, int r, int c, boolean visited[][]) {
	    visited[r][c] = true;
	    int count = 1;//since current index of matrix is 1
	    for(int i = 0; i < 4; i++) {
	        int x = r + direction[i][0];
	        int y = c + direction[i][1];
	        
	        if(valid(n, x, y) && matrix[x][y] == 1 && !visited[x][y]) {
	            count += dfs(matrix, n, x, y, visited); 
	        }
	    }

	    return count;
	    
	}
	public static int getBiggestPieceSize(int matrix[][], int n) {
	    boolean visited[][] = new boolean[n][n];
	    for(int i = 0; i < n; i++) {
	    	Arrays.fill(visited[i], false);
	    }
	    
	    
	    int max = Integer.MIN_VALUE;
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            if(!visited[i][j] && matrix[i][j] == 1) {
	                max = Math.max(max, dfs(matrix, n, i, j, visited));
	            }
	        }
	    }
	    return max;
	}


	public static void main(String arg[]) {
	    int n;
	    n = scan.nextInt();//where n > 0

	    int matrix[][] = new int[n][n];

	    for (int i = 0; i < n; ++i) {
	        for (int j = 0; j < n; ++j) {
	            matrix[i][j] = scan.nextInt();
	        }
	    }

	    int ans =  getBiggestPieceSize(matrix, n);
	    
	    System.out.println(ans);
	}
}
/*
input 1:
3
1 1 0
0 0 0
1 1 1

output:
3

input 2:
3
1 1 1
0 1 0
1 1 1

output:
7
*/
