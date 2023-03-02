public class Book {
	
	private String title;
	
	private int pageNum;

	//构造方法，并给pageNum初始化200
	public Book() {
		pageNum = 200;
	}
	
	//title赋值和取值
	public String getTitle() {
		return title;
	}

	public void setTitle(String _title) {
		title = _title;
	}

	//pageNum赋值和取值
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int _pageNum) {
		if (_pageNum < 200)
		{
			System.out.println("输入的页数不合法！");
			return;
		}
		pageNum = _pageNum;
	}
	
	public void detail() {
		System.out.println(this.title + "的页数是: " + this.pageNum + "页");
	}
}