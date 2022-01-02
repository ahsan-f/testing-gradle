def test(){
    echo 'building the application...'
        // in linux use 'sh' while in windows use 'bat'
    sh "yarn install"
    
    
}

def deployGradle(){
    echo 'building the gradle...'
        // in linux use 'sh' while in windows use 'bat'

    withGradle(){
        sh './gradlew -v'
    }
    
}


return this