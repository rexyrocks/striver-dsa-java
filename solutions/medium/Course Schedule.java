// Title: Course Schedule
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/course-schedule/

class Solution {
    private boolean hascycle(int node, List<List<Integer>> adj,boolean[] visited, boolean[] inpath){
      visited[node] = true;
      inpath[node] = true;
      for(int neighbour: adj.get(node)){
        if(inpath[neighbour]){
            return true;
        }
        if(!visited[neighbour]){
         if(hascycle(neighbour,adj,visited,inpath)){
            return true;
         }
