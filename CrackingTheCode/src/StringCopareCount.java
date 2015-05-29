
public class StringCopareCount {
	
	public String compare(String s1){
		
		StringBuffer sb= new StringBuffer();
		
		int c=1;
		char prev=s1.charAt(0);
		for(int i=1;i<s1.length();i++){
			char curr=s1.charAt(i);
			
			if(prev==curr){
				c++;
			}
			else{
				sb.append(prev);
				sb.append(c);
				prev=curr;
				c=1;
			}
			
			
		}
		
		sb.append(prev);
		sb.append(c);
		if(s1.length()<sb.length()){
			return s1;
		}else{
			return sb.toString();
		}
		
	
		
	}

	public static void main(String args[]){
		
		String s="jjuuuuugggggaaaaaalllllllllllllllllll";
		
		StringCopareCount count= new StringCopareCount();
		System.out.println("Compression of " + s + " is : " +count.compare(s));
				
	}
}
