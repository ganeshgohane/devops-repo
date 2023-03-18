node {
    stages{
        stage('pull'){
            echo "pipeline pull successfully"
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