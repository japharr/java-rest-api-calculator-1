pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/japharr/java-rest-api-calculator-1.git'
                sh './mvnw clean compile'
                //bat '.\mvnw clean compile'
            }
        }
    }
}
