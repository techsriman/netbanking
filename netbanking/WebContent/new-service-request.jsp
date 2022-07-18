<!DOCTYPE html>
<html>
    <head>
        <title>New Service Request</title>
    </head>
    <body style="font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size: 20px;">
        <h2>Service Request</h2>
        <form action="newServiceRequest" method="post">
            Account No: <input type="text" name="accountNo"/> <br/>
            Request Type: 
            <select name="requestType">
                <option value="Checkbook">Checkbook</option>
                <option value="DebitCard">Debit Card</option>
                <option value="statement">Account Statement</option>
            </select>
            <br/>
            Account Holder Name: <input type="text" name="acountHolderName"/><br/>
            Mobile No: <input type="text" name="mobileNo"/><br/>
            Email Address: <input type="email" name="emailAddress"/><br/>
            <input type="submit" value="place request"/>
        </form>
    </body>
</html>