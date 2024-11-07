package Optional;

import java.util.Optional;

public class TestOne {
    public static void main(String[] args) {
        String ename=null;
        Optional<String> opt=Optional.ofNullable(ename);
        if (opt.isPresent()){
            System.out.println(opt.get().length());
        }

        System.out.println("GM");
    }
}
