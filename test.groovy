def call(String workerNode) {
    def commands = [
        "sudo apt-get update",
        "sudo apt-get install nginx -y"
    ]
    def result = bat(script: commands.join(" && "), label: "Install Nginx", returnStatus: true)
    if (result != 0) {
        error("Failed to install Nginx on $workerNode")
    }
}
