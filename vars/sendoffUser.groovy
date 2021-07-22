def call(String username = 'null', String designation = 'null') {
	echo "this is share library sendoffUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
			DESG = "${designation}"
		}
		agent any
			stages {
				stage('SECOND_USER') {
					steps {
						echo "HI $USER_NAME, How are you !"
						echo "Designation: $DESG"
					}
				}
			}
		}
	}
