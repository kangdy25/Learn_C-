# Learn Java
## 🎯 Learning Objectives
1. Learn the basic grammer of Java and how to utilize Java

2. Develop the ability to implement Object-Oriented Programming concepts into programs, focusing on the Java language.

## 📝 Index
- 01 Environment Setting
- 02 Data Type & Variables
- 03 Operator
- 04 String
- 05 Control Statement
- 06 Array
- 07 Method
- 08 Class
- 09 Abstract Class & Interface
- 10 Generics
- 11 Annoymous Class, Lambda  & Stream
- 12 Exception Handling
- 13 Thread
- 14 Input/Output & File

## ⚙️ Environment Set-Up (Ubuntu Linux)
You can use Eclipse or IntelliJ environment. (in Window or Mac)
```bash
# 1. Update WSL2
sudo apt update
sudo apt upgrade

# 2. Install Java 11
sudo apt install openjdk-11-jdk
java --version 

# 3. Linux environment variable settings
### 3-1 Find out where java is installed.
which java
readlink -f /usr/bin/java

### 3-2 Edit environment variables
sudo vi /etc/environment
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-arm64

### 3-3 Apply environment variables file
source /etc/environment
echo $JAVA_HOME

# 4. Execute example code
javac Helloworld.java # Complie
java Helloworld # Execute
```

```java
// Helloworld.java 
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```
