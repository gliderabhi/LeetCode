package codeAgon;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class IsItT {

    // Complete the solve function below.
    static String solve(List<List<Integer>> grid) {
        for(int i=1;i<grid.size()-1;i++){
            if(grid.get(i).get(0) == grid.get(i).get(0)+1 || grid.get(i).get(0) == grid.get(i).get(0)-1){

            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

                List<List<Integer>> points = new ArrayList<>();

                IntStream.range(0, 5).forEach(i -> {
                    try {
                        points.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    String result = solve(points);
                    try {
                        bufferedWriter.write(result);

                    bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}