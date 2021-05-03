project_name = "Caoba-test"
repo = "git@github.com:jeicopercy/" + project_name + ".git"

multibranchPipelineJob(project_name) {
    branchSources {
        git {
            id(project_name)
            remote(repo)
            includes('develop')
        }
        git {
            id(project_name)
            remote(repo)
            includes('master')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(0)
        }
    }
}