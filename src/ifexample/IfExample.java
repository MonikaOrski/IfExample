package ifexample;

public class IfExample {
	
	public static void main(String[] args){
		int a = 1, b =2;
		if ((a==1) && (b==2)) {
			System.out.println("First if true");
		}
		if ((a==1) || (b==3)){
			System.out.println("Second if true");	
		}
		if (!(a==1) || !(b==2)){
			System.out.println("Third if true");
		}
		if (!(a==1) || !(b==3)){
			System.out.println("Forth if true");
		}
	}

}
