package org.apache.ojb.tools.mapping.reversedb2.propertyEditors;

/* Copyright 2002-2005 The Apache Software Foundation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import org.apache.ojb.tools.mapping.reversedb2.dbmetatreemodel.DBMetaSchemaNode;

/**
 * This is an implementation of a PropertyEditor for the DBMetaSchemaNode class.
 *
 * @author <a href="mailto:bfl@florianbruckner.com">Florian Bruckner</a> 
 * @version $Id: JPnlPropertyEditorDBMetaSchema.java,v 1.1 2007-08-24 22:17:28 ewestfal Exp $
 */
public class JPnlPropertyEditorDBMetaSchema extends PropertyEditor
{
    
    
    /** Creates new form JPnlPropertyEditorDBMetaCatalog */
    public JPnlPropertyEditorDBMetaSchema ()
    {
        initComponents ();
        setPropertyChangeListener(new SchemaPropertyChangeListener());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        java.awt.GridBagConstraints gridBagConstraints;

        lblSchemaName = new javax.swing.JLabel();
        tfSchemaName = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        lblSchemaName.setText("Schema Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(lblSchemaName, gridBagConstraints);

        tfSchemaName.setEditable(false);
        tfSchemaName.setText("jTextField1");
        tfSchemaName.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(tfSchemaName, gridBagConstraints);

    }//GEN-END:initComponents

    public void setEditorTarget (PropertyEditorTarget target)
    {
        if (target instanceof DBMetaSchemaNode)
        {
            super.setEditorTarget(target);
            this.tfSchemaName.setText((String)target.getAttribute(DBMetaSchemaNode.ATT_SCHEMA_NAME));
        }
        else
        {
            throw new UnsupportedOperationException("This editor can only edit DBSchemaCatalogNode objects");
        }
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSchemaName;
    private javax.swing.JTextField tfSchemaName;
    // End of variables declaration//GEN-END:variables
    
    public class SchemaPropertyChangeListener implements java.beans.PropertyChangeListener
    {
        public void propertyChange (java.beans.PropertyChangeEvent propertyChangeEvent)
        {
            if (propertyChangeEvent.getPropertyName() == (DBMetaSchemaNode.ATT_SCHEMA_NAME))
            {
                tfSchemaName.setText((String)propertyChangeEvent.getNewValue());
            }
        }        
    }
    
}
