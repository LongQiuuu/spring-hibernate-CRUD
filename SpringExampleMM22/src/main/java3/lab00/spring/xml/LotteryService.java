package lab00.spring.xml;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

//產生樂透的bean 透過Beans.xml 復值
public class LotteryService implements ILottery {
	private int lowerBound;	//樂透上限是他
	private int upperBound; //樂透下限是他
	private int ballNumber;	//產生多少樂透號碼

	public LotteryService() {
	}

	// setter，性質名稱為lowerBound
	@Override
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	// setter，性質名稱為upperBound
	@Override
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	// setter，性質名稱為ballNumber
	@Override
	public void setBallNumber(int ballNumber) {
		this.ballNumber = ballNumber;
	}

	@Override
	public Collection<Integer> getLuckyNumbers() {
		Set<Integer> set = new TreeSet<Integer>();
		while (set.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
			//int num = (int) (Math.random() * (上限 - 下線 + 1)) + 最小的數字
			//產生-5到正五的亂數
			//int num = (int) (Math.random() * (5 +5 + 1)) -5
			set.add(num);
		}
		return set;
	}
}
