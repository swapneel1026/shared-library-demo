def call(String environment) {
    echo "Deploying application to ${environment} environment"
    sh "sleep 2"
    sh "echo Deployment Completed"
}