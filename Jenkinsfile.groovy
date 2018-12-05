#!groovy

node {
  withTMVaultCredentials("hi"){
    echo("executed")
    echo "$SECRET_ID"
    echo "$WORKSPACE"
    }
  }

def withTMVaultCredentials(datacenter, Closure body) {
    static final String VAULT_APPSECRET_KEY_PREFIX = 'tm.vault.appsecret.'

    withCredentials([string(credentialsId: VAULT_APPSECRET_KEY_PREFIX + datacenter, variable: 'SECRET_ID')]) {
        withEnv(['VAULT_TM_ROLE_ID=TM', "VAULT_TM_SECRET_ID=$SECRET_ID"]) {
            echo "$SECRET_ID"
            body()
        }
    }
}
