var choices = [];
console.log("script run");
$(document).ready(function(){
    $("tr:first").show();
    var prices = [];
    var step_names = ['bread', 'meat', 'options'];
    var step = 1;
    $('#step_index').text(step);
    $('#step_name').text("Select your " + step_names[0]);

    $("table tr td").click(function(){
        var selection_name = $(this).find('p').text();
        $(this).siblings('.active_item').removeClass('active_item')
        $(this).addClass("active_item");
        $(this).siblings().find('.dark').remove();
        $(this).siblings().append("<div class='dark'></div>");
        var tr_index = $(this).closest('tr').index();
        choices[tr_index] = selection_name;
        prices[tr_index] = parseFloat($(this).find(".price span").text());
        var total_price = 0;
        $.each(prices, function(index, price){
            total_price += price/100;
        });
        $(".total_cost p span").text(total_price.toFixed(2) + ' EUR');
        var $nextLine = $(this).closest('tr').next();
        if($nextLine.length > 0 && $nextLine[0].tagName.toLowerCase()!= "script"){
            $nextLine.show();
            if(!$(this).closest('tr').hasClass('step_done')){
                $('#step_index').text(++step);
                $('#step_name').text("Select your " + step_names[tr_index+1]);
                $(this).closest('tr').addClass('step_done');
            }
        }
        else{
            $(".lightbox").show();
            $(".oder_now p").text('Order now ' + total_price.toFixed(2) + ' EUR');
            $(this).closest('table').addClass('selection_complete');

        }
    });


    //close lightbox
    $('.black_bg, .close_box').click(function() {
        $('.lightbox').hide();
        return false;
    });

    //close lightbox
    $('.black_bg, .order_click').click(function() {
        $('.lightbox').hide();
        document.location.href = 'order.html?choice1='+choices[0]+'&choice2='+choices[1]+'&choice3='+choices[2];
    });


});