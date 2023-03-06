<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <title>MyBank - Register</title>
    <link rel="stylesheet" href="global.css">
    <script>
        function showPopUp() {
            alert("Thank you for submitting the form!");
        }
    </script>
</head>
<body>
<div class="content-form">
    <h1>MyBank Registration</h1>
    <form action="ActionMyBankRegister" method="POST">
        <p>
            <label for="dni_nie">DNI/NIE:</label>
            <input type="text" name="dni_nie" id="dni_nie" required>
        </p>
        <p>
            <label for="full_name">Full Name:</label>
            <input type="text" name="full_name" id="full_name" required>
        </p>
        <p>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>
        </p>
        <p>
            <label for="country">Country:</label>
            <select name="country" id="country" required>
                <option value=""> -- SELECT -- </option>
                <option value="SPAIN">SPAIN</option>
                <option value="FRANCE">FRANCE</option>
                <option value="ITALY">ITALY</option>
                <option value="GERMANY">GERMANY</option>
            </select>
        </p>
        <p>
            <label for="mount">Initial Amount:</label>
            <input type="number" name="mount" id="mount" min="0" step="0.01" required>
        </p>
        <p>
            <button type="submit" onclick="location.href='account-login.html'">Submit</button>
        </p>
    </form>
</div>
</body>
</html>