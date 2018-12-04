#!groovy
def testUtils = new Test()
node("") {
  
  testUtils("hi"){
  echo("executed")
  }
}
