package workers;

public abstract class CommonWorker implements Worker {

	//'משימה ב
	//נשתמש בסוג כזה של מחלקות כאשר נרצה ליצור מחלקה כללית שניתן להוריש ממנה את התכונות והפעולות הכלליות
	//שמתאימות לכל מחלקה אחרת(כמו עבדים שונים) שמתאימים באופן זהה לכל מחלקה אחרת שמשתמשת במחלקה כזאת
	private String name;
	private int age;
	private double salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
