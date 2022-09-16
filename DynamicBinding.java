package operator;

 class DynamicBinding1 {//also known as Late Binding
		void show1() { 
			System.out.println("Dynamic Binding 1st");
		}}
		class DynamicBinding extends DynamicBinding1 {
			 void show1() { 
				System.out.println("Dynamic Binding 2nd");
			}
		public static void main(String[] args) {
			DynamicBinding1 ob= new DynamicBinding();
			ob.show1();

		}

	}

