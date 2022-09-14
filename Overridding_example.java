package operator;

class Exam {
int marks() {
	return 0;
}}
class computer extends Exam{
	int marks() {
		return 80;
}}
class math extends Exam{
	int marks() {
		return 70;
}}
class science extends Exam{
	int marks() {
		return 50;
}}
class english extends Exam{
	int marks() {
		return 90;
}}

class Overridding_example{
	public static void main(String[] args) {
		computer c=new computer();
		math m=new math();
		science s=new science();
		english e=new english();
		System.out.println("computer marks is:"+c.marks());
		System.out.println("maths marks is:"+m.marks());
	s.marks();
	e.marks();
	
	}}

