def call(String workerNode) {
     pipeline {
    
    agent {
      label  'vm'
    }

    stages {
        
        stage('install nginx') {
            steps {
               sh 'sudo yum install nginx -y'
            }
        }
        stage('start nginx') {
            steps {
                sh "sudo systemctl enable nginx "
                 sh "sudo systemctl start nginx "
            }    
        }
       stage('test nginx') {
            steps {
                sh "curl localhost "
            }    
        }
       
    }
  
}
}
