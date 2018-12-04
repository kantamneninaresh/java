#!groovy

node {
  def rootDir = pwd()
 def tools = load "${rootDir}\\Test.groovy"
  call("hi"){
    echo("executed")
    }
  }
