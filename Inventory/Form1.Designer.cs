namespace Inventory
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGrid = new System.Windows.Forms.DataGridView();
            this.buttonCreate = new System.Windows.Forms.Button();
            this.textBoxDescription = new System.Windows.Forms.TextBox();
            this.textBoxDeployment = new System.Windows.Forms.TextBox();
            this.labelDescription = new System.Windows.Forms.Label();
            this.labelDeployment = new System.Windows.Forms.Label();
            this.buttonDelete = new System.Windows.Forms.Button();
            this.comboBoxDelete = new System.Windows.Forms.ComboBox();
            this.textBoxSetDescription = new System.Windows.Forms.TextBox();
            this.buttonSetDescription = new System.Windows.Forms.Button();
            this.labelEdit = new System.Windows.Forms.Label();
            this.textBoxSetDeployment = new System.Windows.Forms.TextBox();
            this.buttonSetDeployment = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGrid)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGrid
            // 
            this.dataGrid.AllowUserToAddRows = false;
            this.dataGrid.AllowUserToDeleteRows = false;
            this.dataGrid.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.dataGrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGrid.Location = new System.Drawing.Point(12, 12);
            this.dataGrid.Name = "dataGrid";
            this.dataGrid.ReadOnly = true;
            this.dataGrid.Size = new System.Drawing.Size(776, 314);
            this.dataGrid.TabIndex = 0;
            // 
            // buttonCreate
            // 
            this.buttonCreate.Location = new System.Drawing.Point(181, 370);
            this.buttonCreate.Name = "buttonCreate";
            this.buttonCreate.Size = new System.Drawing.Size(113, 23);
            this.buttonCreate.TabIndex = 1;
            this.buttonCreate.Text = "Add New Item";
            this.buttonCreate.UseVisualStyleBackColor = true;
            this.buttonCreate.Click += new System.EventHandler(this.buttonCreate_Click);
            // 
            // textBoxDescription
            // 
            this.textBoxDescription.Location = new System.Drawing.Point(12, 352);
            this.textBoxDescription.Name = "textBoxDescription";
            this.textBoxDescription.Size = new System.Drawing.Size(140, 20);
            this.textBoxDescription.TabIndex = 2;
            // 
            // textBoxDeployment
            // 
            this.textBoxDeployment.Location = new System.Drawing.Point(12, 391);
            this.textBoxDeployment.Name = "textBoxDeployment";
            this.textBoxDeployment.Size = new System.Drawing.Size(140, 20);
            this.textBoxDeployment.TabIndex = 3;
            // 
            // labelDescription
            // 
            this.labelDescription.AutoSize = true;
            this.labelDescription.Location = new System.Drawing.Point(60, 333);
            this.labelDescription.Name = "labelDescription";
            this.labelDescription.Size = new System.Drawing.Size(60, 13);
            this.labelDescription.TabIndex = 5;
            this.labelDescription.Text = "Description";
            // 
            // labelDeployment
            // 
            this.labelDeployment.AutoSize = true;
            this.labelDeployment.Location = new System.Drawing.Point(60, 375);
            this.labelDeployment.Name = "labelDeployment";
            this.labelDeployment.Size = new System.Drawing.Size(63, 13);
            this.labelDeployment.TabIndex = 6;
            this.labelDeployment.Text = "Deployment";
            // 
            // buttonDelete
            // 
            this.buttonDelete.Location = new System.Drawing.Point(725, 333);
            this.buttonDelete.Name = "buttonDelete";
            this.buttonDelete.Size = new System.Drawing.Size(63, 23);
            this.buttonDelete.TabIndex = 8;
            this.buttonDelete.Text = "Delete";
            this.buttonDelete.UseVisualStyleBackColor = true;
            this.buttonDelete.Click += new System.EventHandler(this.buttonDelete_Click);
            // 
            // comboBoxDelete
            // 
            this.comboBoxDelete.FormattingEnabled = true;
            this.comboBoxDelete.Location = new System.Drawing.Point(469, 367);
            this.comboBoxDelete.Name = "comboBoxDelete";
            this.comboBoxDelete.Size = new System.Drawing.Size(139, 21);
            this.comboBoxDelete.TabIndex = 9;
            // 
            // textBoxSetDescription
            // 
            this.textBoxSetDescription.Location = new System.Drawing.Point(614, 367);
            this.textBoxSetDescription.Name = "textBoxSetDescription";
            this.textBoxSetDescription.Size = new System.Drawing.Size(100, 20);
            this.textBoxSetDescription.TabIndex = 12;
            // 
            // buttonSetDescription
            // 
            this.buttonSetDescription.Location = new System.Drawing.Point(720, 362);
            this.buttonSetDescription.Name = "buttonSetDescription";
            this.buttonSetDescription.Size = new System.Drawing.Size(75, 35);
            this.buttonSetDescription.TabIndex = 13;
            this.buttonSetDescription.Text = "Set Description";
            this.buttonSetDescription.UseVisualStyleBackColor = true;
            this.buttonSetDescription.Click += new System.EventHandler(this.buttonSetDescription_Click);
            // 
            // labelEdit
            // 
            this.labelEdit.AutoSize = true;
            this.labelEdit.Location = new System.Drawing.Point(516, 352);
            this.labelEdit.Name = "labelEdit";
            this.labelEdit.Size = new System.Drawing.Size(25, 13);
            this.labelEdit.TabIndex = 14;
            this.labelEdit.Text = "Edit";
            // 
            // textBoxSetDeployment
            // 
            this.textBoxSetDeployment.Location = new System.Drawing.Point(614, 406);
            this.textBoxSetDeployment.Name = "textBoxSetDeployment";
            this.textBoxSetDeployment.Size = new System.Drawing.Size(100, 20);
            this.textBoxSetDeployment.TabIndex = 15;
            // 
            // buttonSetDeployment
            // 
            this.buttonSetDeployment.Location = new System.Drawing.Point(720, 404);
            this.buttonSetDeployment.Name = "buttonSetDeployment";
            this.buttonSetDeployment.Size = new System.Drawing.Size(75, 34);
            this.buttonSetDeployment.TabIndex = 16;
            this.buttonSetDeployment.Text = "Set Deployment";
            this.buttonSetDeployment.UseVisualStyleBackColor = true;
            this.buttonSetDeployment.Click += new System.EventHandler(this.buttonSetDeployment_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.buttonSetDeployment);
            this.Controls.Add(this.textBoxSetDeployment);
            this.Controls.Add(this.labelEdit);
            this.Controls.Add(this.buttonSetDescription);
            this.Controls.Add(this.textBoxSetDescription);
            this.Controls.Add(this.comboBoxDelete);
            this.Controls.Add(this.buttonDelete);
            this.Controls.Add(this.labelDeployment);
            this.Controls.Add(this.labelDescription);
            this.Controls.Add(this.textBoxDeployment);
            this.Controls.Add(this.textBoxDescription);
            this.Controls.Add(this.buttonCreate);
            this.Controls.Add(this.dataGrid);
            this.Name = "Form1";
            this.Text = "Inventory";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Form1_FormClosing);
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGrid;
        private System.Windows.Forms.Button buttonCreate;
        private System.Windows.Forms.TextBox textBoxDescription;
        private System.Windows.Forms.TextBox textBoxDeployment;
        private System.Windows.Forms.Label labelDescription;
        private System.Windows.Forms.Label labelDeployment;
        private System.Windows.Forms.Button buttonDelete;
        private System.Windows.Forms.ComboBox comboBoxDelete;
        private System.Windows.Forms.TextBox textBoxSetDescription;
        private System.Windows.Forms.Button buttonSetDescription;
        private System.Windows.Forms.Label labelEdit;
        private System.Windows.Forms.TextBox textBoxSetDeployment;
        private System.Windows.Forms.Button buttonSetDeployment;
    }
}

