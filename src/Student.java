
public class Student{
	String name, hakbun; //스태틱이 없으니깐 멤버,인스턴스 변수
	int kor, mat, eng, tot;
	double avg;
	char grade;

	void calcTot() { // return 하지않는다.
		tot = kor + eng + mat;
	}

	void calcAvg() {
		avg = tot / 3.;
	}

	void calcGrade() {
		grade = (avg <= 100 && avg >= 90) ? 'A' : 
			(avg <= 90) ? 'B' : 
				(avg <= 80) ? 'C' : 
					(avg <= 70) ? 'D' : 'F';
	}
	void display() {
	System.out.printf("%s(%s)\t %d\t %d\t %d\t %d\t%.2f\t%c\n" ,
			    name, hakbun, kor, eng, mat, tot, avg, grade);
	}
}
