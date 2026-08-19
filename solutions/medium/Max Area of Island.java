// Title: Max Area of Island
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/max-area-of-island/

          for(int k = 0; k< 4; k++){
            int nr  = r +dq[k];
            int nc = c+ dr[k];
             if( nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length   && grid[nr][nc] == 1 ){
             grid[nr][nc] = 0;
             area++;
             stack.push(new int[]{nr,nc});
            
            int c = cell[1];
            int r = cell[0];
            int[] cell = stack.pop();
        while(!stack.isEmpty()){
          }
