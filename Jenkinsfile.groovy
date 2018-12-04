node("") {
  def testUtils = load('Test.groovy')
  
  testUtils("hi"){
  echo("executed")
  }
}
