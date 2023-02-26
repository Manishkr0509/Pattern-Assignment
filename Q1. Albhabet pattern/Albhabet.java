import java.util.Scanner;

public class Albhabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {


// --------------------------------------------PATTERN A--------------------------------------------------------------------------------

            for (int j = 0; j < n; j++) {
                if (i==0||i==(n-1)/2||j==(n-1)||j==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");

// --------------------------------------------PATTERN B--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0||i==0&&j<n-1||i==n-1&&j<n-1||i==(n-1)/2&&j<n-1||j==n-1&&i>0&&i<(n-1)/2||j==n-1&&i<n-1&&i>(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

// --------------------------------------------PATTERN C--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0&&i>0&&i<n-1||i==0&&j>0||i==n-1&&j>0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

// --------------------------------------------PATTERN D--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0||i==0&&j<n-1||i==n-1&&j<n-1||j==n-1&&i>0&&i<(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

// --------------------------------------------PATTERN E--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0||i==0||i==n-1||i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

// --------------------------------------------PATTERN F--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0||i==0||i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

// --------------------------------------------PATTERN G--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1||i==(n-1)/2&&j>(n-1)/2&&j<n-1||i==0&&j>0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");


// --------------------------------------------PATTERN H--------------------------------------------------------------------------------
            for (int j = 0; j < n; j++) {
                if (j==0||j==n-1||i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
