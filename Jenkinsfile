pipeline{
  agent any
  stages{
    stage("starting app"){
      steps{
        echo 'executing test'
      }
    }
    stage("run gradle"){
      echo 'executing gradle'
      withGradle(){
        bat './gradle -v'
      }
    }
  }  
}
