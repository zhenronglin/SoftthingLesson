package learning.lesson3.calculate;

public class commonFunction {

	public static String[] OPERATORS = {"(",")","+","-","*","/"};

	/**
	 * 
	 * @param strOpe
	 * @return
	 */
	public static int getOperatorPriorityIndex(String strOpe){
		int len = OPERATORS.length;
		for(int i=0; i<len; i++){
			String ope = OPERATORS[i];
			if(ope.equals(strOpe)){
				return i;
			}
		}
		return len;
	}

	/**
	 * 
	 * �c�͈�ډ��Z�q�̃C���f�b�N�X 
	 * (,),+,-,*,/,#
	 * ���͓�ډ��Z�q�̃C���f�b�N�X
	 * (,),+,-,*,/,#
	 * ���ʁF
	 * 		0��equal; 1��higher; -1��lower; 9�̓~�X�}�b�`
	 */
	public static int[][] ope_priority = {
			{ 0, 0, 1, 1, 1, 1, 9},
			{ 0, 0, 1, 1, 1, 1, 9},
			{-1,-1, 0, 0,-1,-1, 9},
			{-1,-1, 0, 0,-1,-1, 9},
			{-1,-1, 1, 1, 0, 0, 9},
			{-1,-1, 1, 1, 0, 0, 9},
			{ 9, 9, 9, 9, 9, 9, 9},
	};
}
