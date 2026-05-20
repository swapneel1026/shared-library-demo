def call(String environment) {
    echo "Deploying application to ${environment} environment"
    sh "echo Deployment Completed"
}