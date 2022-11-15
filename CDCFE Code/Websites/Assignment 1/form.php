<?php
$name = $_POST['name'];
$email = $_POST['email'];
$enquiry = $_POST['enquiry'];
$message = $_POST['message'];

$email_from = 'contact@realeamil.com';
$email_subject = 'New Form Submission';
$email_body = "User Name: $name.\n". 
                "User Email: $email.\n". 
                    "Enquiry: $enquiry.\n". 
                        "Message: $message.\n";
$to = '21joshuadeere@cdcfe.ie';
$headers = "From: $email_from \r\n";
$headers .= "Reply-To: $email |r\n";

mail($to,$email_subject,$email_body,$headers);

header("Location: contact.html")
?>