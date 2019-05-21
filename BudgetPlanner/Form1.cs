using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;

namespace BudgetPlanner
{
    public partial class Form1 : Form
    {
        Budget budget;


        public Form1()
        {
            InitializeComponent();

            budget = new Budget(); // budget.addExpense(new Expense("sample", 500.00, "monthly"));

            dataGridViewBudget.Columns.Add("desc", "Description");
            dataGridViewBudget.Columns.Add("amt", "Amount");
            dataGridViewBudget.Columns.Add("freq", "Frequency");

            comboBoxFreq.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBoxFreq.Items.Add("monthly"); comboBoxFreq.Items.Add("yearly");
            comboBoxDelete.DropDownStyle = ComboBoxStyle.DropDownList;

            populateGrid();
            populateDeleteBox();
            updateLabels();
        }

        public void populateGrid()
        {
            dataGridViewBudget.Rows.Clear();
            foreach (Expense ex in budget.getExpenses())
            {
                dataGridViewBudget.Rows.Add(ex.getDesc(), ex.getAmount(), ex.getFreq());
            }
        }

        public void populateDeleteBox()
        {
            comboBoxDelete.Items.Clear();
            foreach (Expense ex in budget.getExpenses())
            {
                comboBoxDelete.Items.Add(ex.getDesc());
            }
        }

        public void updateLabels()
        {
            labelIncome.Text = $"Monthly Income: ${budget.getIncome()}";
            labelSavings.Text = $"Savings Balance: ${budget.getSavings().getBalance()}";
            labelSavingsGoal.Text = $"Savings Goal: ${budget.getSavings().getGoal()}";
        }

        private void buttonCreate_Click(object sender, EventArgs e)
        {
            try { budget.addExpense(new Expense(textBoxDesc.Text, double.Parse(textBoxAmt.Text), (string)comboBoxFreq.SelectedItem)); } catch { }
            comboBoxFreq.SelectedIndex = -1;
            textBoxAmt.Clear(); textBoxDesc.Clear();
            populateGrid();
            populateDeleteBox();
        }

        private void buttonDelete_Click(object sender, EventArgs e)
        {
            foreach (Expense ex in budget.getExpenses())
            {
                if (ex.getDesc().Equals(comboBoxDelete.SelectedItem.ToString()))
                {
                    budget.removeExpense(ex); break;
                }
            }
            populateGrid();
            populateDeleteBox();
        }

        public void dumpToFile()
        {
            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                string path = saveFileDialog1.FileName;
                IFormatter f = new BinaryFormatter();
                Stream s = new FileStream(path, FileMode.Create, FileAccess.Write, FileShare.None);
                f.Serialize(s, budget);
                s.Close();
            }         
        }

        public void loadFromFile()
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                string path = openFileDialog1.FileName;
                IFormatter f = new BinaryFormatter();
                Stream s = new FileStream(path, FileMode.Open, FileAccess.Read);
                budget = (Budget)f.Deserialize(s);
                s.Close();

                populateDeleteBox();
                populateGrid();
                updateLabels();
            }       
        }

        private void buttonSave_Click(object sender, EventArgs e)
        {
            dumpToFile();
        }

        private void buttonLoad_Click(object sender, EventArgs e)
        {
            loadFromFile();
        }

        private void buttonIncome_Click(object sender, EventArgs e)
        {
            budget.setIncome(double.Parse(textBoxIncome.Text));
            updateLabels();
        }
    }

    [Serializable]
    public class Budget
    {
        private List<Expense> expenses { get; }
        private double income { get; set; }
        private Savings savings { get; set; }

        public Budget()
        {
            expenses = new List<Expense>();
            savings = new Savings(0.00, 0.00);
        }

        public void addExpense(Expense ex) { expenses.Add(ex); }
        public void removeExpense(Expense ex) { expenses.Remove(ex); }
        public void setIncome(double amt) { income = amt; }

        public List<Expense> getExpenses() { return expenses; }
        public Savings getSavings() { return savings; }
        public double getIncome() { return income; }
    }

    [Serializable]
    public class Expense
    {
        private string desc { get; set; }
        private double amount { get; set; }
        private string freq { get; set; }
        
        public Expense(string _desc, double _amount, string _freq)
        {
            desc = _desc;
            amount = _amount;
            freq = _freq;
        }

        public void setDesc(string _desc) { desc = _desc; }
        public void setAmount(double _amount) { amount = _amount; }
        public void setFreq(string _freq) { freq = _freq; }

        public string getDesc() { return desc; }
        public double getAmount() { return amount; }
        public string getFreq() { return freq; }

        public override string ToString()
        {
            return $"{desc}: ${amount} {freq}";
        }
    }

    [Serializable]
    public class Savings
    {
        private double balance { get; set; }
        private double goal { get; set; }

        public Savings(double _balance, double _goal)
        {
            balance = _balance;
            goal = _goal;
        }

        public void add(double amt) { balance += amt; }
        public void subtract(double amt) { balance -= amt; }

        public void setBalance(double amt) { balance = amt; }
        public void setGoal(double amt) { goal = amt; }

        public double getBalance() { return balance; }
        public double getGoal() { return goal; }

        public override string ToString()
        {
            return $"Balance: {balance} Goal: {goal}";
        }
    }
}
