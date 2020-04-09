node {
	properties(
		[parameters(
			[choice(choices: 
				[
				'v0.1', 
				'v0.2', 
				'v0.3', 
				'v0.4', 
				'v0.5'], 
	description: 'Which version of the app should I deploy? ', 
		name: 'Version'), 
			choice(choices: 
			[
		    'dev1.aizirek.org', 
			'qa1.aizirek.org', 
			'stage1.aizirek.org', 
			'prod1.aizirek.org'],
	description: 'Please provide an environment to build the application', 
		name: 'Environment')])])
	stage("Stage2"){
		timestamps {
			git 'https://github.com/Aizirek-1992/jenkins-pipelines.git'
	}
}
	stage("Stage2"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage3"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage4"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage5"){
		timestamps {
			ws {
				withDockerContainer('centos') {
					echo "Hello"
                    sleep 20
				}
			}
		}
	}
}
