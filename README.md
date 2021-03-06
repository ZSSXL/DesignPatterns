# Java Design Pattern

## java设计模式学习

---

```

 设计模式（Design Pattern）是一套被反复使用、多人知晓的，经过分类整理的、代码设计经验的总结使用设计模式是为了可重复使用代码  
 总体来说，设计模式分为三大类：
```

 - *创建者模式*(共五种)：工厂方法模式、抽象方法模式、单例模式、建造者模式、原型模式
 - *结构型模式*(共七种)：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式
 - *行为型模式*(共十一种)：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式

![design-patterns](./img/design-patterns.png)

 *注意：* 设计模式并不是一成不变的，很多设计模式都有不同的变体，也就是有不同的实现方式，设计模式不是照搬的，可以写出自己的特色，设计模式只是经验总结；                 

---


- 建造者(Builder)模式

    该模式也叫建造者模式
    Builder模式的定义是“将一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表示”
    它属于创建类模式，一般来说，如果一个对象的构建比较复杂，超出构造函数所能包含的范围，就可以使用Builder模式，Builder应用与复杂对象的构建，甚至只会构建对象的一部分

- 代理模式
  - 静态代理
  - 动态代理
- 模板方法模式
- 适配器模式