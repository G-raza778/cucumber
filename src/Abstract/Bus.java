package Abstract;

public class Bus extends Redbus {
	public void seat()
	{
		System.out.println("search the bus and book the seat");
	}
	private String un="abc@gmail.com";
	private int pw=123;
	private String url="www.redbus.com";
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
