

public class Stock2_1 {
	private String stockName;
	private String numberOfShare;
	private String sharePrice;

	// constructor
	public Stock2_1(String stockName, String numberOfShare, String sharePrice) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}

	// getter and setter
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(String numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public String getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(String sharePrice) {
		this.sharePrice = sharePrice;
	}

	// print output in format
	@Override
	public String toString() {
		return "StockInfo [stockName=" + stockName + ", /nnumberOfShare=" + numberOfShare + ", \nsharePrice="
				+ sharePrice + "]";
	}

}
