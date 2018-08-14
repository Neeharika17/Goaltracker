<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>


<div id="centercontent">
	<center></center>
</div>

<%@ include file="footer.jsp"%>





<script>
	$(document).ready(function() {
		$(".btn").click(function() {

			$.ajax({
				type : "GET",
				url : "gettasks",
				dataType : 'json',
				success : function(response) {
					$('center').html("");
					console.log(response);
					var obj = JSON.parse(response);
					$('center').html(obj);
				},
				error : function(xhr, e) {
					console.log(JSON.parse(xhr.responseText));
				}
			});
		});
	});
</script>





