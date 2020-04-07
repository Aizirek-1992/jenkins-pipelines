node ( 
    properties([ 
       // Bellow line sets "Discard Builds more than 5"
       properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')), pipelineTriggers([cron('* * *  *  *')])])
       // Bellow line triggers this job every minute
       pipelineTriggers{[cron('* * * * *')]} 
      ]}
stage("Pull Repo"){
    git 'https://github.com/Aizirek-1992/jenkins-pipelines.git'
 



} 
   stage("Stage2"){ 
       echo "hello" 
} 
   stage("Stage3"){ 
       echo "hello" 
} 
   stage("Stage4"){ 
       echo "hello" 
} 
   stage("Stage5"){ 
       echo "hello" 
   } 
} 
