pipeline{
    agent any
    stages{
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
                echo "========executing c========"
            }
            nodejs('node-17'){
                sh 'yarn install '
            }
        }
    }
}