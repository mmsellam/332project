# WEEK1:

## Distributed sorting:

It is a sorting problem when the data uses more storage than a single machine can handle. So we use multiple worker machines that sort each a chunk from the original data. Each machine either gets the chunks randomly, via a hashing function or respecting some predefined ranges. We also use a master machine that connects to every worker machine individually to distribute the the partition data, manage the merging process.

## Communication:

We plan to meet phisically at least twice a week after the class and maybe on the weekends

About how to effectively communicate between members, in the first meeting of each week we will discuss about the planification of the next steps and constantly review in a high level of abstraction where we are in the project.

## Milestones:

### Milestone #1 (Weeks 1-2):

Generate input data using gensort.
Set up the master node.
Ensure that workers can connect to the master.
Learn and implement a network library (e.g., gRPC with Protobuf).

### Milestone #2 (Weeks 3-4):

Implement sampling: workers send sample data to the master.
Master distributes partition data to workers.
Perform initial sorting/partitioning on worker nodes.

### Milestone #3 (Weeks 5-6):

Implement sorting and merging across workers.
Ensure that the master and workers run smoothly together.
Prepare for the progress slides and presentation (due Week 6).

### Milestone #4 (Weeks 7-8):

Optimize parallelism by exploiting multiple cores.
Finalize distributed sorting, partitioning, and merging processes.
Final testing and submission by the project deadline (Dec 8).

## Chatgpt usage:

We are relying on chatgpt for the design of the project and most of its detail. Since a single chat has a limited memory, we will prepare a prompt that we use and update every singleweek to initiate the chatgpt conversation to the project everytime, andwe also may give it the project's file for a better understanding

## Questions

1. What is the partitioning algorithm? hashcode, random or ranges
2. Will we have a weekly guidance about how to design and code the project or is the project completely unguided?
