<html>

<head>
    <meta charset="ISO-8859-I">
    <title>From jsp</title>
        <script>
            // This function runs as soon as the page loads
            window.onload = function() {
                // Trigger GET request
                fetch('/doneAfter')
                    .then(response => response.text())
                    .then(data => console.log('API called successfully'))
                    .catch(err => console.error(err));
            };
        </script>
</head>

<body>
    Welcome ${name} your password is ${password}
</body>

</html>