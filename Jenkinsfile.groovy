#!groovy

node {
  def rootDir = pwd()
 def tools = load "Test.groovy"
  call("hi"){
    echo("executed")
    }
  }
