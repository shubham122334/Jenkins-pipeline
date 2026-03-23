pipeline{
    agent any
    tools {
        jdk 'jdk17'   // must be configured in Jenkins
    }
    stages {
        stage('compile'){
            steps{
                sh 'javac Main.java'
            }
        }
        stage('run'){
            steps{
                sh 'java Main'
            }
        }
    }
}
