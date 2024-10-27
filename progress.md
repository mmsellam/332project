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

### Milestone #2 (Weeks 3-4):
#### week 3:
Ensure that workers can connect to the master.
Learn and implement a network library (e.g., gRPC with Protobuf).
Implement sampling: workers send sample data to the master.

#### week4:
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
<<<<<<< HEAD

# WEEK2:

## Answers to feedback

### your feedback questions
We had these 2 notes as a feedback: For week 1, these items could have been additionally discussed:
  1. Git workflow strategies (branching model, commit conventions, PR guidelines)
  2. Project management approaches (documentation standards, issue tracking system)
### Answers to the questions:
#### 1. Git workflow
  - **Branching:** There’s only a main branch for deployment, and feature branches for each task. Merging happens once a feature is complete.
  - **Commit Conventions:** clear, consistent format using prefixes like feat: for new features, fix: for bug fixes, refactor: for code restructuring, and docs: for documentation updates.
  - **PR guidelines:** structure where every feature branch is merged back to main via PRs, keeping PRs small, ideally focusing on a single feature.
#### 2. Project management
  - **Documentation standards:** For readme, we will not include how to contribute or coding guidelines since it is only an academic project and not intended for other people to improve it. We will keep the same structure adding dependencies and technical details when evolving in the project. For comments, we will try to apply the advices of the book "clean code" we studied in class, we will try to limit the comments only to the following purposes: informative comments (for ex a return of an abstract method), explanation of intent and clarification, warning of consequences, TODOs
  - **Issue tracking system:** Use labels like bug, feature, documentation, enhancement, etc., to categorize issues. Set milestones for each week or major project phase and update them each week if necessary. Write clear issue descriptions with current behavior and expected results.

## Weekly progress
Since we had the midterms this week, we could not progress much in this project.

### Milestones
We updated the milestones of week 1 due to our lack of progress inthis week
### Architecture
We created and refactoring the architechture of the project.
We created two packages scala and proto inside the main to differentiate between both coding styles.
### master node and introduction to the communication
All with the help and explanation of chatgpt, we coded the gRPC sorting service and messages(communication) and the partitioning of the data in MaterNode.scala.
However, we still are dependent completely on the workof chatGPT since all of this is new to us.
We are planning to learn more about gRPC and protobuf in the next week as stated in the milestones.

## Questions for feedback
1. Do you think that our plan for week 3 is correct (relevant) ?
2. What do you advise us to do for week 3 and 4 as possible updates to the milestones
3. We are too dependent on chatGPT at this level, is that normal as a start of the project and being fresh to this type of software design? If not we are happy to get your advice for a better management.



