## GENERAL COMMANDS
### Run shell script with nohup
``` python
> nohup ./script.sh &
```

### check port is running or not
``` python
> netstat -nat | grep 8080
```

### PROCESS Commands
``` python
# Find process id
> ps -ef | grep "process-name"
> ps -eaf | grep
> ps -ealf | grep 
> kill -9 PID => kill a process

# Running job
> fg
```

### Download a file
``` python
> wget https://archive.apache.org/dist/ant/binaries/apache-ant-1.8.0-bin.tar.gz
```

## GREP Commands
``` python
> cat -n file | sed -n '/fromstr/,/tostr/p'
> tail -f tip.log | grep -o -P '(?<=<criteria seq="1" la="eng">).*(?=</criteria>)'
```

## ZIP Commands
``` python
> zip -r myarch.zip mydir => zip
> unzip myarch.zip => unzip

>gzip file1 => gzip a file =>file1.gz
>gzip -r dir1 => 

tar -zcvf outputFileName folderToCompress

> tar -zcvf archive.tar.gz directory/

> for f in *.log;do gzip $f;done => gzip all the .log files on a folder
> gunzip xy.gz => Extract .gz file
```


## TAR Commands
```
TAR COMMANDS
> tar cvf myetc.tar /etc => create .tar
> tar -xf xy.tar => Untar .tar file
> tar -xvzf xxx.tar.gz => unzip
> tar -xvzf xxx.tgz ==> unzip
```

## SVN Commands
``` python
> svn info => last check-in 
> svn diff => diff 
> svn co => checkout 
> svn ci "message" => commit
```

## DISK Commands
``` python
> df -h
> du -sh <dir-name> => check folder size
```

## LIST Commands
``` python
> ls -ltr 
> ls -lsrt
```

## COPY Commands
``` python
> cp -R folder1 folder2 => copy folder1 along with files to folder2 : now folder2/folder1/one.txt
```

## JAVA Commands
``` python
> which java
```

## SCP Commands
``` python
> scp -rp scott@10.5.10.20:/folder1 . => secure copy, folder with files, from one server to other with 
```

## SCREEN Commands
``` python
screen -S ranjith => create new screen session
screen -r ranjith => login to existing screen session

CTRL+A+D => come out of screen
CTRL+A+C => create another screen
CTRL+A " => list all the screen
```

## CURL Commands
``` python
# GET request
> curl "www.google.com"

# POST application/x-www-form-urlencoded
> curl -d "param1=value1&param2=value2" -X POST http://localhost:3000/data

# POST application/x-www-form-urlencoded with data file
> curl -d "@data.txt" -X POST http://localhost:3000/data

# POST with json
> curl -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:3000/data

# POST with json file
> curl -d "@data.json" -H "Content-Type: application/json" -X POST http://localhost:3000/data

curl -H "Content-type:application/xml" -d@60k-i http://10.2.1.7:6060/myapp/product

```

## AWK Commands
``` python
# Remove before a string (input:able, output:ble)
> less input.txt |awk -F'a' '{print $2}' > output.txt
```

## MEMORY Commands
``` python
# Check free memory
> free -m
```