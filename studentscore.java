package xacxsdas;

class studentscore {

	public static void main(String[] args) {

		
		
		String[] names = {"Ã¶¼ö", "¿µÈñ", "¹ÎÃ¶", "±æµ¿", "ÁøÈñ"};
		int[] scores = {100, 90, 80, 100, 100};
		int[] heights = {177, 190, 180, 160, 160};

		Student s1 = new student (100, "Ã¶¼ö", 177);
		Student s2 = new student (90, "¿µÈñ", 190);
		Student s3 = new student (80, "¹ÎÃ¶", 180);
		Student s4 = new student (90, "±æµ¿", 160);
		Student s5 = new student (100, "ÁøÈñ", 160);

		
		Student[] students = {s1, s2, s3, s4, s5};
		//Æò±Õ ÀÌ»ó
		int[] arr = {1,2,3};
		int a = arr [0];
		int sum = 0;
		for(int i = 0; i < students.length; i++) {
			Student s = students[i];
			sum += s.score;
		}
		System.out.println(sum/students.length);
		
		for(int i = 0; i < students.length; i++) {
			Student s = students[i];
			if(s.score >= avg ) {
				s.introduce();
			}
		}
	}
	

}

class Student {
	String name;
	int score;
	int height;
	
	public Student(int data1, String data2) {
		score = data1;
		name = data2;
		height = data3;
		
	}
	public void introduce() {
		System.out.printf("Àú´Â %sÀÌ°í, Á¡¼ö´Â %dÀÔ´Ï´Ù. \n", name, score);
	}
}
