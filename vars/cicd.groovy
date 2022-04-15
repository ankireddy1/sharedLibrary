def newGit("repo")
{
     git ${"repo"}
}
def newMaven()
{
    sh 'mvn package'
}
def newDeploy("ip")
{
    scp /home/ubuntu/.jenkins/workspace/SharedLibrary ubuntu@${"ip"}:/var/libltomcat9/webapps/sagar.war
}

