package com.github.redcrafttv.ftpcollab.services

import com.intellij.openapi.project.Project
import com.github.redcrafttv.ftpcollab.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
