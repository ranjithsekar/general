## SCP
``` python
sudo scp -i /data/pem/developer.PEM myapp.war ec2-user@10.5.15.18:/opt/apps/tomcat8/webapps/
```

## LIST files
``` python
sudo ssh -i /data/pem/developer.PEM ec2-user@10.5.15.18 ls -ltr /opt/apps/tomcat8/bin/
```

## RESTART TOMCAT on another EC2
``` python
sudo ssh -i /data/pem/developer.PEM ec2-user@10.5.15.18 /opt/apps/tomcat8/bin/catalina.sh stop -force
```

## Copy EC2 to other EC2
1. Copy file from one-ec2 to two-ec2 bastion
``` python
sudo scp myfile.zip ranjith@10.5.15.20:/home/ranjith/
```
2. two-ec2 bastion to two-ec2
``` python
scp -i developer.PEM myfile.zip sekar@10.2.4.18:/data/test (test is sekar folder)
```
3. two-ec2 bastion to one-ec2
``` python
scp -i developer.PEM myfile.tgz sekar@10.20.10.30:/data/
```
