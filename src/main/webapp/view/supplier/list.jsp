<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>供应商展示页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="${path }/test/query.do">
					<div class="col-md-6">
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"></span>
							<input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon1">
						</div>
					</div>
					<div class="col-md-6">3</div>
			     </form>
			</div>
		</div>
	</body>
</html>