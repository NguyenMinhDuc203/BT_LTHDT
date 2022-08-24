package BaiTap1;

public class ToaDo {
	private int toaDoX;
	private int toaDoY;
	private String ten;
	
	
	public ToaDo() {
		
	}
	

	public ToaDo(int toaDoX, int toaDoY, String ten) {
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
		this.ten = ten;
	}
	
	public int getToaDoX() {
		return toaDoX;
	}


	public void setToaDoX(int toaDoX) {
		this.toaDoX = toaDoX;
	}


	public int getToaDoY() {
		return toaDoY;
	}


	public void setToaDoY(int toaDoY) {
		this.toaDoY = toaDoY;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getThongTin() {
		return String.format("%s(%d, %d)", ten, toaDoX, toaDoY);
	}
	@Override
	public String toString() {
		return ten+"(" + this.toaDoX + ", " + this.toaDoY + ")";
	}
	
	
}
