#VLDB Graph Summary
##2013
- Toward a Distance Oracle for Billion-Node Graphs(MSRA,Tsinghua)  
Trinity(in-memory, distributed as engine), sketch-based distance oracle(approximate answers), propose landmark selection distributed BFS and answer generation.

- From Think Like a Vertex to Think Like a Graph(IBM Research, GraphSQL)  
Giraph++(faster on cc than Giraph), test on (Graph Traversal, random Walk e.g pageRank,graph corsening), open partition structure to users

- Statistics Collection in Oracle Spatial and Graph: Fast Histogram Construction for Complex GEometry Objects(Oracle Inc)  
Oracle Spatial and Graph, main memory-based algorithm using R-tree index, recomend main memory approximation when inaccurate resort to index traversal accurate one

- Unicorn: A System for Searching the Social Graph(Facebook Inc)  
Unicorn(online in-memory answer billions of queries per day at cost 100ms, more specific than SparkQL), graph-based indexing system, mention keyword search for subgraph(integration of retrieval with structured indices), it returns an ordrered list of entities, open source project Folly(http://github.comfacebook/foll)

- Diversified Top-k Graph Pattern Maching(Edinburgh Fan Wenfei)  
Algorithms for top-k DAG, acyclic and complexity, approximation for diversified matches and early termination heuristics, mainly tackle social data, study two classes fuctions for ranking the matches, i.e., relevance and distance

- Probabilistic Query Rewriting for Efficient and Effective Keyword Search on Graph Data(Karlsruhe Institue of Tech, Germany)  
Query rewriting for keyword search(rewrite as valid tokens in data, group into segments), key point:rank query rewrites and propose dynamic programming, query cleaning

- Summarizing Answer Graphs Induced by Keyword Queries(UC Santa Barbara)  
Compute k summary graph in knowledge graph for keyword queries, propose metric coverage ratio

- Counter Strike: Generic Top-Down Join Enmeration for Hypergraphs(University of mannheim, Germany)  
Query optimizers, evaluate on chains, cycles, cliques, reuse top-down enumerator for simple graphs to handle hyper graphs, competitive to bottom-up approach with branch-bounding-pruning

- Counting and Sampling Triangles from a Graph Stream(IBM research)  
Approximate and sample triangles counts and n-cliques count, support temporal info with sliding window, implement cache-efficient multicore parallel algorithm, refer to "Parallel triangle counting in massive streaming graphs"

- Scaling Queries over Big RDF Graphs with Semantic Hash Partitioning(Georgia Institute of Tech)  
Implement ontop of Hadoop targeted at RDF(resource description framework), semantic hash partitioning extends direction-based triple groups and direction-based triple replications, locality-optimizaed query execution, optimize partition

- Distributed Socialite: A Datalog-based language for large-scale Graph Analysis(Intel, Stanford)  
Distributed Socialite, DSL query language with compiler, for social network approximation: early termination, bloom-filter based approximation, benchmark: sssp, pr, cc, mutual neighbors, triangle count, clustering coefficients(global and local)

- Fast Iterative Graph Computation with Block Updates(Cornell)  
Grace, block-oriented computation from HPC(Computation over blocks of highly connected nodes), vertex-centric useful for belief propogation

- Demo(Graph Queries in a Next-Generation Datalog System)(UCLA)  
Deductive application language(support app using regular stratiification but suffer from inefficient execution), first deductive database system

- Phd Seminar(Fast Cartography for Data Explorers)  
Answer query with query

##2014
- Event Pattern Match over Graph Streams(University of Massachusetts)  
Query event pattern match(semantics, on-line algorithms), different from subgraph match(refer to node-neighbor trees method), using DDST(degree-preserving dual simulation with timing constraints), number theoretic signature, coloring algorithms, test data(road, twitter, citation)

- Fast Failure Recovery in Distributed Graph Processing Systems(Jagadish)  
EpiCG(on top of epiC), also test on top of Giraph, former:check-point or log-based recovery, now:local-log and parallel recovery, test on k-meeans, pagerank and semi-clustering, define reassignment generation problem, test on forest, livejournal, friendster

- GRAMI: Frequent Subgraph and Pattern Mining in a Single Large Graph(King Abdullahh University)  
Only find minimal set of instances(Constraints statification problem), CGRAMI(supporting structural and semantic constraints), AGRAMI(approximate version with no false positives), Prior: 1) frequent subgraph(isomorphism):back-track, csp-based, search-order optimization, index, parallel; 2) pattern mining: R-join, distance-join, test on twitter

- Schemaless and Structureless Graph Querying(UC Santa Barbara)  
Based on knowledge graph(e.g RDF), auto map keywords to matches in graph, two procedures(training instance generation, online searching), propose rank model and implement top-k search and index, test on dbpedia and freebase, refer to "A survey of algorithms for keywor search on graph data"

- Optimizing Graph Algorithms on Pregel-like Systems(Stanford GPS team)  
Experiment on GPS, implement those with PRAM model, which could not be represented via vertex-centric model, e.g. strongly connected components, minimum spanning forest, graph coloring, approximate maximun Weight matching, weakly connected components, optimization techniques: 1) finish computations serially, 2) storing edges at subvertices, 3) edge cleaning on demand, 4) single pivot

- A Principled Approach to Bridging the Gap between Graph Data and their Schemas(IBM Research)  
1) Define language for inputing rules for structuredness, 2) partition rdf graph into subsets with respect to specific structureddness functions chosen by users, test on DBpedia Persons and WordNet Nouns








