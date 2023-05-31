package gr.upatras.junit.first;

public class subtractpn {
	public String subtractResult (int a, int b){
		if(a-b > 0) {
			return "POSITIVE";
		}else if (a-b<0) {
			return "NEGATIVE";
		}else {
			return "ZERO";
		}
	}
}