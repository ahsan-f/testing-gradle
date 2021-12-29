pipeline{
    agent any
    stages{
        stage("A"){
            steps{
                echo "========executing A========"
            }
            nodejs('node-17'){
                bat 'yarn install '
            }
        }
    }
    
}
