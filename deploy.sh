#!/bin/bash
# CURRENT_PID=$(pgrep -f .jar)
 CURRENT_PID=$(pgrep -f "Resume_WebPage-0.0.1-SNAPSHOT.jar")
 echo "$CURRENT_PID"
 if [ -z $CURRENT_PID ]; then
         echo "no process"
 else
         echo "kill $CURRENT_PID"
         kill -9 $CURRENT_PID
         sleep 3
 fi

# JAR_PATH="/home/ubuntu/cicd/*.jar"
 JAR_PATH="/home/ubuntu/cicd/Resume_WebPage-0.0.1-SNAPSHOT.jar"
 echo "jar path : $JAR_PATH"
 chmod +x $JAR_PATH

 # nohup.out 파일 삭제 및 새로운 로그 파일 생성
 if [ -f nohup.out ]; then
     rm nohup.out
     echo "nohup.out 파일이 삭제되었습니다."
 fi

 nohup java -Djava.net.preferIPv4Stack=true -jar "$JAR_PATH" > nohup.out 2>&1 &
 echo "JAR 파일 배포 성공, 로그는 nohup.out에 기록됩니다."