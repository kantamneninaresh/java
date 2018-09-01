pipeline{
  agent any
  stages{
    stage('test maven'){
      steps{
      withMaven(maven :'localMaven'){
        sh 'mvn --version'
        }
      }
    }
  }
}
