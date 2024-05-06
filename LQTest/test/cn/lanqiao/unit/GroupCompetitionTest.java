package cn.lanqiao.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.lanqiao.GroupCompetition;


/**
 * 单元测试
 * 1. 请使用 基本路径法 对被测源码 GroupCompetition 类 中的 grouping 方法设计单元测试用例。
 * 2. 请在下方 GroupCompetitionTest 类中填写单元测试代码。
 * 3. 基本路径法：又称独立路径测试，是在程序控制流图的基础上，通过分析控制结构的环路复杂性，导出基本可执行路径集合，从而设计测试用例的方法。
 */

public class GroupCompetitionTest {
	static GroupCompetition group;

	
	@Before
	public void initGroupCompetition() {
		group = new GroupCompetition();
	}
	
	@Test
	public void test01() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("少儿A组", group.grouping(12, 80));
	}
	
	@Test
	public void test02() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("少儿B组", group.grouping(12, 70));
	}

	@Test
	public void test03() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("青少年A组", group.grouping(17, 80));
	}
	
	@Test
	public void test04() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("青少年B组", group.grouping(17, 70));
	}
	
	@Test
	public void test05() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("无复赛资格", group.grouping(20, 60));
	}
	
	@Test
	public void test06() {
		// TODO: 请填写 grouping 方法的单元测试代码
		Assert.assertEquals("无复赛资格", group.grouping(18, 50));
	}
	

	

	
	
}