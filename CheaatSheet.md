# Main functions
## Python
```python
if __name__=="__main__":
	func1();
```

## C++
```cpp
int main(int argc, char *argv[]){
	func1();
}
```

## Java
```java
public static void main(String[] args){
	func1();
}
```

---
# Classes
## Python
```python
class <className>:
	def __init__(self): //Constructor
		self.classArray	= []
		self.classVar = 0
		
	def memberFunction(self, arg1, arg2):
		self.classArray.append(arg1)
		self.classVar = arg2
		
//useage
myClass = <className>()
myClass.memberFunction(1,2)
```

## C++
```Cpp
class <className> {
	private:
	int m_classVar;
	
	public:
	<className>(int arg1 ...){ //Constructor
		m_classVar = arg1;
	}
	int getClassVar(){ return m_classVar; }
}

//usege
<className> myClass = <className>(1);
int myVar = myClass.getClassVar();
```

## Java
```java
class <className> {
    private int m_classVar;
    <className>(int arg1 ...){ //Constructor
        m_classVar = arg1;
    }
    int getClassVar(){ return m_classVar; }
}

//useage
<className> myClass = new <className>(1);
int myVar = myClass.getClassVar();
```

## C#
```cs
class <className> {
  private int classVar;

  public Car(int arg1) { //Constructor
    this.classVar = arg1;
  }
  
	public int getClassVar(){ return this.classVar; }
}

// useage
<className> myClass = new <className>(1);
int myVar = myClass.getClassVar();
```


