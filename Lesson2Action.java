package learning;

public class Lesson2Action {
//	/**
//	 * �`�A�r���E�����r��
//	 * �o�u���\�[�g�E�����̏������
//	 * @param args
//	 */
//	public static void main(String[] args){
//		int iTmp = 0;
//		int[] targetArr = {123,12,45,65,21,2,79,46,63,22};
//		for(int i=8;i>=0;i--){
//			for(int j=0;j<=i;j++){
//				if(targetArr[j]>targetArr[j+1]){
//					iTmp = targetArr[j+1];
//					targetArr[j+1] = targetArr[j];
//					targetArr[j] = iTmp;
//				}
//			}
//		}
//		for(int i=0;i<10;i++){
//			System.out.println(targetArr[i]);
//		}
//	}
	/**
	 * �v�Z����
	 * <pre>
	 * "\"��"\\\\"
	 * "+"��"\\+"
	 * "*"��"\\*"
	 * "."��"\\."
	 * </pre>
	 * @param args
	 */
	public static void main(String[] args) {
		String targetStr = "00999+12+12+12";
		int result = doAdd(targetStr);
		System.out.println(result);
	}

	/**
	 * ���Z�@
	 * @param targetStr
	 * @return
	 */
	public static int doAdd(String targetStr) {
		int result = 0;

		String[] numArr = targetStr.split("\\+");
		for (String num : numArr) {
			result = result + Integer.parseInt(num);
		}
		return result;
	}
}
