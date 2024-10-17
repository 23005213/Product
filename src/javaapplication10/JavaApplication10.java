/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author thand
 */
import java.util.Scanner;

public class JavaApplication10 {
    public static int findProductIndex(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target ID
            if (productIDs[mid] == targetID) {
                return mid;
            }

            // Determine which side is sorted
            if (productIDs[left] <= productIDs[mid]) {
                // Left side is sorted
                if (productIDs[left] <= targetID && targetID < productIDs[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1;
                }
            } else {
                
                if (productIDs[mid] < targetID && targetID <= productIDs[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product ID to search for: ");
        int targetID = scanner.nextInt();

        int index = findProductIndex(productIDs, targetID);
        System.out.println("Index of product ID " + targetID + ": " + index);
        
        scanner.close();
    }
}


    