pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for DEV enviroment...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in DEV enviroment'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in DEV to move to SIT'
            }
        }
    }
}