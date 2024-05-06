package cn.lanqiao.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.lanqiao.GroupCompetition;


/**
 * ��Ԫ����
 * 1. ��ʹ�� ����·���� �Ա���Դ�� GroupCompetition �� �е� grouping ������Ƶ�Ԫ����������
 * 2. �����·� GroupCompetitionTest ������д��Ԫ���Դ��롣
 * 3. ����·�������ֳƶ���·�����ԣ����ڳ��������ͼ�Ļ����ϣ�ͨ���������ƽṹ�Ļ�·�����ԣ�����������ִ��·�����ϣ��Ӷ���Ʋ��������ķ�����
 */

public class GroupCompetitionTest {
	static GroupCompetition group;

	
	@Before
	public void initGroupCompetition() {
		group = new GroupCompetition();
	}
	
	@Test
	public void test01() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("�ٶ�A��", group.grouping(12, 80));
	}
	
	@Test
	public void test02() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("�ٶ�B��", group.grouping(12, 70));
	}

	@Test
	public void test03() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("������A��", group.grouping(17, 80));
	}
	
	@Test
	public void test04() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("������B��", group.grouping(17, 70));
	}
	
	@Test
	public void test05() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("�޸����ʸ�", group.grouping(20, 60));
	}
	
	@Test
	public void test06() {
		// TODO: ����д grouping �����ĵ�Ԫ���Դ���
		Assert.assertEquals("�޸����ʸ�", group.grouping(18, 50));
	}
	

	

	
	
}