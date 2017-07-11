```java
void waitForSend() throws InterruptedException, ExecutionException {
    // wait for producing tasks
    LogOperation[] logOperations = localOperations.toArray(new LogOperation[0]);
    prevFuture.get();
    PipelinedComputation.blockingQueue.put(logOperations);
}
```
