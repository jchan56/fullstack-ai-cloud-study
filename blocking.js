function longRunningTask() {
    console.log('작업 끝');
}

console.log('시작');
//longRunningTask();
setTimeout(longRunningTask, 0);
console.log('다음 작업');