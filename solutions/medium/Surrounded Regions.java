// Title: Surrounded Regions
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/surrounded-regions/

                if(nr >= 0 && nr < rows && nc >= 0 && nc < col && board[nr][nc] == 'O'){
                    stack.push(new int[]{nr,nc});
                   
                }
            }
        }
    }
}
