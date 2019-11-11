package linklistproblem;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TestClass {

    public void printFizzBuzz(int totalVal) throws IOException {
        for (int i = 1; i <= totalVal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        TestClass obj = new TestClass();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int no_of_testcase = Integer.parseInt(bf.readLine());
        String inp[] = bf.readLine().split(" ");
        int inputs_size = inp.length;
        //System.out.println(t);
        if (inputs_size == no_of_testcase) {
            try {
                ArrayList<Integer> list1 = new ArrayList<Integer>();

                for (int index = 0; index < no_of_testcase; index++) {
                    list1.add(Integer.parseInt(inp[index]));
                }
                for (Integer val : list1) {
                    obj.printFizzBuzz(val);
                }

            } catch (Exception e) {

              e.getMessage();
            }
        }
        else {
            System.out.println("input are not suffient As per no of testcases");
        }
    }

}


