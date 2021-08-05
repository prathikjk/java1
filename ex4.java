package assignment1;

class Dog
{
	String name, breed, color;
	int age;
	
	Dog(String name, String breed, int age, String color)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
	}
	
	String name()
	{
		return(this.name);
	}
	
	String breed()
	{
		return(this.breed);
	}
	
	String color()
	{
		return(this.color);
	}
	
	int age()
	{
		return(this.age);
	}
}

class ex4
{
	public static void main(String args[])
	{
		Dog d= new Dog("Julie", "Daschound", 3, "Black");
		String name, breed, color;
		int age;
		name=d.name();
		breed=d.breed();
		age=d.age();
		color=d.color();
		System.out.println(name+" "+breed+" "+age+" "+color);
	}
}
