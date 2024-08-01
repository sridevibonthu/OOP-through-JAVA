class StringTest{
	public static void main(String args[]){
		String s1 = "Technology";
		
		//System.out.println(s1.charAt(30));
		System.out.println(s1.startsWith("Tec"));
		System.out.println("ppppp".startsWith("Tec"));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.concat(" at vit"));
		
		String s3 = "       hello   ";
		System.out.println(s1.toLowerCase() + "   " + s1.toUpperCase());
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String s4 = " V I T ";
		String s5 = s4.replace(" ", "");
		
		System.out.println(s4);
		System.out.println(s5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}