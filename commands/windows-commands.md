## 1. check port running

``` python
> netstat -aon |find /i "listening" |find "port"
```

## 2. Kill a port

``` python
> taskkill /PID typeyourPIDhere /F
```
