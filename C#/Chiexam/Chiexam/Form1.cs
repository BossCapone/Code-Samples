using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Chiexam
{
    public partial class Form1 : Form
    {
        decimal beverage = 0;
        decimal appetizer =0;
        decimal main =0;
        decimal dessert =0;
        decimal salad = 0;

        public Form1()
        {
            InitializeComponent();
            clear();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            submit();
        }

        private void submit()
        {
            decimal subtotal = beverage + appetizer + main + dessert + salad;
            decimal total = subtotal * 1.07m;
            label8.Text = subtotal.ToString();
            label10.Text = total.ToString();
        }
        private void clear()
        {
            label8.Text = "";
            label10.Text = "";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            clear();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            decimal x = 0;
            switch (comboBox1.SelectedIndex)
            {
                case 1:
                    x = 1.95m;
                    break;
                case 2:
                    x = 1.50m;
                    break;
                case 3:
                    x = 1.25m;
                    break;
                case 4:
                    x = 2.95m;
                    break;
                case 5:
                    x = 2.50m;
                    break;
                case 6:
                    x = 1.50m;
                    break;

                default:
                    x = 0m;
                    break;
            }
            beverage = x;
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            decimal x = 0;
            switch (comboBox2.SelectedIndex)
            {
                case 1:
                    x = 5.95m;
                    break;
                case 2:
                    x = 6.95m;
                    break;
                case 3:
                    x = 8.95m;
                    break;
                case 4:
                    x = 8.95m;
                    break;
                case 5:
                    x = 10.95m;
                    break;
                case 6:
                    x = 12.95m;
                    break;
                case 7:
                    x = 6.95m;
                    break;

                default:
                    x = 0m;
                    break;
            }
            appetizer = x;
        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {
            decimal x = 0;
            switch (comboBox3.SelectedIndex)
            {
                case 1:
                    x = 15.95m;
                    break;
                case 2:
                    x = 13.95m;
                    break;
                case 3:
                    x = 13.95m;
                    break;
                case 4:
                    x = 11.95m;
                    break;
                case 5:
                    x = 11.95m;
                    break;
                case 6:
                    x = 19.95m;
                    break;
                case 7:
                    x = 20.95m;
                        break;
                case 8:
                    x = 18.95m;
                    break;

                default:
                    x = 0m;
                    break;
            }
            main = x;
        }

        private void comboBox4_SelectedIndexChanged(object sender, EventArgs e)
        {
            decimal x = 0;
            switch (comboBox4.SelectedIndex)
            {
                case 1:
                    x = 5.95m;
                    break;
                case 2:
                    x = 3.95m;
                    break;
                case 3:
                    x = 5.95m;
                    break;
                case 4:
                    x = 4.95m;
                    break;
                case 5:
                    x = 5.95m;
                    break;
                case 6:
                    x = 5.95m;
                    break;

                default:
                    x = 0m;
                    break;
            }
            dessert = x;
        }

        private void comboBox5_SelectedIndexChanged(object sender, EventArgs e)
        {
            decimal x = 0;
            switch (comboBox5.SelectedIndex)
            {
                case 1:
                    x = 5.95m;
                    break;
                case 2:
                    x = 3.95m;
                    break;
                case 3:
                    x = 5.95m;
                    break;
                case 4:
                    x = 4.95m;
                    break;
                case 5:
                    x = 5.95m;
                    break;
                case 6:
                    x = 5.95m;
                    break;

                default:
                    x = 0m;
                    break;
            }
            salad = x;
        }
    }
}
