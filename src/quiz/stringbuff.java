package quiz;

public class stringbuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("01234");
        sb.append(1.1).append('A').append(22).append(false).append("null").append(234567765f);
        System.out.println(sb);

    }
}
