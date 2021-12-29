pipeline{
    agent any
    stages{
        stage("A"){
            steps{
                echo "========executing A========"
            }
            
        }
        stage("B"){
            steps{
                echo "========executing A========"
            }
//             withGradle(){
//                bat './gradle -v'
//             }
            nodejs('node-17'){
                bat 'yarn install '
            }
            
        }
    }
    
}
