package com.day1;

import java.util.ArrayList;
import java.util.List;

public class JavaBasicPractice {
    public static void main(String[] args) {
        System.out.println("JavaBasic_Practice");

        int ans = Task1(-12345);
        System.out.println(ans);

        Task2();

        Task3("Programming");

        Task4("25", "5000", "true");

        System.out.println(Task5("test", "teee"));

        System.out.println(Task6(6, 12));

        Task7();

        System.out.println(Task8("Programming"));

        Task9("aabbcc");

        Task10();

        System.out.println(Task11("pwwkew"));

        Task12("abc");

        Task13("Java is easy to learn");

        Task14();

        Task15();

        System.out.println(Bonus("babad"));
    }

    public static int Task1(int num) {
        System.out.println(num);

        int res = 0;
        while (num != 0) {
        	if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
        		System.out.println("Overflow detected");
        		return -1;
        	}
            int digit = num % 10;
            res = (res * 10) + digit;
            num /= 10;
        }
        
        return res;
    }


    public static void Task2() {
        int a = 10;
        double d = 3.5;

        int res = (int)(a + d);
        System.out.println(res);

        char ch = 'A';
        int value = ch + 5;

        System.out.println(ch);
        System.out.println((char)value);
    }

    private static boolean IsVowel(char c) {
    	return "AEIOUaeiou".indexOf(c) != -1;
    }
    
    public static void Task3(String str) {
        int vowelCnt = 0;
        int consCnt = 0;
        for (int i = 0; i < str.length(); ++i) {
        	if (!Character.isLetter(str.charAt(i))) continue;
            if (IsVowel(str.charAt(i))) vowelCnt++;
            else consCnt++;
        }
        System.out.println("Number of Vowels: " + vowelCnt);
        System.out.println("Number of Consonants: " + consCnt);
    }

    public static void Task4(String age, String salary, String active) {
        Integer intAge = Integer.parseInt(age);
        double salDbl = Double.parseDouble(salary);
        boolean activeBool = Boolean.parseBoolean(active);

        System.out.println(intAge);
        System.out.println(activeBool);

        System.out.println(salDbl);
        salDbl += salDbl * 0.1;
        System.out.println(salDbl);
    }

    public static boolean Task5(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String s = s1.toLowerCase();
        String t = s2.toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
        }

        for (int num : count)
            if (num != 0) return false;

        return true;
    }

    public static int Task6(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return a;
    }

    private static void modify(int x) { x = 100; }
    private static void modifyArray(int[] arr) { arr[0] = 100; }
    public static void Task7() {
        int a = 10;
        int[] numbers = {10, 20, 30};

        modify(a);
        modifyArray(numbers);

        System.out.println(a);
        System.out.println(numbers[0]);
    }

    public static String Task8(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == s.charAt(i)) {
                    found = true;
                    break;
                }
            }
            if (!found) sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void Task9(String s) {
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++)
            chars[s.charAt(i)]++;
        
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character.");
    }

    public static void Task10() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println(sb);
        System.out.println(s1);
    }

    public static int Task11(String s) {
        if (s.isEmpty()) return 0;

        int left = 0, right = 0, maxLen = 0;
        int[] count = new int[128];
        while (right < s.length()) {
            while (count[s.charAt(right)] != 0)
                count[s.charAt(left++)]--;
            count[s.charAt(right++)]++;
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }

    public static void Task12(String s) {
    	if (s.isEmpty()) return;
    	
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
            else {
                sb.append(c);
                sb.append(count);
                count = 1;
                c = s.charAt(i);
            }
        }
        sb.append(c);
        sb.append(count);
        System.out.println(sb.toString());
    }

    public static void Task13(String s) {
        String[] words = s.split(" ");
        for (String word : words) System.out.println(word);
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void Task14() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("Test" + i);
        }

        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            bf.append("Test" + i);
        }
    }

    static class Employee {
        int id;
        String name;
        double salary;
        float bonus;
        boolean status;

        Employee(int id, String name, double salary, float bonus, boolean status) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.bonus = bonus;
            this.status = status;
        }

        @Override
        public String toString() {
            double finalSalary = this.salary + (this.salary * this.bonus);
            String reveresed = new StringBuilder(this.name).reverse().toString();
            boolean salaryAbove = finalSalary >= 750000;
            return "Employee ID: " + this.id + "\tName: " + this.name + "\tBasic Salary:" + this.salary +
                    "\tBonus Percentage: " + this.bonus + "\tFinal Salary: " + finalSalary +
                    "\tStatus: " + this.status + "\t Reversed Name:" + reveresed + "\tSalary above 75000: " + salaryAbove;
        }
    }

    public static void Task15() {
        String[][] rawData = {
            {"101", "Alice Johnson", "60000", "15", "true"},
            {"102", "Bob Smith",     "80000", "20", "true"},
            {"103", "Carol White",   "45000", "10", "false"},
            {"104", "David Brown",   "abc",   "12", "true"},   // invalid salary
            {"105", "Eva Green",     "70000", "8",  "true"}
        };
        List<Employee> employees = new ArrayList<>();
        for (String[] employee : rawData) {
            int id = Integer.parseInt(employee[0]);
            String name = employee[1].toUpperCase();
            double salary;
            try {
                salary = Double.parseDouble(employee[2]);
            }
            catch (NumberFormatException e) {
                salary = -1.0;
            }
            float bonus = Float.parseFloat(employee[3]);
            boolean active = Boolean.parseBoolean(employee[4]);
            employees.add(new Employee(id, name, salary, bonus, active));
        }

        for(Employee e : employees)
            System.out.println(e.toString());
    }

    private static int expandCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left;
    }

    public static String Bonus(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = expandCenter(s, i, i), even = expandCenter(s, i, i + 1);
            int maxLen = Math.max(odd, even);
            if (maxLen > end - start) {
                start = i - ((maxLen - 1) >> 1);
                end = i + (maxLen >> 1);
            }
        }
        return s.substring(start, end);
    }
}
