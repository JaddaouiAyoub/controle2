<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Assign Employee to Project</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Assign Employee to Project</h1>
    <form action="${pageContext.request.contextPath}/assign" method="post">
        <div class="form-group">
            <label for="employee">Employee Name</label>
            <select id="employee" class="form-control" name="employeeId" required>
                <c:forEach items="${employees}" var="employee">
                    <option value="${employee.id}">${employee.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="project">Project Name</label>
            <select id="project" class="form-control" name="projectId" required>
                <c:forEach items="${projects}" var="project">
                    <option value="${project.id}">${project.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="implication">Implication</label>
            <select id="implication" class="form-control" name="implication" required>
                <c:forEach begin="10" end="100" step="10">
                    <option value="${status.index}%">${status.index}%</option>
                </c:forEach>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Assign</button>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
