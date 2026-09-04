// Title: Number of Operations to Make Network Connected
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-operations-to-make-network-connected/

            else{
                union(a,b);
                components--;
            }
        }
            return components-1;
    }
}
