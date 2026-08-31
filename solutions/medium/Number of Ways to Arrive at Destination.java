// Title: Number of Ways to Arrive at Destination
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/

ways[neighbour] = (ways[node] + ways[neighbour]) %MOD;
                }
            }
           }
        }
      return ways[n-1]%MOD;
  }
}
