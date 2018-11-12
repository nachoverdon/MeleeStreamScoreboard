var fileUrl = "output/versus2.xml";
var upSpeed = 5000;
var inSpeed = 1000;
var outSpeed = 500;

var p1, p2, s1, s2, mm, gg;

$(function() {
	checkUpdate();
	setInterval(function() { checkUpdate(); }, upSpeed);
});

function getResponse() {
	p1 = getElement(responseXml, "player1");
	p2 = getElement(responseXml, "player2");
	s1 = getElement(responseXml, "score1");
	s2 = getElement(responseXml, "score2");
	mm = getElement(responseXml, "matchB");
	gg = getElement(responseXml, "gameB");
}

function runUpdate() {
	if (timeOld == timeNew) return;

	if ($('#mm').get("innerHTML") != mm) {
		updating = true;
		$('.top').animate({$top: '-40px'}, outSpeed).then(function() {
			$('#mm').set("innerHTML", mm);
			$('.top').animate({$top: '0'}, inSpeed).then(function() { updating = false; });
		});
	}

	if ($('#p1').get("innerHTML") != p1 || $('#p2').get("innerHTML") != p2) {
		updating = true;
		$('.players').animate({$top: '-40px'}, outSpeed).then(function() {
			$('#p1').set("innerHTML", p1);
			$('#p2').set("innerHTML", p2);
			$('.players').animate({$top: '0'}, inSpeed).then(function() { updating = false; });
		});
	}

	if ($('#s1').get("innerHTML") != s1 || $('#s2').get("innerHTML") != s2) {
		updating = true;
		$('.scores').animate({$top: '-40px'}, outSpeed).then(function() {
			$('#s1').set("innerHTML", s1);
			$('#s2').set("innerHTML", s2);
			$('.scores').animate({$top: '0'}, inSpeed).then(function() { updating = false; });
		});
	}

	if ($('#gg').get("innerHTML") != gg) {
		updating = true;
		$('.btm').animate({$bottom: '-40px'}, outSpeed).then(function() {
			$('#gg').set("innerHTML", gg);
			$('.btm').animate({$bottom: '0'}, inSpeed).then(function() { updating = false; });
		});
	}
}