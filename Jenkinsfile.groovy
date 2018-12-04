#!groovy
def testUtils = load("Test.groovy");
node("") {
  stage('Preparation') {
  call("hi"){
  echo("executed")
  }
  }
}
