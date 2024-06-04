# Simple Quarkus Extension using Gradle and Kotlin

Simple Quarkus extension that shows the errors when using Gradle + Kotlin.

- branch [maven-java](https://github.com/cthiebault/quarkus-gradle-kotlin-extension) (Maven + Java) builds fine
  ```shell
  git checkout maven
  ./mvnw clean package 
  ```
  See [console output](./maven-java-console.txt) for more details.
- branch [gradle-java](https://github.com/cthiebault/quarkus-gradle-kotlin-extension/tree/gradle-java) (Gradle + Java) builds fine
  ```shell
  git checkout gradle
  ./gradlew build 
  ```
  See [console output](./gradle-java-console-log.txt) for more details.
- branch [gradle-kotlin](https://github.com/cthiebault/quarkus-gradle-kotlin-extension/tree/gradle-kotlin) 
  (Gradle + Kotlin) fails with the following error:
  ```shell
  git checkout gradle-kotlin
  ./gradlew build
  
  > There was a failure while executing work items
    > A failure occurred while executing io.quarkus.gradle.tasks.worker.BuildWorker
      > io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        	[error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: jakarta.enterprise.inject.spi.DeploymentException: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.example.ExampleService and qualifiers [@Default]
        	- injection target: parameter 'exampleService' of com.example.application.ExampleResource constructor
        	- declared on CLASS bean [types=[com.example.application.ExampleResource, java.lang.Object], qualifiers=[@Default, @Any], target=com.example.application.ExampleResource]
        	at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:1529)
        	at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:332)
        	at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:166)
        	at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:488)
        	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:849)
        	at io.quarkus.builder.BuildContext.run(BuildContext.java:256)
        	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
        	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
        	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
        	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
        	at java.base/java.lang.Thread.run(Thread.java:1583)
        	at org.jboss.threads.JBossThread.run(JBossThread.java:483)
        Caused by: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type com.example.ExampleService and qualifiers [@Default]
        	- injection target: parameter 'exampleService' of com.example.application.ExampleResource constructor
        	- declared on CLASS bean [types=[com.example.application.ExampleResource, java.lang.Object], qualifiers=[@Default, @Any], target=com.example.application.ExampleResource]
        	at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:519)
        	at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:642)
        	at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:317)
        	... 12 more
    ```
    See [console output](./gradle-kotlin-console-log.txt) for more details.