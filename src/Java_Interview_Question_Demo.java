import java.util.Arrays;
import java.util.stream.Collectors;

public class Java_Interview_Question_Demo {

	public static void main(String[] args) {
		
		String array[] = {"t","r","v"};
		String join=String.join("", array);
		System.out.println(join);
		
		String join1= Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining(""));
		System.out.println(join1);
		
		/* String joinedString(String seperator, String...values) {
			StringBuilder sb= new StringBuilder();
			int end=0;
			
			for(String s: values) {
				if(s!=null) {
					sb.append(s);
					end= sb.length();
					sb.append(";");
				}
			}
			return sb.substring(0, end); */
		}
		
		
		
	}


