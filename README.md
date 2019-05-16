# dubbo-spring-boot-demo



1. Demo 使用了zookeeper，应先运行zookeeper

   1. image下载：`docker pull zookeeper`

   2. Run Container:

      `$ docker run --name zookeeper -p 2181:2181 -p 2888:2888 -p 3888:3888 --restart always -d zookeeper`

      `EXPOSE 2181 2888 3888` (the zookeeper client port, follower port, election port respectively)

   3. consumer和provider包含zookeeper client框架：

      ```xml
      <!-- https://mvnrepository.com/artifact/org.apache.curator/curator-framework -->
      <dependency>
          <groupId>org.apache.curator</groupId>
          <artifactId>curator-framework</artifactId>
          <version>2.13.0</version>
      </dependency>
      
      
      <!-- https://mvnrepository.com/artifact/org.apache.curator/curator-recipes -->
      <dependency>
          <groupId>org.apache.curator</groupId>
          <artifactId>curator-recipes</artifactId>
          <version>2.13.0</version>
      </dependency>
      ```

      注意版本限制：(目前官网上没有这些了，但使用最新版本还是不对)

      ```
      Versions
      The are currently two released versions of Curator, 2.x.x and 3.x.x:
      
      Curator 2.x.x - compatible with both ZooKeeper 3.4.x and ZooKeeper 3.5.x
      Curator 3.x.x - compatible only with ZooKeeper 3.5.x and includes support for new features such as dynamic reconfiguration, etc.
      ```

   4. jar包运行

      ```shell
      /dubbo-spring-boot-demo > mvn clean package -X
      dubbo-spring-boot-demo/dubbo-spring-boot-demo-provider/target > java -jar dubbo-spring-boot-demo-provider-0.0.1-SNAPSHOT.jar
      ```

   5. Dubbo admin的安装：

      [代码](https://github.com/apache/incubator-dubbo-admin)

      源码中dubbo-admin-server pom文件缺少依赖：

      ```xml
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-core</artifactId>
          <version>5.1.5.RELEASE</version>
      </dependency>
      ```

   6. 当前dubb版本为2.7.1，但Dubbo admin已经使用了2.7.2，mvn repository尚未更新

      等待更新。