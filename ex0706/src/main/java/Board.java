import javax.swing.border.Border;

public class Board {

	
	Board(){}
	
	public Board(int bid, String btitle, String bcontent, String bname, int bgroup, int bstep, int bdate,
			String bupload) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bname = bname;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bdate = bdate;
		this.bupload = bupload;
	}
	
	private int bid;
	private String btitle;
	private String bcontent;
	private	String bname;
	private	int bgroup;
	private int bstep;
	private int bdate;
	private String bupload;
	
	
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBtsep(int bstep) {
		this.bstep = bstep;
	}
	public int getBdate() {
		return bdate;
	}
	public void setBdate(int bdate) {
		this.bdate = bdate;
	}
	public String getBupload() {
		return bupload;
	}
	public void setBupload(String bupload) {
		this.bupload = bupload;
	}

	
	
	
	
	
	
}
