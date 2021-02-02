# spring-boot-conditional-01

## 需求
 如果类路径classpath (src/main/resources)下存在文件test.propeties,则输出"test.properties文件存在。";
 否则输出"test.properties文件不存在!"。
 
## 思路
实现 Condition，使用 Conditional条件配置组件Bean