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



class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query)
    {
    // Write your code here
        Map<String, Integer> mp = new HashMap<>();
        ArrayList<String> q = new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        
        for(int i=0; i< dictionary.size();i++)
        {
            char[] chAr = dictionary.get(i).toCharArray();
            Arrays.sort(chAr);
            String sortedString = new String(chAr);
            if (mp.containsKey(dictionary.get(i)))
                mp.put(dictionary.get(i), mp.get(dictionary.get(i)) + 1);
            else
                mp.put(dictionary.get(i), 1);
        }
        
        for(int i=0; i< query.size();i++)
        {
            char[] chAr = query.get(i).toCharArray();
            Arrays.sort(chAr);
            String sortedString = new String(chAr);
            q.add(sortedString);
        }
        for(int i=0; i< q.size();i++)
        {
            String search=q.get(i);
            if(!mp.containsValue(search))
                ret.add(0);
            else
                ret.add(mp.get(search));
        }
        return ret;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.stringAnagram(dictionary, query);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
