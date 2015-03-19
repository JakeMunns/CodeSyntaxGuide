package teamprojectgroup3.codesyntaxguide;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.widget.ExpandableListView;


public class OPERATORS extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elseif);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("C#");
        listDataHeader.add("C++");
        listDataHeader.add("Python");
        listDataHeader.add("Java");

        // Adding child data
        List<String> csharp = new ArrayList<String>();
        csharp.add("= - Using a single equals assigns a value\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "+ - Addition\n" +
                "- - Subtraction\n" +
                "& - Logical AND\n" +
                "^ - Logical XOR\n" +
                "| - Logical OR\n" +
                "&& - Conditional AND\n" +
                "|| - Conditional OR\n" +
                "! - Conditional NOT\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                ">= - Less than or equal to\n" +
                "&& - Conditional AND\n" +
                "|| - Conditional OR\n" +
                "! - Conditional NOT\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "| - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "<<= - Left shift AND\n" +
                ">>= - Right shift AND\n" +
                "&= - Bitwise AND\n" +
                "^= = Bitwise exclusive OR\n" +
                "|= = Bitwise inclusive OR");

        List<String> python = new ArrayList<String>();
        python.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "** - Exponent - Performs exponential (power) calculation on operators\n" +
                "// - Floor Division - The division of operands where the result is the quotient in which the digits after the decimal point are removed\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "<> - Checks if the value of two operands are equal or not, if values are not equal then condition becomes true\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "%= - Takes the modulus using two operands and assign the result to left operand\n" +
                "**= - Performs exponential (power) calculation on operators and assign value to the left operand\n" +
                "//= - Performs floor division on operators and assign value to the left operand\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "| - Binary OR Operator copies a bit if it exists in either operand\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                "and - Logical AND\n" +
                "or - Logical OR\n" +
                "not - Logical NOT\n" +
                "in - Evaluates to true if it finds a variable in the specified sequence and false otherwise\n" +
                "not in - Evaluates to true if it does not finds a variable in the specified sequence and false otherwise\n" +
                "is - Evaluates to true if the variables on either side of the operator point to the same object and false otherwise\n" +
                "in not - Evaluates to false if the variables on either side of the operator point to the same object and true otherwise");

        List<String> java = new ArrayList<String>();
        java.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "| - Binary OR Operator copies a bit if it exists in either operand\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                ">>> - Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros\n" +
                "&& - Logical AND operator. If both the operands are non-zero, then the condition becomes true\n" +
                "|| - Logical OR operator. If any of the two operands are non-zero, then the condition becomes true\n" +
                "! - Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will be false\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "%= - Takes the modulus using two operands and assign the result to left operand\n" +
                "<<= - Left shift AND\n" +
                ">>= - Right shift AND\n" +
                "&= - Bitwise AND\n" +
                "^= = Bitwise exclusive OR\n" +
                "|= = Bitwise inclusive OR\\n");

        listDataChild.put(listDataHeader.get(0), csharp); // Header, Child data
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_operators, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
