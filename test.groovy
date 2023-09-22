// SharedLibrary/src/com/example/NginxInstaller.groovy

package com.example

def installNginx(remoteHost) {
    sh """
        ssh ${remoteHost} 'sudo apt-get update'
        ssh ${remoteHost} 'sudo apt-get install nginx -y'
    """
}
