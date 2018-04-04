#### 查找指定行区间日志
> eg: 100 ~ 200 

    cat <file> | tail -n +100 | head -100
    

#### 查找压缩日志
> eg: *.gz

    zcat -d | grep <aaa>
