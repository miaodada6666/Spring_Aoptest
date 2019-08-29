# Spring_Aoptest
</br>
一个简单的基于Spring的Aop的实例
</br>
有两种切面的方式
</br>
一种是Spring Aop 另外一种是Aspectj方式
</br>
Spring只支持方法级别的连接点
</br>
AOP方式实现了切面的依赖注入 不管是切面还是切点都需要声明为bean
</br>
Aspectj无法实现切面的依赖注入 不要需要声明bean
</br>
Aspectj为编译器织入 Spring Aop为动态代理织入，因此不能有static 和  final 方法，在运行期间为目标类添加增强生成子类（bean）的方式
</br>
</br>
</br>
也可以为已有的方法（连接点）添加新的功能（通知）
接口Encoreable，通过注解可以为类增添新的功能（Encoreable中声明的新 函数）。
