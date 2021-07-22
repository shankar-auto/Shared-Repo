def call(String username = 'null') {
	echo "this is share library greetUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
		}
		agent any
			stages {
				stage('USER_NAME') {
					steps {
						echo "HI $USER_NAME, How are you !"
					}
				}
			}
		}
	}
