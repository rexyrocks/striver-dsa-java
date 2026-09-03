// Title: Min Cost to Connect All Points
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/min-cost-to-connect-all-points/

        return parents[x];
    }
    void union(int x, int y){
        int rootx = find(x) , rooty = find(y);
        if(rootx != rooty) parents[rootx] = rooty;
    }
}
