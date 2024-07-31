pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Bulid Application'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
        
        stage('Depoy') {
            steps {
                echo 'Deploy application'
            }
        }
    }
    
    post{
        always{
            emailext body: 'Summary', subject: 'Pipeline status', to: 'vishalgupta10062024@gmail.com'
        }
    }
}
