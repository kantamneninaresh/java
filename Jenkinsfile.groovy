#!groovy
def testUtils
node {
  stage('Preparation') {
    testUtils = load('Test.groovy')
  call("hi"){
  echo("executed")
  }
  }
}
