node {
    stages{
        stage('pull'){
              git 'https://github.com/ganeshgohane/devops-repo.git'
            }
        stage ('build'){
             echo "pipeline build successully"
            }
        stage ('test'){
            echo "pipeline test successfully"
           }
        stage ('deploy'){
            echo "pipeline deploy successfully"
           }
    }
}