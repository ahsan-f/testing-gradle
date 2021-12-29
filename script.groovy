def buildApp(){
    echo ' building the application...'
    nodejs('node-17'){
        // in linux use 'sh' while in windows use 'bat'
        bat 'yarn install '
    }
    
}