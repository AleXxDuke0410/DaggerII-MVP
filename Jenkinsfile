pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh './gradlew clean'
      }
    }
    stage(':app Module Test') {
      steps {
        sh './gradlew core:testDevelopmentDebugUnitTest'
      }
    }
  }
}
