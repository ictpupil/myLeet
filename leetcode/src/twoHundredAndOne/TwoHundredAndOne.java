package twoHundredAndOne;

public class TwoHundredAndOne {

	//public int ans = 0 ;
	
	public void sol(char[][] grid,int i,int j,int[][] vis) {
		
		
		
		if(grid[i][j]!='1') {
			return;
		}
		
		vis[i][j] = 1;
		if(i+1<grid.length&&vis[i+1][j]!=1) {
			sol(grid,i+1,j,vis);
		}
		if(j+1<grid[i].length&&vis[i][j+1]!=1) {
			sol(grid,i,j+1,vis);
		}
		if(i-1>=0&&vis[i-1][j]!=1) {
			sol(grid,i-1,j,vis);
		}
		if(j-1>=0&&vis[i][j-1]!=1) {
			sol(grid,i,j-1,vis);
		}
	}
	
	public int numIslands(char[][] grid) {

		int ans  = 0;
		int[][] vis = new int[grid.length][];
		for(int i = 0;i<vis.length;i++) {
			vis[i] = new int[grid[0].length];
		}
		System.out.println(vis[0][0]);
        for(int i =0;i< grid.length;i++) {
        	for(int j = 0;j<grid[i].length;j++) {
        		if(grid[i][j] == '1'&&vis[i][j]==0) {
        			System.out.println("kk");
        			vis[i][j] = 1;
        			ans++;
        			sol(grid,i,j,vis);
        		}
        		
        	}
        }
        return ans;
        
    }
	
	public static void main(String[] args) {
		char[][] grid = 
				{{'1','1','1','1','0'},
				 {'1','1','0','1','0'},
				 {'1','1','0','0','0'},
				 {'0','0','0','0','1'}};
		TwoHundredAndOne t = new TwoHundredAndOne();
		System.out.println(t.numIslands(grid));
		

	}

}
