<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="pageTitle" value="CCOS GiftCardRegistration" />


<style>
input[type=text], select {
  width: 50%;
left:50%;
float:right;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
.text-box{
float:right;
}
input[type=text-readonly], select {
  width: 50%;
  align:right;
  left:50%;
  background-color: #ccc;
  padding: 12px 20px;
  margin: 0px 0;
  display: inline-block;
  border: 0px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
.submit{
text-align: center;  
}

input[type=datetime-local], select {
  width: 50%;
  align:right;
  left:50%;
  background-color: #ccc;
  padding: 12px 20px;
  margin: 0px 0;
  display: inline-block;
  border: 0px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 30%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
  
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<h3>Create GiftCard</h3>

<div>
<form   method="POST" action="/createCoupon"  >
  <div>
    <label for="company">Company</label>

    <input type="text-readonly" id="company" class="text-box" name="company" value="Test" readonly>
    </div>
</br>
<div>
    <label for="desc">Description</label>
    <input type="text-readonly" id="desc" class="text-box" name="desc" value="GiftCard" readonly>
    </div>
</br>
<div>
    <label for="currency">Currency</label>
	<input type="text-readonly" id="currency" class="text-box" name="currency" value="EUR" readonly>
    </div>
</br>
<div>
    <label for="expiry">ExpiryDate</label>
	<input type="datetime-local" id="expiry" class="text-box" name="expiry" value="2999-12-	21T23:59" readonly>
	</div>
</br>
    
    
	<div>
    <h3>Please Enter the below values</h3>
    </div>
    <div id="editable">
	<div>
     <label for="giftCard">GiftCard Code</label>
	<input type="text" id="giftCard" name="giftCard" placeholder="Enter giftcard no" />
	</div>
</br>    
<div>
    <label for="amount">Amount</label>
	<input type="text" id="amount" name="amount" placeholder="Enter giftcard value" />
	</div>
    </br>
</div>    
    <div>
    <div class="submit">
    <input type="submit" value="Submit">
	</div>
  </form>
  </div>



</body>

</html>
