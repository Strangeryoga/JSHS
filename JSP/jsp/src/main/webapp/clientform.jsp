<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<body>

<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="" class="navbar-brand"> Client App </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Clients</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${client != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${client == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${client != null}">
            			Edit Client
            		</c:if>
						<c:if test="${client == null}">
            			Add New Client
            		</c:if>
					</h2>
				</caption>

				<c:if test="${client != null}">
					<input type="hidden" name="id" value="<c:out value='${client.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Client Name</label> 
					<input type="text" value="'${client.name}'"
					 class="form-control" name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Client Mobile</label> 
					<input type="text" value="'${client.mobile}'" 
					 class="form-control" name="mobile" required="required">
				</fieldset>

				

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
	

</body>
</html>