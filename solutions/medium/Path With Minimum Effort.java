// Title: Path With Minimum Effort
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/path-with-minimum-effort/

         int neweffort =  Math.max(diff,creffort);
         if(neweffort < effort[nr][nc] ) queue.offer(new int[] {neweffort,nr,nc});
          }
           }
        }
        return 0;
    }
}
