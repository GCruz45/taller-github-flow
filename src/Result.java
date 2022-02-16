import java.io.*;
import java.util.*;
import java.util.stream.*;
// Based on Simple Array Sum problem of HackerRank
class Result {
 // Complete the 'simpleArraySum' function below.
 // The function is expected to return an INTEGER.
 public static int simpleArraySum(List<Integer> ar) {
	 int result = 0;
	Iterator<Integer> iterator = ar.iterator();
         while (iterator.hasNext()) {
		 result += iterator.next();
	}
	return result;
 }
}
