pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        echo 'code cehckout'
      }
    }
    stage('Build') {
      steps {
        echo 'Compile the original source code & junits, Run junit test cases, coverage check, package etc'
      }
    }
    stage('Sonar') {
      steps {
        echo 'Code Quality Check'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy-nexus') {
          steps {
            echo 'Deploy the package to nexus'
          }
        }
        stage('Deploy-server') {
          steps {
            echo 'deploy the package to server'
          }
        }
      }
    }
    stage('Test') {
      steps {
        echo 'Selenium Automation test'
      }
    }
  }
}