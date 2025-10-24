package com.example.graphiceditor.service;

import com.example.graphiceditor.model.Project;
import com.example.graphiceditor.model.User;

import java.time.LocalDateTime;

public class ProjectService {

    public Project createNewProjectForUser(User user, String projectName, int width, int height) {
        Project project = ProjectFactory.create(projectName, width, height);
        user.addProject(project);
        return project;
    }

    public void updateLastModified(Project project) {
        project.setLastModified(LocalDateTime.now());
    }

    // Внутрішня фабрика, щоб не плодити конструкторів вручну
    private static class ProjectFactory {
        static Project create(String projectName, int width, int height) {
            var doc = new com.example.graphiceditor.model.ImageDocument(null, width, height);
            var p = new Project(null, projectName, LocalDateTime.now(), doc);
            return p;
        }
    }
}
