def create_tag(String tag){

    sh """
    git log -1
    git tag -a ${tag} -m
    git push origin ${tag}
    """
}
return this