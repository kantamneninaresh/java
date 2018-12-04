node("") {
  def testUtils = new Test()
  
  testUtils("hi"){
  echo("executed")
  }
}
