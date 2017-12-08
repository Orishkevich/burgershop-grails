<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Order Confirmation</title>
    <asset:stylesheet src="common.css"/>
    <script src="/assets/general.js"></script>
</head>

<body class="inner_bg">

<header class="main">
    <div class="logo_line"></div>
    <asset:image src="logo.png"/>
</header>

<div class="lightbox order-box" style="display: block;">
    <div class="oder_now">
        <p>You ordered</p>

        <p class="order-text">
            ${order.choice1}<br/>${order.choice2}<br/>${order.choice3}<br/>
            <br/>
            Total: ${order.prices} Eur.
            <br/><br/>
            Your meal will be ready for pickup in our shop
            <br/>
            in Timbuktu in 15 Minutes, you have to pick it up
            <br/>
            in 30 Minutes, or we give it to the dogs.
            <br/>
            Enjoy your meal.
        </p>
    </div>
</div>
</body>
</html>