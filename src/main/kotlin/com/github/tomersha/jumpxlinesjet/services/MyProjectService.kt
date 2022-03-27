package com.github.tomersha.jumpxlinesjet.services

import com.intellij.openapi.project.Project
import com.github.tomersha.jumpxlinesjet.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
