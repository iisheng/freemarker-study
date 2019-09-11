<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Article Detail.

    ${caseModel.title?default('title')}
    ${caseModel.description?default('description')}
</body>
</html>