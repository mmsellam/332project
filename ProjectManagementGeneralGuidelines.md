# About the Project Management

This document is our policy about how we organise the Project Management in General Terms. The one called 'progress.md' will be our progress tracker, and will be weekly updated.

We discused about the possibility of using an specialized tool for the Project Management (Jira, for example) and we decided that, since we are only two members and the project will not scale besides the original scope, it will be enough for us to track our progress in this document, considering to just use it definining an structure that will be repeated every week.

Each week we will traslade those bugs/features unfinished to the things to do for the next week (similarly as its done in SCRUM when you dont finish all the work) so we dont lost the track of it.

# Communication

We plan to meet phisically at least twice a week after the class and maybe on the weekends

About how to effectively communicate between members, in the first meeting of each week we will discuss about the planification of the next steps and constantly review in a high level of abstraction where we are in the project.

# Git workflow and conventions

> TL;DR:
>
> - **Branching:** There’s only a main branch for deployment, and feature branches for each task. Only one person works on each branch at a time. Merging happens once a feature is complete. We push our branches to the git repository and merge them when they're done via PR's.
> - **Commit Conventions:** clear, consistent format using prefixes like feat: for new features, fix: for bug fixes, refactor: for code restructuring, and docs: for documentation updates. When to commit is free to each member, preferently each time some progress is made.
> - **PR guidelines:** structure where every feature branch is merged back to main via PRs, keeping PRs small, ideally focusing on a single feature.

Each of us will work on separated features at a time, and create a new branch based on the **(repository) master branch**, which will be our only _source of truth_.

We emphasize the difference between the **repository master branch** and the **local master branch**, being the first, the one that is in the git repository (online and shared between team members) and the second, the one that is in our personal computers _and that can be not up to date_. It is a priority to work always based on the repository master branch so we can avoid spending time solving posterior merge issues.

## 'New Branch' Protocol

The **basic protocol for starting a new branch** (each time someone has to work on a new feature) is as follows:

```
git checkout master 
git pull
git checkout -b NAME-OF-NEW-THE-BRANCH
```

So you always keep updated your local master branch with the source of truth.

> (\*) **NAME-OF-THE-BRANCH Convention**:
>
> It will follow the structure `feat: 'name of the owner'-'feature name'`. Example: `feat: mokhtar-workerNode`

## 'Start of a work session' Protocol

Each time one of the two members starts working on the project, the basic idea is to ensure your master branch is synced with the repository master branch, so we must execute the following:

```
git checkout master 
git pull
```

And then use `git checkout` to keep working on your branch.

## Protocol for updating the documentation of the project:

Before updating the docs (for example, and most of times, for weekly progress updates) follow the next steps:

```
git checkout master
git pull
_update with your progress_ 
git add .
git commit -m "docs: updated weekly progress (f.e.)"`
git push
git checkout 'featureX"
```

This is important to be done this way so we dont lose any documentation update since those are the files we can change at the same time. Our main goal with this protocols and policies is to avoid losing time with merging conflicts.

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
Design

### Week 5:

Master distributes partition data to workers.
Ensure that the master and workers run smoothly together.

## Milestone #3 (Week 6):

Implement sorting and merging across workers.
Perform initial sorting/partitioning on worker nodes.
Prepare for the progress slides and presentation (due Week 6).

## Milestone #4 (Weeks 7-8):

Optimize parallelism by exploiting multiple cores.
Finalize distributed sorting, partitioning, and merging processes.
Final testing and submission by the project deadline (Dec 8).

# Chatgpt usage

We are relying on chatgpt for the design of the project and most of its detail. Since a single chat has a limited memory, we will prepare a prompt that we use and update every singleweek to initiate the chatgpt conversation to the project everytime, and we also may give it the project's file for a better understanding
