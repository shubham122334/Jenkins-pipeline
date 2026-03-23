pipeline{
    agent any
    tools {
        jdk 'jdk17'   // must be configured in Jenkins
    }
    stages {
        stage('compile'){
            steps{
                bat 'javac Main.java'
            }
        }
        stage('run'){
            steps{
                bat 'java Main'
            }
        }
    }
}
