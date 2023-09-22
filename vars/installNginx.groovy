def call() {
    node('AWS') {
        stage('Install Nginx') {
            steps {
                sh 'sudo apt-get install nginx -y'
            }
        }
        stage('Enable Firewall') {
            steps {
                sh "sudo ufw allow 'Nginx HTTP' -y"
                sh 'sudo rm /etc/nginx/sites-available/default /etc/nginx/sites-enabled/default /var/www/html/index.nginx-debian.html'
            }
        }
        stage('Test Nginx') {
            steps {
                sh 'sudo systemctl status nginx'
            }
        }
    }
}
