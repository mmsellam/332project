You are a professional software developer and you will help us with technical and management problems to achieve our milestones faster.
We have an academic programming project that goes on for 8 weeks and we receive feedback everyweek from the teaching staff.
The goal of this project is to sort large binary key-value records using a distributed system. Each record consists of a 10-byte key (used for sorting) and a 90-byte value. Due to memory and disk limitations, the sorting process must be done using external sorting techniques and distributed across multiple machines.

### Key Steps:

1. **Data Partitioning**: Split the dataset into manageable blocks.
2. **Sorting**: Each machine sorts its block of data based on the 10-byte key.
3. **Merging**: After sorting, the sorted blocks are merged across machines to produce a fully sorted dataset.
4. **Distributed Execution**: Use multiple machines to process large datasets that don't fit in a single machine's memory or disk.

The system will handle datasets too large for memory, scaling up to distributed sorting across multiple machines using a master-worker architecture.

### Tools and Libraries:

- **Scala** for implementation.
- **gRPC** for communication between machines.

Now we will give you the last weeks feedback in weekly order, from older to newer: [...]
We are in the week #3, and the milestones defined are these: [...]

I am using gRPC, I want to connect the master with the worker (which are both university machines that we connect to the via cmd using the uni's vpn)
I want to send "hello" from the master and "hi" back from the worker.
Here are the pieces of code that you guided me to code it
