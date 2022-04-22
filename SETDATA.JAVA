package prernaa;

public class setdata { 
	int roomno;
	String Roomtype;
	int roomArea;
	String ACmachine;
	void SetData(int r,String rt,int rA,String AC) {
		roomno=r;
		Roomtype=rt;
		roomArea=rA;
		ACmachine=AC;
	}
     void displayData() {
    	 System.out.println(roomno+""+Roomtype+""+roomArea+""+ACmachine);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setdata r= new setdata();
		r.SetData(12,"Single",12,"Split");
		r.displayData();

	}

}
