<!DOCTYPE html>
%{--<%@ taglib uri="http://www.anotheria.net/ano-tags" prefix="ano" %>--}%
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
           <script>
        var jsonItems = JSON.parse('${raw(items as String)}');
        jsonItems.forEach(function (item) {
            var count = 0;
            if (item["category"]["name"] == "BREAD") {
                var td1 = document.createElement('td');
                td1.className=item["name"];
                document.getElementById('bread').appendChild(td1);
                var divPrice = document.createElement('div');
                divPrice.className="price";
                document.querySelector("."+item["name"]).appendChild(divPrice);
                var spanPrice = document.createElement('span');
                spanPrice.innerHTML = item["price"];
                document.querySelector("."+item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                var divName = document.createElement('div');
                divName.className="item_name";
                document.querySelector("."+item["name"]).appendChild(divName);
                var pName = document.createElement('p');
                pName.innerHTML = item["name"];
                document.querySelector("."+item["name"]).querySelectorAll('div')[1].appendChild(pName);
                count+=1;
                console.log(count);
            }
        });
    </script>
        </tr>
        <tr name="MEAT" id="meat">
            <script>
                var jsonItems = JSON.parse('${raw(items as String)}');
                jsonItems.forEach(function (item) {
                    var count = 0;
                    if (item["category"]["name"] == "MEAT") {
                        var td1 = document.createElement('td');
                        td1.className=item["name"];
                        document.getElementById('bread').appendChild(td1);
                        var divPrice = document.createElement('div');
                        divPrice.className="price";
                        document.querySelector("."+item["name"]).appendChild(divPrice);
                        var spanPrice = document.createElement('span');
                        spanPrice.innerHTML = item["price"];
                        document.querySelector("."+item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                        var divName = document.createElement('div');
                        divName.className="item_name";
                        document.querySelector("."+item["name"]).appendChild(divName);
                        var pName = document.createElement('p');
                        pName.innerHTML = item["name"];
                        document.querySelector("."+item["name"]).querySelectorAll('div')[1].appendChild(pName);
                        count+=1;
                        console.log(count);
                    }
                });
            </script>
        </tr>
        <tr name="EXTRAS" id="extra">
            <script>
                var jsonItems = JSON.parse('${raw(items as String)}');
                jsonItems.forEach(function (item) {
                    var count = 0;
                    if (item["category"]["name"] == "EXTRA") {
                        var td1 = document.createElement('td');
                        td1.className=item["name"];
                        document.getElementById('bread').appendChild(td1);
                        var divPrice = document.createElement('div');
                        divPrice.className="price";
                        document.querySelector("."+item["name"]).appendChild(divPrice);
                        var spanPrice = document.createElement('span');
                        spanPrice.innerHTML = item["price"];
                        document.querySelector("."+item["name"]).querySelectorAll('div')[0].appendChild(spanPrice);
                        var divName = document.createElement('div');
                        divName.className="item_name";
                        document.querySelector("."+item["name"]).appendChild(divName);
                        var pName = document.createElement('p');
                        pName.innerHTML = item["name"];
                        document.querySelector("."+item["name"]).querySelectorAll('div')[1].appendChild(pName);
                        count+=1;
                        console.log(count);
                    }
                });
            </script>
        </tr>
        </tbody>
    </table>
</g:if>
%{--<table cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <ano:iterate name="BREAD" id="bread" type="de.zaunberg.burgershop.ui.ShopItemBean">
            <td class="<ano:write name="bread" property="item"/>">

                <div class="price">
                    <span><ano:write name="bread" property="nicePrice"/></span>
                </div>

                <div class="item_name">
                    <p class=""><ano:write name="bread" property="item"/></p>

                    <div></div>
                </div>

            </td>
        </ano:iterate>
    </tr>
    <tr>
        <ano:iterate name="MEAT" id="meat" type="ShopItemBean">
            <td class="<ano:write name="meat" property="item"/>">

                <div class="price">
                    <span><ano:write name="meat" property="nicePrice"/></span>
                </div>

                <div class="item_name">
                    <p class=""><ano:write name="meat" property="item"/></p>

                    <div></div>
                </div>

            </td>
        </ano:iterate>
    </tr>
    <tr>
        <ano:iterate name="EXTRAS" id="extra" type="de.zaunberg.burgershop.ui.ShopItemBean">
            <td class="<ano:write name="extra" property="item"/>">

                <div class="price">
                    <span><ano:write name="extra" property="nicePrice"/></span>
                </div>

                <div class="item_name">
                    <p class=""><ano:write name="extra" property="item"/></p>

                    <div></div>
                </div>

            </td>
        </ano:iterate>
    </tr>
    </tbody>
</table>--}%

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