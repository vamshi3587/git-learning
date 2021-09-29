import java.util.ArrayList;
import java.util.List;

public class TwoClass {
public static void main(String[] args) {
	List <Boolean> list = new ArrayList<>();

list.add(true);

list.add(Boolean.parseBoolean("False"));

list.add(Boolean.FALSE);

System.out.print(list.size()); System.out.print(list.get (1) instanceof Boolean);
Userdata userdata=new Userdata();
userdata.setId(15);
userdata.setName("Sai");
System.out.println(userdata.getId() +" "+ userdata.getName());
}
}
