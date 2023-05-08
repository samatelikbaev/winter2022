import lombok.Getter;
import lombok.Setter;
import lombok.*;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
//@Data   :Data contains all methods

public class lombok {
    private String name;
    private int age;

    public lombok(String john, int i) {
    }

    public void sayhi(){
        System.out.println("hello "+name);
    }
    public void login(String username, String password){
        System.out.println("login");
    }
}
