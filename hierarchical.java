class superhero{
	String name;
	String power;
	public superhero(String name,String power){
		this.name=name;
		this.power=power;
	}
	public void usepower(){
		System.out.println(name+"uses"+" "+power);
	}
}
//The super keyword in Java refers to a subclass's parent class, or superclass
class ironman extends superhero{
	public ironman(String name){
		super(name,"Advanced technology");
	}
}
class spiderman extends superhero{
	public spiderman(String name){
		super(name,"Web slinging and spider like ablities");
	}
}
public class hierarchical{
	public static void main(String[] args){
		ironman iron=new ironman("Iron Stark");
		spiderman spider=new spiderman("Spider peter");
		iron.usepower();
		spider.usepower();
	}
}