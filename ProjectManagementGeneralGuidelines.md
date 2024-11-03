# About the Project Management

This document is our policy about how we organise the Project Management in General Terms. The one called 'progress.md' will be our progress tracker, and will be weekly updated.

We discused about the possibility of using an specialized tool for the Project Management (Jira, for example) and we decided that, since we are only two members and the project will not scale besides the original scope, it will be enough for us to track our progress in this document, considering to just use it definining an structure that will be repeated every week.

# Communication

We plan to meet phisically at least twice a week after the class and maybe on the weekends

About how to effectively communicate between members, in the first meeting of each week we will discuss about the planification of the next steps and constantly review in a high level of abstraction where we are in the project.

# Milestones

## Milestone #1 (Weeks 1-2):

### Weeks 1 and 2:

Generate input data using gensort.
Set up the master node.

## Milestone #2 (Weeks 3-4):

### Week 3:

Ensure that workers can connect to the master.
Learn and implement a network library (e.g., gRPC with Protobuf).
Implement sampling: workers send sample data to the master.

### Week 4:

Master distributes partition data to workers.
Perform initial sorting/partitioning on worker nodes.

## Milestone #3 (Weeks 5-6):

Implement sorting and merging across workers.
Ensure that the master and workers run smoothly together.
Prepare for the progress slides and presentation (due Week 6).

## Milestone #4 (Weeks 7-8):

Optimize parallelism by exploiting multiple cores.
Finalize distributed sorting, partitioning, and merging processes.
Final testing and submission by the project deadline (Dec 8).

# Chatgpt usage

We are relying on chatgpt for the design of the project and most of its detail. Since a single chat has a limited memory, we will prepare a prompt that we use and update every singleweek to initiate the chatgpt conversation to the project everytime, and we also may give it the project's file for a better understanding
