def gv
pipeline{
    agent any
    tools {nodejs "Nodejs-17.3.0"}
    stages{
        stage("init"){
            steps{
                script{
                    gv  = load "jenkins.groovy"
                }
               
            }
        }
        stage("A"){
            steps{
                echo "========executing A========"
            }
        }
        stage("b"){
            steps{
                echo "========executing b========"
            }
        }
        stage("build"){
            steps{
                script {
                    gv.buildApp()
                    
                }
            }
            
        }
    }
}