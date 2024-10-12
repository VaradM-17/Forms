<h1>Sign In and Sign Up Forms</h1>

<h2>Overview</h2>
<p>
    This project consists of simple web forms for user registration and sign-in. Users can create an account and log in using their credentials. The submitted information is stored in a MySQL database.
</p>

<h3>Features</h3>
<ul>
    <li>User-friendly interface for sign-up and sign-in.</li>
    <li>Secure password handling with database storage.</li>
    <li>Data stored in a MySQL database using Java Servlets.</li>
</ul>

<h3>Technologies Used</h3>
<ul>
    <li>HTML, CSS for frontend</li>
    <li>Java Servlets for backend</li>
    <li>MySQL for the database</li>
</ul>

<h3>Getting Started</h3>
<h4>Prerequisites</h4>
<ul>
    <li>JDK 8 or later</li>
    <li>Apache Tomcat</li>
    <li>MySQL Database</li>
</ul>

<h3>Installation Steps</h3>
<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/yourusername/signin-signup.git</code></pre>
    </li>
    <li><strong>Set up MySQL:</strong>
        <p>Create a database named <code>register</code> and a table <code>signupdetails</code> with columns for <code>email</code> and <code>password</code>.</p>
    </li>
    <li><strong>Update Database Connection:</strong>
        <p>Modify the database connection settings in <code>SignIn_Page.java</code> and <code>SignUp_Page.java</code> to match your MySQL credentials.</p>
    </li>
    <li><strong>Deploy the application:</strong>
        <p>Deploy the project to your servlet container (e.g., Apache Tomcat).</p>
    </li>
    <li><strong>Open the Forms:</strong>
        <p>Visit <code>http://localhost:8080/signin.html</code> to access the Sign In form and <code>http://localhost:8080/signup.html</code> for the Sign Up form.</p>
    </li>
</ol>

<h3>Usage</h3>
<p>Fill out the forms as instructed. Upon successful registration, users will be redirected to the sign-in page.</p>

<h3>Contributing</h3>
<p>Feel free to contribute by submitting issues or pull requests.</p>
