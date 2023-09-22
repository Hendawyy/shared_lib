#1/usr/bon/env/groovy
def call() {
    node {
        stage('Install Nginx') {
            sh 'sudo apt update'
            sh 'sudo apt install nginx -y'
        }
    }
}
