package learning;

public class Lesson4Action {

	/**
	 * �l�����Z����
	 * <pre>
	 * "\"��"\\\\"
	 * "+"��"\\+"
	 * "*"��"\\*"
	 * "."��"\\."
	 * </pre>
	 * @param args
	 */
	public static void main(String[] args) {
		//��@
//		CharSequence seq = "123456";
//		StringBuilder sb = new StringBuilder(seq);
//		System.out.println(seq);

		//��A
		/**
		 * parseInt VS valueOf�i��O���������ꏏ�j
		 * parseInt �������߁i�p�t�H�[�}���X�����j
		 */
		try {
//			int i1 = Integer.parseInt("");
//			System.out.println("i1�� " + i1 );//��O
//			int i2 = Integer.valueOf("");
//			System.out.println("i2�� " + i2);//��O
//
//			int i3 = Integer.parseInt(null);
//			System.out.println("i1�� " + i3 );//��Onull
//			int i4 = Integer.valueOf(null);
//			System.out.println("i2�� " + i4);//��Onull

//			Integer i5 = Integer.parseInt(null);
//			System.out.println("i1�� " + i5 );//��Onull
			Integer i6 = Integer.valueOf(null);
			System.out.println("i2�� " + i6);//��Onull
		} catch (NumberFormatException nfEx) {
			// ��O����
			System.out.println("��O�F"+nfEx.getMessage());
		}

		//��B
//		String targetStr = "00999+12-12*2/6";
//		int result = doCalcute(targetStr);
//		System.out.println(result);
	}

	/**
	 * ���Z�@�y�l�����Z�z
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
