node("ccone-slave") {
  def testUtils = load('Test.groovy')
  
  testUtils.call("hi"){
  echo("executed")
  }
}