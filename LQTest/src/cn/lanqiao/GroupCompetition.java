package cn.lanqiao;

/**
* ��������ͳ����ɼ����и������飺
*  1. ������� 18 �������ɼ�С�� 60 �֣��޸����ʸ�
*  2. ����С�ڵ��� 12 �꣬�����ɼ����ڵ��� 80 �֣���������Ϊ���ٶ� A �顱�������ɼ�С�� 80 �֣���������Ϊ���ٶ� B �顱��
*  3. ������� 12 �꣬�����ɼ����ڵ��� 80 �֣���������Ϊ�������� A �顱�������ɼ�С�� 80 �֣���������Ϊ�������� B �顱��
*/  
public class GroupCompetition {
	/**
	 * ��������ͳ����ɼ����и�������
	 * @param age ����
	 * @param score �����ɼ�
	 * @return ������
	 */
	public String grouping(int age, double score) {
		if(age <= 18 && score >= 60) {
			if(age <= 12) {
				if(score >= 80) {
					return "�ٶ�A��";
				}
				else{
					return "�ٶ�B��"; 
				}
			}else{
				if(score >= 80) {
					return "������A��";
				}else{
					return "������B��";
				}
			}
		}else{
			return "�޸����ʸ�";	
		}
	}
	
}	