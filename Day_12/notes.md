# 🧠 Bit Manipulation — Day 12 of #100DaysOfCode

Bit Manipulation is a powerful technique that uses bitwise operators to perform operations at the binary level. Here are the essential operations every beginner should know:

---

## 🔍 Get Bit

📌 *Tells the bit at a given position (0 or 1)*  
👉 Steps:
- Create bitmask: `1 << position`
- Perform AND with the number: `bitmask & number`
- If result is 0 → bit was `0`, else → bit was `1`

```java
int number = 5;  // 0101
int position = 1;
int bitMask = 1 << position;

if ((bitMask & number) == 0) {
    System.out.print("The bit was 0");
} else {
    System.out.print("The bit was 1");
}
```

---

## 🔧 Set Bit

📌 *Sets the bit at a given position to 1*  
👉 Steps:
- Create bitmask: `1 << position`
- Perform OR with the number: `bitmask | number`

```java
int number = 5;  // 0101
int position = 1;
int bitMask = 1 << position;

int result = bitMask | number;
System.out.print(result);
```

---

## 🧹 Clear Bit

📌 *Sets the bit at a given position to 0*  
👉 Steps:
- Create bitmask: `1 << position`
- Take complement: `~bitmask`
- Perform AND with the number: `~bitmask & number`

```java
int number = 5;  // 0101
int position = 1;
int bitMask = 1 << position;
int newBitMask = ~bitMask;

int result = newBitMask & number;
System.out.print(result);
```

---

## 🔁 Update Bit

📌 *Updates the bit based on user input (0 → clear, 1 → set)*

```java
Scanner sc = new Scanner(System.in);
int operator = sc.nextInt(); // 0 for clear, 1 for set
int number = 5;   // 0101
int position = 2;
int bitMask = 1 << position;

if (operator == 0) {
    int newBitMask = ~bitMask;
    System.out.print(newBitMask & number);
} else {
    int result = bitMask | number;
    System.out.print(result);
}
```

---

## 📘 Summary

| Operation     | Bitwise Logic Used     |
|---------------|------------------------|
| Get Bit       | AND                    |
| Set Bit       | OR                     |
| Clear Bit     | AND with NOT           |
| Update Bit    | Based on input (0/1)   |

---

## 🔗 Related

- 🔎 Code: [BitManipulationExamples.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a3c0714634a8beb388e9766b79bc7301188831b6/Day_12/Practice_Problems/BitManipulationExamples.java)

