# Week 1:

## Progress

We discussed the initial structure of the project management and asked initial questions

## Questions

1. What is the partitioning algorithm? hashcode, random or ranges...?
2. Will we have a weekly guidance about how to design and code the project or is the project completely unguided?

# Week 2:

## Answers to feedback

### TA's (Kyunwoo Kim) feedback questions

> Your milestones are thoughtfully structured with clear weekly progression. Beginning with master-worker connection establishment demonstrates a realistic, bottom-up approach, and your strategic consideration of parallelism as a key architectural component, while deliberately postponing optimization, shows a solid awareness of the early optimization pitfall discussed in class. I appreciate the detailed articulation of your thought process in these milestones.
>
> We note your transparency about ChatGPT usage. Your systematic approach with consistent prompting and context sharing makes sense. Consider documenting which AI suggestions proved effective - it could provide valuable insights for your project review.
>
> Now, here are the answers to your questions.
>
> 1. The partitioning algorithm is a part of your design choices. You can use any you see fit.
> 2. We’ll give you weekly feedback based on your progress reports and project repository.
>
> Please keep in mind that the more detailed your progress report is, the more specific feedback we can provide. For week 1, these items could have been additionally discussed:
>
> - Git workflow strategies (branching model, commit conventions, PR guidelines)
> - Project management approaches (documentation standards, issue tracking system)

### Answers to the questions:

#### Git workflow and Project management:

- **Documentation standards:** For readme, we will not include how to contribute or coding guidelines since it is only an academic project and not intended for other people to improve it. We will keep the same structure adding dependencies and technical details when evolving in the project. For comments, we will try to apply the advices of the book "clean code" we studied in class, we will try to limit the comments only to the following purposes: informative comments (for example a return of an abstract method), explanation of intent and clarification, warning of consequences, TODOs.
- **Issue tracking system:** To answer this question we wrote a separated document called 'ProjectManagementGeneralGuidelines.md' where we define the alignments we will attach to work properly. We will also use labels like bug, feature, documentation, etc., to categorize issues. Set milestones for each week or major project phase and update them each week if necessary. Write clear issue descriptions with current behavior and expected results.
- Our **Git workflow and standards** is also described in 'ProjectManagementGeneralGuidelines.md'

## Weekly progress

Since we had the midterms this week, we could not progress much in this project.

### Milestones

We updated the milestones of week 1 due to our lack of progress in this week

### Architecture

We created and refactoring the architecture of the project.
We created two packages scala and proto inside the main to differentiate between both coding styles.

### Master node and Introduction to the Communication

All with the help and explanation of chatgpt, we coded the gRPC sorting service and messages(communication) and the partitioning of the data in MaterNode.scala.
However, we still are dependent completely on the work of chatGPT since all of this is new to us.
We are planning to learn more about gRPC and protobuf in the next week as stated in the milestones.

## Questions for feedback

1. Do you think that our plan for week 3 is correct (relevant) ?
2. What do you advise us to do for week 3 and 4 as possible updates to the milestones
3. We are too dependent on chatGPT at this level, is that normal as a start of the project and being fresh to this type of software design? If not we are happy to get your advice for a better management.

# Week 3:

The main progress this week was about finishing the project management guidelines and doing separately research about grpc and protobuf. We did not reflect this investigation in our code yet. We were also working on requesting access to our project VM server.

Nextweek we need to consolidate our progress for this week and work on:

- Master distributes partition data to workers.
- Perform initial sorting/partitioning on worker nodes.

# Week 4:
The main progress about this week was the design as advised by the TA and the professor. 
Please find the file Design.md in the project


Mokhtar's personal notes:
create as many threads as you need for communication
Take advantage of concurrent programming.
Then just execute this unit
