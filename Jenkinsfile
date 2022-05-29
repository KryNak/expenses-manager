pipeline {
    agent any

    tools {
        gradle 'Gradle'
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Run') {
            steps {
                sh 'nohup java -jar -Dserver.port=9090 ./build/libs/ExpensesManager-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}