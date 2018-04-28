## 定位 CPU 高的线程
1. top
> 查看 CPU 高的线程，拿到 pid
2. ps -ef | grep < pid >
> 查看该进程详细信息
3. ps -mp < pid > -o THREAD,tid,time
> 查看该进程具体线程信息，找到 CPU 高的线程
4. printf "%x\n" < tid >
> 拿到该线程的16进制表示
5. jstack < pid > | grep < tid >
> 查看线程栈信息，分析 CPU 为什么高