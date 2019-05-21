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
using System.Threading;
namespace StudentDatabase
{
    public partial class FormDatabase : Form
    {
        MySqlConnection sql = new MySqlConnection("server=10.0.0.235;uid=mack;pwd=jmstanley;database=students");

        public DataTable makeTable()
        {
            MySqlDataAdapter adapter = new MySqlDataAdapter("select * from studentstable;", sql);
            DataTable data = new DataTable();
            adapter.Fill(data);
            return data;
        }

        public void badConnection()
        {
            Console.WriteLine("Connection BAD");
            toolStripStatusLabelConnection.Text = "Connection Status: OFFLINE";
            MessageBoxButtons buttons = MessageBoxButtons.RetryCancel;
            DialogResult result = MessageBox.Show("The connection to the database server has been lost or could not be established.  Please repair the connection and select 'Retry' to continue, or select 'Cancel' to abort.", "Connection Error", buttons);
            if (result == DialogResult.Retry)
            {
                sql = new MySqlConnection("server=10.0.0.235;uid=mack;pwd=jmstanley;database=students");
                try { sql.Open(); }
                catch { checkConnection(); }
            }
            else
            {
                Application.Exit();
            }
        }

        public void checkConnection()
        {
            while (true)
            {
                Console.WriteLine("Pinging...");
                try
                {
                    if (!sql.Ping())
                    {
                        badConnection();
                    }
                    else { Console.WriteLine("Connection good"); toolStripStatusLabelConnection.Text = "Connection Status: ONLINE"; }
                    Thread.Sleep(1000);
                }
                catch (Exception e) // this will get called if requests start talking over each other
                {
                    Thread.Sleep(1000);
                }
            }        
        }

        public void sendCommand(string command)
        {
            MySqlCommand cmd = new MySqlCommand(command, sql);
            cmd.ExecuteNonQuery();
        }

        public int getAge(string name)
        {
            MySqlCommand cmd = new MySqlCommand("select (timestampdiff(year,dob,curdate())) as age from studentstable where fname=\"" + name + "\";",sql);
            MySqlDataReader reader = cmd.ExecuteReader();
            int age = 0;
            while (reader.Read())
            {
                age = int.Parse(reader[0].ToString());
            }
            reader.Close();
            return age;
        }

        public void populateDataGrid()
        {
            dataGrid.Rows.Clear();
            DataTable data = makeTable();
            foreach (DataRow row in data.Rows)
            {
                dataGrid.Rows.Add(row["fname"], row["lname"], row["sex"], getAge(row["fname"].ToString()), row["dob"].ToString().Split(' ')[0], row["id"]);      
            }      
        }

        public FormDatabase()
        {
            InitializeComponent();     
        }

        public void addStudent(string fname, string lname, string sex, string dob)
        {
            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
            string confirmtext = $"Are you sure you want to create a new student with this data:\nfname:{fname}\nlname:{lname}\nsex:{sex}\ndob:{dob}";
            DialogResult result = MessageBox.Show(confirmtext, "Confirmation", buttons);
            if (result == DialogResult.Yes)
            {
                Console.WriteLine("Sending student creation request");
                MySqlCommand cmd = new MySqlCommand($"INSERT INTO studentstable VALUES ('{fname.ToString()}','{lname.ToString()}','{sex.ToString()}','{dob.ToString()}','0');", sql);
                Console.WriteLine(cmd.CommandText);
                cmd.ExecuteNonQuery();
                populateDataGrid();
            }
        }

        public string parseDOB(string year, string month, string day)
        {
            if (month.Length < 2) { month = $"0{month}"; }
            if (day.Length < 2) { day = $"0{day}"; }
            return $"{year}-{month}-{day}";
        }

        private void FormDatabase_FormClosing(object sender, FormClosingEventArgs e)
        {  
            sql.Close();
            Console.WriteLine("Closed connection");
        }

        private void buttonCreate_Click(object sender, EventArgs e)
        {
            try
            {
                string fname = textBoxFname.Text;
                string lname = textBoxLname.Text;
                string sex = comboBoxSex.SelectedItem.ToString();
                string dob = parseDOB(comboBoxYear.SelectedItem.ToString(), comboBoxMonth.SelectedItem.ToString(), comboBoxDay.SelectedItem.ToString());
                addStudent(fname, lname, sex, dob);
            }
            catch { MessageBox.Show("All fields must be filled", "Error"); }          
        }

        private void FormDatabase_Load(object sender, EventArgs e)
        {
            toolStripStatusLabelConnection.Text = "Connection Status: ONLINE";

            dataGrid.RowHeadersVisible = false;

            dataGrid.Columns.Add("fname", "First Name");
            dataGrid.Columns.Add("lname", "Last Name");
            dataGrid.Columns.Add("sex", "Sex");
            dataGrid.Columns.Add("age", "Age");
            dataGrid.Columns.Add("dob", "Date of Birth");
            dataGrid.Columns.Add("id", "ID Number");

            comboBoxSex.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBoxYear.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBoxMonth.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBoxDay.DropDownStyle = ComboBoxStyle.DropDownList;

            comboBoxSex.Items.Add("M"); comboBoxSex.Items.Add("F");
            for (int i = 1950; i < 2019; i++) { comboBoxYear.Items.Add(i); }
            for (int i = 1; i < 13; i++) { comboBoxMonth.Items.Add(i); }
            for (int i = 1; i < 32; i++) { comboBoxDay.Items.Add(i); }

            try { sql.Open(); populateDataGrid(); } catch { }

            Thread t = new Thread(checkConnection);
            t.IsBackground = true;
            t.Start();

            
        }
    }
}
