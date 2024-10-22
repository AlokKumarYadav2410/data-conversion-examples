public class CharToBinary {
    public static void main(String[] args) {
        //You can modifiy according to your need.
        char[] arr = {'a','l','o','k'};
        StringBuilder s2 = new StringBuilder();
        for (int num : arr) {
            StringBuilder s1 = new StringBuilder();

            while(num > 0){
                int rem = num%2;
                s1.append(rem);
                num = num/2;
            }
            // Pad with leading zeros if necessary
            while (s1.length() < 8) {
                s1.append(0);
            }
            s1.reverse();
            s2.append(s1).append(" ");
        }
        System.out.println(s2);
    }
}

