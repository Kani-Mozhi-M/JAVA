public class Replace {
    public static void main(String[] args) {
        int n = 706120678;
        String st = Integer.toString(n);
        int len = st.length();
        String st1 = "";
        for (int i = 0; i < len; i++) {
            if (st.charAt(i) == '0') {
                st1 += '1';
            } else
                st1 += st.charAt(i);
        }

        System.out.println("Converted number is: " + st1);

    }
}
