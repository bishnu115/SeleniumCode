package Locator;

public class xpath {

    public static void main(String[] args) {
//	<html>
//                <body>
//                <div id="main">
//                <h2>Login Page</h2>
//                <form id="loginForm">
//                <label>Username</label>
//                <input type="text" id="username" />
//
//                <label>Password</label>
//                <input type="password" id="password" />
//
//                <button type="submit">Submit</button>
//                </form>
//                </div>
//                </body>
//                </html

//
//        //Locate the Username Input (Directly)
//        input[ @id='username']
//
//
//        //  Go from Username Input →Parent(form)
//        input[ @id='username']/parent::form
//
//        // Go from Username Input →Its Label (Preceding - Sibling)
//        input[ @id='username']/preceding - sibling::label
//
//
//        // Go from Username Label →Its Input (Following - Sibling)
//        label[text() = 'Username'] / following - sibling::input
//        Returns<input type = "text" id = "username" / >
//
//                //Go from Password Input →Its Parent Form
//                input[ @id='password']/ancestor::form
//
//        //  Get the First Input After “Login Page”Heading
//        h2[text() = 'Login Page'] / following::input[1]
//
//
//        //Get All Inputs Inside the Form (Child Axis)
//        form[ @id='loginForm']/child::input
//
//
//        //Select the Submit Button via Traversal
//        form[ @id='loginForm']/descendant::button


    }

}
