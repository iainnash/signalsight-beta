package com.projecttango.experiments.augmentedrealitysample;

/**
 * Created by Jake on 2016-02-21.
 */
public class Utils {
    public static String AryToString(int[][] grid) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < grid.length; i++) {
            for (int j=0;j<grid[0].length;j++) {
                sb.append(grid[i][j]);
                sb.append(",");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
