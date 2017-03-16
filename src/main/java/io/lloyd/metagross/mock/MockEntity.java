package io.lloyd.metagross.mock;

public class MockEntity {
	private int mockId;
	private String mockName;
	private String remark;

	public MockEntity(int mockId, String mockName, String remark) {
		this.mockId = mockId;
		this.mockName = mockName;
		this.remark = remark;
	}

	public int getMockId() {
		return mockId;
	}

	public void setMockId(int mockId) {
		this.mockId = mockId;
	}

	public String getMockName() {
		return mockName;
	}

	public void setMockName(String mockName) {
		this.mockName = mockName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
