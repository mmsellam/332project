We have one master node and many worker nodes
The master can't do any type of job, just comunication and orquestation between the workers
We assume the workers can't comunicate between them
Each worker can handle the same quantity of data
We want to seize the posibility of working at the same time in parallel

In the beginning, the master node, distributes 50GB of Unsorted Data (UD from now on) to each worker.

Each worker sorts it (the sorting algorithm should be defined soon) so now we have 50GB of Sorted Data in each.

Then we choose one worker (for example the first one, W1), and we select the element that is in the position defined by
GB's of data / n° of workers
in this case it will be 50GB/20 Workers = 2.5

so we pick the element in the position after 2.5GB, and we keep choosing then with this criteria.

And the master collects this collection of elements which will now be our set of indexes (you can correct the words collection and indexes to some more technically accurate).

Then the master sends the first index (e1) corresponding to the position after the first 2.5GB to all workers (Wj)

Each Wj will recive the first index and send to M the collection of elements that are behind the index. Is important to remember that at this point each worker has the data sorted.

Then M redirects every chunk of data corresponding to each worker (Cj1 being j the index of the worker and 1 the worker where it should be redirected) to the W1, who will merge the them and store the first 50GB of the final sorted data

Thats the first case, then for the generalization, M sends ei (index ith) to every Wj.
Each Wj returns the chunk Cji (j for the number of the worker and i for the corresponding index of the chunk) to M, who will redirect it to Wj.

Each Wj merges the incoming chunks.

Finally, each Wi should storage Cij (is it right if we say Each Worker i has the Chunk i i -both i- what should mean the chunks are ordered?) so if we read the 10TB of data from each worker sequentially the final output should be the expected.
