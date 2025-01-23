# User-Defined Container Classes in Java

This repository demonstrates the implementation of custom container classes in Java. These containers mimic the functionality of predefined Java collections like `ArrayList`, but are designed manually to help understand how such structures work internally.

---

## 1. **Container1** - Basic Integer Container
### **Code Overview**
- **Purpose**: A simple growable container for storing integers.
- **Key Features**:
  1. Uses a fixed-size array internally.
  2. Dynamically resizes the array when it becomes full.
  3. Includes a method `add(int element)` to add integers to the container.

### **Advantages**
1. Stores multiple integer values.
2. Dynamic resizing allows the container to grow as needed.
3. Simple implementation, easy to understand.

### **Disadvantages**
1. Stores only primitive integers, not objects.
2. Not 100% object-oriented (due to the use of primitive types).
3. Lacks methods for removal, retrieval, or advanced operations.

### **Use Cases**
- Basic demonstrations of how a dynamic array works.
- Learning dynamic memory allocation in Java.

---

## 2. **Container2** - Object-Oriented Integer Container
### **Code Overview**
- **Purpose**: An object-oriented container that stores `Integer` objects.
- **Key Features**:
  1. Stores `Integer` objects (wrapper for `int`).
  2. Includes methods for adding, removing, and retrieving elements.
  3. Implements the `toString()` method to display elements in array format.
  4. Automatically resizes when full.

### **Advantages**
1. Fully object-oriented by storing non-primitive types.
2. Provides additional methods (`remove(int index)`, `size()`).
3. Readable representation through `toString()`.

### **Disadvantages**
1. Still homogeneous (stores only `Integer` objects).
2. Slightly more complex than `Container1`.

### **Use Cases**
- Suitable for basic applications where integer storage with object-oriented features is required.
- Useful for demonstrating the importance of wrapper classes.

---

## 3. **Container3** - Generic Container
### **Code Overview**
- **Purpose**: A fully generic container that can store any type of object.
- **Key Features**:
  1. Uses Java generics to support multiple data types.
  2. Provides methods like `add(T element)`, `remove(int index)`, `get(int index)`, and `set(int index, T newElement)`.
  3. Dynamic resizing to accommodate additional elements.

### **Advantages**
1. Fully generic and type-safe, allowing storage of any object type.
2. Provides advanced methods for retrieval, update, and removal.
3. Mimics the behavior of `ArrayList` from Java's predefined collections.

### **Disadvantages**
1. More complex implementation.
2. Slightly more memory usage due to type safety and resizing.

### **Use Cases**
- Ideal for scenarios requiring type-safe, reusable containers.
- Demonstrates the power of generics and how predefined collections like `ArrayList` work.

---

## Relation to Predefined Containers
1. **Container1**:
   - Similar to a basic array but with dynamic resizing.
   - Simpler compared to `ArrayList` or `Vector`.
2. **Container2**:
   - Adds functionality similar to `ArrayList` but limited to `Integer` objects.
3. **Container3**:
   - Closely resembles `ArrayList` in behavior and functionality.
   - Uses generics like predefined collections.

---

## General Advantages of User-Defined Containers
1. Helps in understanding internal implementation of collections.
2. Allows customization of features for specific needs.
3. Good for educational purposes and exploring Java concepts like generics.

## General Disadvantages
1. Limited functionality compared to Java's predefined collections.
2. Higher development time and effort.
3. More prone to bugs due to manual implementation.

---

## Cloning the Repository
To clone this repository, use the following command:

```bash
git clone https://github.com/Ananthadatta02/Java_UserDefined-Containers.git
```

2. Compile and run the desired main class:
   ```bash
   javac Type1_ContainerMainClass.java
   java Type1_ContainerMainClass
   ```

3. Experiment with the other container implementations by running `Type2_ContainerMainClass` and `Type3_ContainerMainClass` similarly.

---
