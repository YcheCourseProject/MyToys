#VLDB Graph Summary
##2013
- Toward a Distance Oracle for Billion-Node Graphs(MSRA,Tsinghua)
Trinity(in-memory, distributed as engine), sketch-based distance oracle(approximate answers), propose landmark selection distributed BFS and answer generation.

- From Think Like a Vertex to Think Like a Graph(IBM Research, GraphSQL)
Giraph++(faster on cc than Giraph), Test on (Graph Traversal, Random Walk e.g PageRank,GraphCorsening), Open Partition Structure to users

- Statistics Collection in Oracle Spatial and Graph: Fast Histogram Construction for Complex GEometry Objects(Oracle Inc)
Oracle Spatial and Graph, main memory-based algorithm using R-tree index, Recomend Main memory approximation when inaccurate resort to index traversal accurate one

- Unicorn: A System for Searching the Social Graph(Facebook Inc)
Unicorn(online in-memory answer billions of queries per day at cost 100ms, more Specific than SparkQL), graph-based indexing system, mention keyword search for subgraph(integration of retrieval with structured indices), Unicorn return an ordrered list of entities, Open Source Folly(http://github.comfacebook/foll)

- Diversified Top-k Graph Pattern Maching(Edinburgh Fan Wenfei)
Algorithms for top-k DAG, acyclic and complexity, approximation for diversified matches and early termination heuristics, mainly tackle social data, study two classes fuctions for ranking the matches, i.e., relevance and distance

- Probabilistic Query Rewriting for Efficient and Effective Keyword Search on Graph Data(Karlsruhe Institue of Tech, Germany)
Query Rewriting for Keyword Search(rewrite as valid tokens in data, group into segments), Key:rank query rewrites and propose dynamic programming, query cleaning

- Summarizing Answer Graphs Induced by Keyword Queries(UC Santa Barbara)
Compute k summary graph in knowledge graph for keyword queries, propose metric coverage ratio

- Counter Strike: Generic Top-Down Join Enmeration for Hypergraphs(University of mannheim, Germany)
Query optimizers, Evaluate on chins, cycles, cliques, Reuse top-down enumerator for simple graphs to handle hyper graphs, competitive to bottom-up approach with branch-bounding-pruning

- Counting and Sampling Triangles from a Graph Stream(IBM research)
Approximate and Samle triangles counts and n-cliques count, support temporal info with sliding window, implement cache-efficient multicore parallel algorithm, refered to "Parallel triangle counting in massive streaming graphs"

- Scaling Queries over Big RDF Graphs with Semantic Hash Partitioning(Georgia Institute of Tech)
Implement ontop of Hadoop target at RDF(resource description framework), Semantic hash partitioning extends direction-based triple groups and direction-based triple replications, locality-optimizaed query execution, optimize partition

- Distributed Socialite: A Datalog-based language for large-scale Graph Analysis(Intel, Stanford)
Distributed Socialite, DSL query language with compiler, For social network approximation: early termination, bloom-filter based approximation, benchmark: sssp, pr, cc, mutual neighbors, triangle count, clustering coefficients(global and locl)

- Fast Iterative Graph Computation with Block Updates(Cornell)
Grace, Block-oriented computation from HPC(Computation over blocks of highly connected nodes), vertex-centric useful for Belief Propogation

- Demo(Graph Queries in a Next-Generation Datalog System)(UCLA)
Deductive Application Language(support app using regular stratiification but suffer from inefficient execution), first deductive database system

- Phd Seminar(Fast Cartography for Data Explorers)
Answer query with query, 




