public class Master {
	public void feed(Pet pet) { //运用了多态，这里的参数只要写他们的父类就ok了，运行的时候会根据子类对象来调用各自的方法，这些方法是经过override的
		System.out.println("布布正在投喂...");
		pet.eat();
	}
}

/*
	软件在扩展新需求的过程当中，修改得越少越好。
	修改的越多，你的系统当前的稳定性就越差，未知的风险就越多。


	软件的开发7大原则，不仅对于Java，属于整个软件业
		其中有一条最基本的原则 OCP（开闭原则）

	什么是开闭原则？
		对扩展开放，对修改关闭
		在软件的扩展过程当中，修改的越少越好
		也就是说你可以额外添加，没问题。但最好很少改动现有的程序

	高手开发项目不仅仅是满足客户的需求，还要考虑软件的扩展性

	运用了多态以后，这里master的类就不用再修改了，因为它的方法里面写的是一个抽象的类型
*/