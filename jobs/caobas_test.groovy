project_name = "caoba-test"
repo = "git@github.com:jeicopercy/" + project_name + ".git"

multibranchPipelineJob(project_name) {
    branchSources {
        git {
            id(project_name)
            remote(repo)
            includes('develop')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(0)
        }
    }
}