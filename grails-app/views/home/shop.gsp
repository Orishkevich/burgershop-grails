<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Burger Shop</title>
    <asset:stylesheet src="common.css"/>
    <script src="/assets/general.js"></script>
    <script src="/assets/newScript.js"></script>
</head>

<body class="inner_bg">

<header class="main">
    <div class="logo_line"></div>
    <asset:image src="logo.png"/>
    <h1 class="line_name">
        <div>
            <span id="step_index">1</span>
            <span id="step_name"></span>
        </div>
    </h1>
</header>
<g:if test="${items}">
    <table cellpadding="0" cellspacing="0">
        <tbody>
        <tr name="BREAD" id="bread">
        </tr>
        <tr name="MEAT" id="meat">
        </tr>
        <tr name="EXTRAS" id="extras">
        </tr>
        <script>
            var jsonItems = JSON.parse('${raw(items as String)}');
            jsonItems.forEach(function (item) {
                if (item["category"]["name"] == "BREAD") {
                    var td1 = document.createElement('td');
                    td1.className = item["name"];
                    document.querySelector('#bread').appendChild(td1);
                    var divPrice = document.createElement('div');
                    divPrice.className = "price";
                    document.querySelector("." + item["name"]).appendChild(divPrice);
                    var spanPrice = document.createElement('span');
                    spanPrice.innerHTML = item["price"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                    var divName = document.createElement('div');
                    divName.className = "item_name";
                    document.querySelector("." + item["name"]).appendChild(divName);
                    var pName = document.createElement('p');
                    pName.innerHTML = item["name"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(pName);
                    var divEl = document.createElement('div');
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(divEl);
                }
                if (item["category"]["name"] == "MEAT") {
                    var td1 = document.createElement('td');
                    td1.className = item["name"];
                    document.querySelector('#meat').appendChild(td1);
                    var divPrice = document.createElement('div');
                    divPrice.className = "price";
                    document.querySelector("." + item["name"]).appendChild(divPrice);
                    var spanPrice = document.createElement('span');
                    spanPrice.innerHTML = item["price"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                    var divName = document.createElement('div');
                    divName.className = "item_name";
                    document.querySelector("." + item["name"]).appendChild(divName);
                    var pName = document.createElement('p');
                    pName.innerHTML = item["name"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(pName);
                    var divEl = document.createElement('div');
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(divEl);

                }
                if (item["category"]["name"] == "EXTRAS") {
                    var td1 = document.createElement('td');
                    td1.className = item["name"];
                    document.querySelector('#extras').appendChild(td1);
                    var divPrice = document.createElement('div');
                    divPrice.className = "price";
                    document.querySelector("." + item["name"]).appendChild(divPrice);
                    var spanPrice = document.createElement('span');
                    spanPrice.innerHTML = item["price"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                    var divName = document.createElement('div');
                    divName.className = "item_name";
                    document.querySelector("." + item["name"]).appendChild(divName);
                    var pName = document.createElement('p');
                    pName.innerHTML = item["name"];
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(pName);
                    var divEl = document.createElement('div');
                    document.querySelector("." + item["name"]).querySelectorAll('div')[1].appendChild(divEl);

                }
            });
        </script>

        </tbody>
    </table>
</g:if>
<div class="total_cost">
    <div></div>

    <p>Total cost: <span>0</span></p>
</div>

<div class="lightbox">
    <div class="black_bg"><!-- --></div>

    <div class="box_l">
        <div class="oder_now">
            <a class="close_box">x</a>

            <p class="order_click"></p>
        </div>
    </div>
</div>
</body>
</html>