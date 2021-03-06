package kr.ac.kopo.day10.project.project10;

public class Teacher extends Person{

	String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subject) {
		this.setName(name);
		this.setAge(age);
		this.setSubject(subject);
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	@Override
	public void print() {
		System.out.printf("이   름 : %-5s 나 이 : %-5d 담당과목 : %-5s\n", getName(), getAge(), getSubject() );
	}
}
