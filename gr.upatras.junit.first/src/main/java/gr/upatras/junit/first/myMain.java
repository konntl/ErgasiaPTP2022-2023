package gr.upatras.junit.first;

public class myMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subtractpn s = new subtractpn();
		String result1 = s.subtractResult(9,1);
		String result2 = s.subtractResult(2,6);
		String result3 = s.subtractResult(5,5);
		System.out.println(result1+","+result2+","+result3);
	}
}
