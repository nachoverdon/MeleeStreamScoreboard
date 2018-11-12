var fileUrl = "output/event.xml";
var inSpeed = 1000;

var e1, e2;

$(function() {
	checkUpdate();
});

function getResponse() {
	e1 = getElement(responseXml, "text1");
	e2 = getElement(responseXml, "text2");
}

function runUpdate() {
	$('#e1').set("innerHTML", e1);
	$('#e2').set("innerHTML", e2);
	$('.btm').animate({$bottom: '0'}, inSpeed);
}