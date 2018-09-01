pipeline{
  agent any
  stages{
    stage("test maven"){
      withMaven(maven :"localMaven"){
        sh "mvn --version"
    }
    }
  }
}
