package learning;

public class Lesson4Action {

	/**
	 * l₯Z·ι
	 * <pre>
	 * "\"Λ"\\\\"
	 * "+"Λ"\\+"
	 * "*"Λ"\\*"
	 * "."Λ"\\."
	 * </pre>
	 * @param args
	 */
	public static void main(String[] args) {
		//α@
//		CharSequence seq = "123456";
//		StringBuilder sb = new StringBuilder(seq);
//		System.out.println(seq);

		//αA
		/**
		 * parseInt VS valueOfiαO­Ά¦ͺκj
		 * parseInt π¨©ίiptH[}X’j
		 */
		try {
//			int i1 = Integer.parseInt("");
//			System.out.println("i1Ν " + i1 );//αO
//			int i2 = Integer.valueOf("");
//			System.out.println("i2Ν " + i2);//αO
//
//			int i3 = Integer.parseInt(null);
//			System.out.println("i1Ν " + i3 );//αOnull
//			int i4 = Integer.valueOf(null);
//			System.out.println("i2Ν " + i4);//αOnull

//			Integer i5 = Integer.parseInt(null);
//			System.out.println("i1Ν " + i5 );//αOnull
			Integer i6 = Integer.valueOf(null);
			System.out.println("i2Ν " + i6);//αOnull
		} catch (NumberFormatException nfEx) {
			// αO
			System.out.println("αOF"+nfEx.getMessage());
		}

		//αB
//		String targetStr = "00999+12-12*2/6";
//		int result = doCalcute(targetStr);
//		System.out.println(result);
	}

	/**
	 * ΑZ@yl₯Zz
	 * @param targetStr
	 * @return
	 */
	public static int doCalcute(String targetStr) {
		int result = 0;

		String[] numArr = targetStr.split("\\+");
		for (String num : numArr) {
			result = result + Integer.parseInt(num);
		}
		return result;
	}
}
