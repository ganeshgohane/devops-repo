node {  
    stage('Pull') { 
         git 'https://github.com/ganeshgohane/devops-repo.git'
    }
    stage('Build') { 
       echo 'PIPELINE BUILD SUCCESSFULLY'  
    }
    stage('Test') { 
        echo 'PIPELINE TEST SUCCESSFULLY'
    }
    stage('Deploy') { 
        echo 'PIPELINE DEPLOY SUCCESSFULLY'
    }
}
