def gv
pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    gv  = load "script.groovy"
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
        stage("c"){
            steps{
                script {
                    gv.buildApp()
                }
            }
            
        }
    }
}