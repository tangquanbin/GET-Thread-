# 并发编程

1、线程优先级
2、daemon（守护线程，后台线程）
3、synchronized修饰方法的两种情况
4、synchronized重入
5、死锁，死锁检查方法
6、synchronized同步方法弊端
7、synchronized加到静态方法上时是给class类上锁，加到非静态方法是给对象上锁
8、使用AtomicInteger原子类代替i++使用synchronized的线程安全操作

**多线程的优点**
1资源利用率更好
2程序设计在某些情况下更简单
3程序响应更快

**幂等：**
在编程中，一个幂等操作的特点是其任意多次执行所产生的影响均与一次执行的影响相同。
同一个请求，使用相同参数重复执行，发送一次和发送N次效果是一样的。
 
 
