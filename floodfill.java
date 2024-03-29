import java.util.Scanner;

class Floodfill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean visited[][] = new boolean[m][n];
        floodfill(arr, 0, 0, "", visited);
        sc.close();
    }

    public static void floodfill(int[][] maze, int row, int col, String pfs, boolean[][] visited) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1
                || visited[row][col] == true) {
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(pfs);
            return;
        }
        visited[row][col] = true;
        floodfill(maze, row - 1, col, pfs + "t", visited);
        floodfill(maze, row, col - 1, pfs + "l", visited);
        floodfill(maze, row + 1, col, pfs + "d", visited);
        floodfill(maze, row, col + 1, pfs + "r", visited);
        visited[row][col] = false;
    }
}
