<<<<<<< HEAD
node {
	properties([pipelineTriggers([cron('* * * * *')])])
	stage("Stage1"){
		echo "hello"
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
=======
node { properties([pipelineTriggers([cron('* * * * *')])]) 
stage("Stage1"){ 
echo "hello" 
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
>>>>>>> 3e23b5a991e051c0d0d9ac474ca1add611ac86d0
