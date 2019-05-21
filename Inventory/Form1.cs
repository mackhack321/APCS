using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using MySql.Data;
using MySql.Data.MySqlClient;

namespace Inventory
{
    public partial class Form1 : Form
    {
        MySqlConnection sql = new MySqlConnection("server=10.0.0.235;uid=mack;pwd=jmstanley;database=inventory");
        DataTable data;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            sql.Open();

            dataGrid.RowHeadersVisible = false;

            dataGrid.Columns.Add("name", "Item Description");
            dataGrid.Columns.Add("deployment", "Deployment");
            dataGrid.Columns.Add("id", "ID");

            populateDataGrid();

            comboBoxDelete.DropDownStyle = ComboBoxStyle.DropDownList;
        }

        public DataTable makeTable()
        {
            MySqlDataAdapter adapter = new MySqlDataAdapter("select * from items;", sql);
            data = new DataTable();
            adapter.Fill(data);
            return data;
        }

        public void populateDataGrid()
        {
            makeTable();
            dataGrid.Rows.Clear();
            comboBoxDelete.Items.Clear();
            foreach (DataRow row in data.Rows)
            {
                dataGrid.Rows.Add(row["name"], row["deployment"], row["id"]);
                comboBoxDelete.Items.Add(row["name"]);
            }
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            sql.Close();
        }

        private void buttonCreate_Click(object sender, EventArgs e)
        {
            string desc = textBoxDescription.Text;
            string deploy = textBoxDeployment.Text;

            if (deploy == "") deploy = "Undeployed";
            if (desc == "")
            {
                MessageBox.Show("Description is a required field.");
            }
            else
            {
                string query = $"INSERT INTO items VALUES (\"{desc}\",\"{deploy}\",0)";
                MySqlCommand cmd = new MySqlCommand(query, sql);
                cmd.ExecuteNonQuery();

                textBoxDeployment.Clear(); textBoxDescription.Clear();

                populateDataGrid();
            }           
        }

        private void buttonDelete_Click(object sender, EventArgs e)
        {
            if (comboBoxDelete.SelectedItem != null)
            {
                string selected = comboBoxDelete.SelectedItem.ToString();

                string query = $"DELETE FROM items WHERE name=\"{selected}\"";
                MySqlCommand cmd = new MySqlCommand(query, sql);
                cmd.ExecuteNonQuery();
                
                populateDataGrid();
            }
        }

        private void buttonSetDescription_Click(object sender, EventArgs e)
        {
            if (textBoxSetDescription.Text != "")
            {
                string selected = comboBoxDelete.SelectedItem.ToString();
                string desc = textBoxSetDescription.Text;

                string query = $"UPDATE items SET name=\"{desc}\" WHERE name=\"{selected}\"";
                MySqlCommand cmd = new MySqlCommand(query, sql);
                cmd.ExecuteNonQuery();

                populateDataGrid();
            }
        }

        private void buttonSetDeployment_Click(object sender, EventArgs e)
        {
            string selected = comboBoxDelete.SelectedItem.ToString();
            string deployment = (textBoxSetDeployment.Text != "") ? textBoxSetDeployment.Text : "Undeployed";

            string query = $"UPDATE items SET deployment=\"{deployment}\" WHERE name=\"{selected}\"";
            MySqlCommand cmd = new MySqlCommand(query, sql);
            cmd.ExecuteNonQuery();

            populateDataGrid();
        }
    }
}
