package org.apache.airavata.xbaya.registrybrowser.model;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public class XBayaWorkflowTemplate {
    private Node workflowNode;

    public XBayaWorkflowTemplate(Node workflowNode) {
        setWorkflowNode(workflowNode);
    }

    public Node getWorkflowNode() {
        return workflowNode;
    }

    public void setWorkflowNode(Node workflowNode) {
        this.workflowNode = workflowNode;
    }

    public String getWorkflowName() {
        try {
            return getWorkflowNode().getName();
        } catch (RepositoryException e) {
            e.printStackTrace();
            return null;
        }
    }
}
