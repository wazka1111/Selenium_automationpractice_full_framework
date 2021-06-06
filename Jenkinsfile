pipeline
{
    agent any
    tools{
    jdk "JAVA_HOME"
    }

    stages {
        stage('Build') {
            steps {
                echo '>>>Conecting to git repo - DAREK >>>>>>>>>>>>>>>'
                git 'https://github.com/wazka1111/Selenium_automationpractice_full_framework.git'
                bat 'mvn clean compile'
                //sh 'mvn clean compile' - dla linuxa
            }
        }
        stage('Test') {
            steps {
                echo '>>>Start Selenium tests - DAREK >>>>>>>>>>>>>>>'
                bat 'mvn test'
                //sh 'mvn clean compile' - dla linuxa
            }
            post {

                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
