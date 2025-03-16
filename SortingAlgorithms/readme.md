# 🚀 Sorting Algorithms with Time Complexity  

Welcome to the **Sorting Algorithms** repository! This folder contains various sorting algorithm implementations along with their **time complexity analysis**. 📊  

Sorting is a fundamental concept in computer science and plays a crucial role in **searching, data organization, and optimization problems**. In this repository, you will find multiple sorting techniques implemented in different programming languages. 🎯  

---

## 📂 Folder Structure  
Each sorting algorithm is stored in a separate file, named accordingly. The time complexity for each is mentioned in comments within the code.  

```
SortingAlgorithms/
│️️️ BubbleSort.java
│️️️ InsertionSort.java
│️️️ SelectionSort.java
│️️️ MergeSort.java
│️️️ QuickSort.java
│️️️ HeapSort.java
│️️️ RadixSort.java
│️️️ CountingSort.java
└️️️ README.md
```

---

## 🔥 Available Sorting Algorithms  

| 🆎 Algorithm | 🔵 Best Case | 🟡 Average Case | 🔴 Worst Case | 💾 Space Complexity | 📝 Stability |
|-------------|------------|--------------|--------------|----------------|------------|
| 🪧 **Bubble Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ Stable |
| 🏭 **Insertion Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ Stable |
| 🥢 **Selection Sort** | O(n²) | O(n²) | O(n²) | O(1) | ❌ Not Stable |
| ⚡ **Merge Sort** | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ Stable |
| 🎈 **Quick Sort** | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ Not Stable |
| 🪦 **Heap Sort** | O(n log n) | O(n log n) | O(n log n) | O(1) | ❌ Not Stable |
| 🌊 **Radix Sort** | O(nk) | O(nk) | O(nk) | O(n + k) | ✅ Stable |
| 📊 **Counting Sort** | O(n + k) | O(n + k) | O(n + k) | O(k) | ✅ Stable |

---

## 📚 Sorting Algorithm Descriptions  

### 🪧 **Bubble Sort**  
- Repeatedly swaps adjacent elements if they are in the wrong order.  
- **Best for:** Small datasets, teaching purposes.  
- **Real-world use case:** Simple cases like **sorting small lists of records**.  

### 🏭 **Insertion Sort**  
- Builds the sorted array one item at a time by shifting elements.  
- **Best for:** Nearly sorted arrays, small datasets.  
- **Real-world use case:** **Card sorting in hands**, maintaining sorted order in real-time applications.  

### ⚡ **Merge Sort**  
- Recursively divides the array and merges sorted parts.  
- **Best for:** Large datasets, linked lists.  
- **Real-world use case:** **Sorting large databases**, external sorting.  

### 🎈 **Quick Sort**  
- Picks a pivot, partitions the array, and recursively sorts.  
- **Best for:** General-purpose sorting, randomized data.  
- **Real-world use case:** **Search engines, database query optimizations**.  


