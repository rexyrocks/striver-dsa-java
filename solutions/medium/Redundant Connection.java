// Title: Redundant Connection
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/redundant-connection/

    int find(int x){
        if (parents[x]!= x){
        parents[x] = find(parents[x]);}
        return parents[x];
    }
    void union(int x , int y){
        parents[find(x)] = find(y);
    }
}
