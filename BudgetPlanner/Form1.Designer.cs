namespace BudgetPlanner
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
            this.dataGridViewBudget = new System.Windows.Forms.DataGridView();
            this.labelNewExpense = new System.Windows.Forms.Label();
            this.textBoxDesc = new System.Windows.Forms.TextBox();
            this.labelDesc = new System.Windows.Forms.Label();
            this.textBoxAmt = new System.Windows.Forms.TextBox();
            this.labelAmt = new System.Windows.Forms.Label();
            this.comboBoxFreq = new System.Windows.Forms.ComboBox();
            this.labelFreq = new System.Windows.Forms.Label();
            this.buttonCreate = new System.Windows.Forms.Button();
            this.comboBoxDelete = new System.Windows.Forms.ComboBox();
            this.buttonDelete = new System.Windows.Forms.Button();
            this.labelIncome = new System.Windows.Forms.Label();
            this.labelSavings = new System.Windows.Forms.Label();
            this.labelSavingsGoal = new System.Windows.Forms.Label();
            this.buttonSave = new System.Windows.Forms.Button();
            this.buttonLoad = new System.Windows.Forms.Button();
            this.textBoxIncome = new System.Windows.Forms.TextBox();
            this.buttonIncome = new System.Windows.Forms.Button();
            this.saveFileDialog1 = new System.Windows.Forms.SaveFileDialog();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewBudget)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridViewBudget
            // 
            this.dataGridViewBudget.AllowUserToAddRows = false;
            this.dataGridViewBudget.AllowUserToDeleteRows = false;
            this.dataGridViewBudget.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.dataGridViewBudget.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewBudget.Location = new System.Drawing.Point(618, 12);
            this.dataGridViewBudget.Name = "dataGridViewBudget";
            this.dataGridViewBudget.Size = new System.Drawing.Size(455, 457);
            this.dataGridViewBudget.TabIndex = 0;
            // 
            // labelNewExpense
            // 
            this.labelNewExpense.AutoSize = true;
            this.labelNewExpense.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelNewExpense.Location = new System.Drawing.Point(209, 31);
            this.labelNewExpense.Name = "labelNewExpense";
            this.labelNewExpense.Size = new System.Drawing.Size(190, 24);
            this.labelNewExpense.TabIndex = 1;
            this.labelNewExpense.Text = "Create New Expense";
            // 
            // textBoxDesc
            // 
            this.textBoxDesc.Location = new System.Drawing.Point(71, 78);
            this.textBoxDesc.Name = "textBoxDesc";
            this.textBoxDesc.Size = new System.Drawing.Size(138, 20);
            this.textBoxDesc.TabIndex = 2;
            // 
            // labelDesc
            // 
            this.labelDesc.AutoSize = true;
            this.labelDesc.Location = new System.Drawing.Point(111, 62);
            this.labelDesc.Name = "labelDesc";
            this.labelDesc.Size = new System.Drawing.Size(60, 13);
            this.labelDesc.TabIndex = 3;
            this.labelDesc.Text = "Description";
            // 
            // textBoxAmt
            // 
            this.textBoxAmt.Location = new System.Drawing.Point(242, 78);
            this.textBoxAmt.Name = "textBoxAmt";
            this.textBoxAmt.Size = new System.Drawing.Size(100, 20);
            this.textBoxAmt.TabIndex = 4;
            // 
            // labelAmt
            // 
            this.labelAmt.AutoSize = true;
            this.labelAmt.Location = new System.Drawing.Point(273, 62);
            this.labelAmt.Name = "labelAmt";
            this.labelAmt.Size = new System.Drawing.Size(43, 13);
            this.labelAmt.TabIndex = 5;
            this.labelAmt.Text = "Amount";
            // 
            // comboBoxFreq
            // 
            this.comboBoxFreq.FormattingEnabled = true;
            this.comboBoxFreq.Location = new System.Drawing.Point(374, 77);
            this.comboBoxFreq.Name = "comboBoxFreq";
            this.comboBoxFreq.Size = new System.Drawing.Size(121, 21);
            this.comboBoxFreq.TabIndex = 6;
            // 
            // labelFreq
            // 
            this.labelFreq.AutoSize = true;
            this.labelFreq.Location = new System.Drawing.Point(409, 61);
            this.labelFreq.Name = "labelFreq";
            this.labelFreq.Size = new System.Drawing.Size(57, 13);
            this.labelFreq.TabIndex = 7;
            this.labelFreq.Text = "Frequency";
            // 
            // buttonCreate
            // 
            this.buttonCreate.Location = new System.Drawing.Point(233, 124);
            this.buttonCreate.Name = "buttonCreate";
            this.buttonCreate.Size = new System.Drawing.Size(120, 23);
            this.buttonCreate.TabIndex = 8;
            this.buttonCreate.Text = "Make New Expense";
            this.buttonCreate.UseVisualStyleBackColor = true;
            this.buttonCreate.Click += new System.EventHandler(this.buttonCreate_Click);
            // 
            // comboBoxDelete
            // 
            this.comboBoxDelete.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.comboBoxDelete.FormattingEnabled = true;
            this.comboBoxDelete.Location = new System.Drawing.Point(732, 475);
            this.comboBoxDelete.Name = "comboBoxDelete";
            this.comboBoxDelete.Size = new System.Drawing.Size(121, 21);
            this.comboBoxDelete.TabIndex = 9;
            // 
            // buttonDelete
            // 
            this.buttonDelete.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.buttonDelete.Location = new System.Drawing.Point(872, 475);
            this.buttonDelete.Name = "buttonDelete";
            this.buttonDelete.Size = new System.Drawing.Size(75, 23);
            this.buttonDelete.TabIndex = 10;
            this.buttonDelete.Text = "Delete";
            this.buttonDelete.UseVisualStyleBackColor = true;
            this.buttonDelete.Click += new System.EventHandler(this.buttonDelete_Click);
            // 
            // labelIncome
            // 
            this.labelIncome.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.labelIncome.AutoSize = true;
            this.labelIncome.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelIncome.Location = new System.Drawing.Point(523, 514);
            this.labelIncome.Name = "labelIncome";
            this.labelIncome.Size = new System.Drawing.Size(154, 24);
            this.labelIncome.TabIndex = 11;
            this.labelIncome.Text = "Monthly Income: ";
            // 
            // labelSavings
            // 
            this.labelSavings.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.labelSavings.AutoSize = true;
            this.labelSavings.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelSavings.Location = new System.Drawing.Point(523, 550);
            this.labelSavings.Name = "labelSavings";
            this.labelSavings.Size = new System.Drawing.Size(159, 24);
            this.labelSavings.TabIndex = 12;
            this.labelSavings.Text = "Savings Balance: ";
            // 
            // labelSavingsGoal
            // 
            this.labelSavingsGoal.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.labelSavingsGoal.AutoSize = true;
            this.labelSavingsGoal.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelSavingsGoal.Location = new System.Drawing.Point(523, 589);
            this.labelSavingsGoal.Name = "labelSavingsGoal";
            this.labelSavingsGoal.Size = new System.Drawing.Size(135, 24);
            this.labelSavingsGoal.TabIndex = 13;
            this.labelSavingsGoal.Text = "Savings Goal:  ";
            // 
            // buttonSave
            // 
            this.buttonSave.Location = new System.Drawing.Point(5, 12);
            this.buttonSave.Name = "buttonSave";
            this.buttonSave.Size = new System.Drawing.Size(83, 23);
            this.buttonSave.TabIndex = 14;
            this.buttonSave.Text = "Save to File";
            this.buttonSave.UseVisualStyleBackColor = true;
            this.buttonSave.Click += new System.EventHandler(this.buttonSave_Click);
            // 
            // buttonLoad
            // 
            this.buttonLoad.Location = new System.Drawing.Point(96, 12);
            this.buttonLoad.Name = "buttonLoad";
            this.buttonLoad.Size = new System.Drawing.Size(90, 23);
            this.buttonLoad.TabIndex = 15;
            this.buttonLoad.Text = "Load from File";
            this.buttonLoad.UseVisualStyleBackColor = true;
            this.buttonLoad.Click += new System.EventHandler(this.buttonLoad_Click);
            // 
            // textBoxIncome
            // 
            this.textBoxIncome.Location = new System.Drawing.Point(21, 193);
            this.textBoxIncome.Name = "textBoxIncome";
            this.textBoxIncome.Size = new System.Drawing.Size(100, 20);
            this.textBoxIncome.TabIndex = 16;
            // 
            // buttonIncome
            // 
            this.buttonIncome.Location = new System.Drawing.Point(127, 191);
            this.buttonIncome.Name = "buttonIncome";
            this.buttonIncome.Size = new System.Drawing.Size(82, 23);
            this.buttonIncome.TabIndex = 17;
            this.buttonIncome.Text = "Set Income";
            this.buttonIncome.UseVisualStyleBackColor = true;
            this.buttonIncome.Click += new System.EventHandler(this.buttonIncome_Click);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1085, 622);
            this.Controls.Add(this.buttonIncome);
            this.Controls.Add(this.textBoxIncome);
            this.Controls.Add(this.buttonLoad);
            this.Controls.Add(this.buttonSave);
            this.Controls.Add(this.labelSavingsGoal);
            this.Controls.Add(this.labelSavings);
            this.Controls.Add(this.labelIncome);
            this.Controls.Add(this.buttonDelete);
            this.Controls.Add(this.comboBoxDelete);
            this.Controls.Add(this.buttonCreate);
            this.Controls.Add(this.labelFreq);
            this.Controls.Add(this.comboBoxFreq);
            this.Controls.Add(this.labelAmt);
            this.Controls.Add(this.textBoxAmt);
            this.Controls.Add(this.labelDesc);
            this.Controls.Add(this.textBoxDesc);
            this.Controls.Add(this.labelNewExpense);
            this.Controls.Add(this.dataGridViewBudget);
            this.Name = "Form1";
            this.Text = "Budget Tracker";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewBudget)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridViewBudget;
        private System.Windows.Forms.Label labelNewExpense;
        private System.Windows.Forms.TextBox textBoxDesc;
        private System.Windows.Forms.Label labelDesc;
        private System.Windows.Forms.TextBox textBoxAmt;
        private System.Windows.Forms.Label labelAmt;
        private System.Windows.Forms.ComboBox comboBoxFreq;
        private System.Windows.Forms.Label labelFreq;
        private System.Windows.Forms.Button buttonCreate;
        private System.Windows.Forms.ComboBox comboBoxDelete;
        private System.Windows.Forms.Button buttonDelete;
        private System.Windows.Forms.Label labelIncome;
        private System.Windows.Forms.Label labelSavings;
        private System.Windows.Forms.Label labelSavingsGoal;
        private System.Windows.Forms.Button buttonSave;
        private System.Windows.Forms.Button buttonLoad;
        private System.Windows.Forms.TextBox textBoxIncome;
        private System.Windows.Forms.Button buttonIncome;
        private System.Windows.Forms.SaveFileDialog saveFileDialog1;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
    }
}

