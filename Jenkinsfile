pipeline {
    agent any
    stages{
        stage('check') {
            steps {
                 git branch: 'master', url: 'https://github.com/ADirin/leckdemo_laskin_fi.git'
            }
        }

        stage ('build'){
            steps{
               bat 'mvn clean install'
            }
        }

    }

}