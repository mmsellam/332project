# 332 Project: Distributed Sorting of Key-Value Records

This project involves implementing a distributed sorting system for large key-value datasets that do not fit in memory.

## Viewing the Generated Binary File

To view the contents of a generated binary file (like `partition1`) on Windows, use the following PowerShell command to display the first 100 bytes in hexadecimal:

```powershell
$bytes = [System.IO.File]::ReadAllBytes(".\partition1")
$bytes[0..99] | Format-Hex
```

## Project Overview

The goal of this project is to sort large binary key-value records using a distributed system. Each record consists of a 10-byte key (used for sorting) and a 90-byte value. Due to memory and disk limitations, the sorting process must be done using external sorting techniques and distributed across multiple machines.

### Key Steps:
1. **Data Partitioning**: Split the dataset into manageable blocks.
2. **Sorting**: Each machine sorts its block of data based on the 10-byte key.
3. **Merging**: After sorting, the sorted blocks are merged across machines to produce a fully sorted dataset.
4. **Distributed Execution**: Use multiple machines to process large datasets that don't fit in a single machine's memory or disk.

The system will handle datasets too large for memory, scaling up to distributed sorting across multiple machines using a master-worker architecture.

---

### Tools and Libraries:
- **Scala** for implementation.
- **gRPC** for communication between machines.
- Use an standard external sorting algorithm which has an n*log(n) complexity due to the important size of the partitions (e.g., merge sort) adapted for disk-based and distributed sorting.

