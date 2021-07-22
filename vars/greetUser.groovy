def call(string username = 'null') {
	echo "this is share library greetUser: $(username)
	pipeline {
		environment {
			USER_NAME = "$username"
		}
		agent any
			stages {
				stage {
					steps {
						echo "HI $USER_NAME, How are you !"
					}
				}
			}
		}
	}
