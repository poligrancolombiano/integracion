pipeline {
  agent any
  stages {
    stage('build-maven') {
      steps {
        sh 'chmod +x gradlew'
        sh './gradlew clean build'
        sh 'sysctl -w net.ipv4.ip_forward=1'
      }
    }

    stage('docker-clean') {
      steps {
        sh '''docker image prune --force


docker container prune --force'''
      }
    }

    stage('del-container') {
      steps {
        sh '''containers="docker ps | grep \'integracion\' | awk \'{ print $1 }"
if [ -n "$containers" ]; then
        docker rm -f $containers
fi'''
      }
    }

    stage('build-docker') {
      steps {
        sh '''docker build -t integracion .


'''
      }
    }

    stage('run-docker') {
      steps {
        sh '''docker run -d -p 9090:9090 integracion --network mysql_net integracion
        '''
      }
    }

  }
}