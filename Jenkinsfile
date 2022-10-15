pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for UAT enviroment...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in UAT enviroment'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in UAT to move to PROD'
            }
        }
    }
}