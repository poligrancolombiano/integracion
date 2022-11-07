pipeline {
  agent any
  stages {
    pipeline {
      agent any
      stages {
        stage('build-maven') {
              steps {
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
              }
            }

            stage('docker-clean') {
              steps {
                sh '''docker image prune --force


        docker container prune --force'''
              }
            }

      }
    }

  }
}