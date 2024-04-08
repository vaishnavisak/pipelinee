pipeline {
    agent any

    stages {
		stage('DELETE') { 
            steps {
                echo '--CLONE STAGE EXECUTION ---'
		    	
		    bat "for /d %%X in (*.*) do rmdir /s /q %%X"
            }
        }
		stage('CLONE') { 
            steps {
                echo '--CLONE STAGE EXECUTION ---'
				bat "git clone https://github.com/Rsowmya26/pipelinee.git"
            }
        }
        stage('Build') { 
            steps {
                bat 'javac LinearSearch.java'
            }
		}	
	stage('Run') { 
            steps {
                bat 'java LinearSearch 5'
            }
        }
	stage('Test'){
		steps{
			bat 'javac -cp junit-4.13.2.jar;hamcrest-core-1.3.jar;. LinearSearchTest.java '
			bat 'java -cp junit-4.13.2.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore LinearSearchTest'
		}
	}
    }
}
