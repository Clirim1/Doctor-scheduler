
import java.util.*;
public class UserMain {
    public static void main(String[] args) {
         UserController a=new UserController();
        // a.proceso();
         UserVIew v=new UserVIew(a);
        a.view(v);
         a.proceso();
      
    }
}