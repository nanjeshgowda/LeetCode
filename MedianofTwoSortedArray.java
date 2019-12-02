﻿import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 // Complete the jumpingOnClouds function below.
 static int jumpingOnClouds(int[] clouds) {

  int numClouds = clouds.length - 1;
  int currCloud = 0;
  int jumps = 0;

  while (currCloud != numClouds) {
   boolean canJumpOverCloud = (currCloud + 2 <= numClouds) && (clouds[currCloud + 2] == 0);
   currCloud += canJumpOverCloud ? 2 : 1;
   jumps++;
  }
  return jumps;

 }

 private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) throws IOException {
  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

  int n = scanner.nextInt();
  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

  int[] c = new int[n];

  String[] cItems = scanner.nextLine().split(" ");
  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

  for (int i = 0; i < n; i++) {
   int cItem = Integer.parseInt(cItems[i]);
   c[i] = cItem;
  }

  int result = jumpingOnClouds(c);

  bufferedWriter.write(String.valueOf(result));
  bufferedWriter.newLine();

  bufferedWriter.close();

  scanner.close();
 }
}