#!groovy






 node("") {

    def mavenHome
    def deploymentUtils

    final String APP_NAME = 'org-management'
    final String APP_BASE = 'org-management'
    final String CF_ORG = 'tenant-management'
    final String CF_SPACE = 'app'
    final String DEPLOYMENT = 'dev'
    final String APP_NAME_PREFIX = 'green-'
      try {
            stage('Preparation') {
                checkout scm
                deploymentUtils = load('pipeline/utils/DeploymentUtils.groovy')
                
            }
            withEnv([
                    
                    "PATH=${env.PATH}"
            ]) {
                //app deploy
                stage("dev-deploy"){
            
                        
                        deploymentUtils.appPackageDeploy(DEPLOYMENT, CF_ORG, CF_SPACE,APP_BASE, APP_NAME, APP_NAME_PREFIX)
                    
                }
                currentBuild.result = "SUCCESS"
            }
           }
    catch (error) {
        currentBuild.result = "FAILURE"
        throw error
    }
}
    

