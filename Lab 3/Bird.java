class Bird {
	String name;
	int age;
        public Bird() {
        this.name = "Rocky";
	}
	public Bird(String name) {
        	this.name = name;
	}
        public Bird(String name, int age) {
        	this.name = name;
        	this.age = age;
	}
    	public void displayInfo() {
        	System.out.println("\nBird Name: " + name);
        	if (age != 0) {
            		System.out.println("Bird Age: " + age);
        	}
    	}
    	public static void main(String[] args) {
		Bird bird1 = new Bird();
        	bird1.displayInfo();
               	Bird bird2 = new Bird("Eagle");
		bird2.displayInfo(); 
		Bird bird3 = new Bird("Sparrow", 2);
		bird3.displayInfo();
	}
}
