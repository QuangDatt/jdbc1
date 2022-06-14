<%-- 
    Document   : create
    Created on : Feb 8, 2022, 4:14:07 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Edit Brands</h2>
<hr/>
<div class="row">
    <div class="col">
        <form action="update.do">
            <div class="mb-3 mt-3">
                <label for="id" class="form-label">Id: </label>
                <input type="text" class="form-control" value="${brand.id}" id="id1" placeholder="Enter id " name="id1" disabled>
                <input type="hidden" class="form-control" value="${brand.id}" id="id" placeholder="Enter id " name="id">
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Name: </label>
                <input type="text" class="form-control" value="${brand.name}" id="name" placeholder="Enter name " name="name">
            
            <button type="submit" class="btn btn sm btn-outline-success" name="op" value="update"><i class="bi bi-check-circle"></i> Update</button>
            <button type="submit" class="btn btn sm btn-outline-danger" name="op" value="cancel"><i class="bi bi-x-circle"></i> Cancel</button>

        </form>
        <div class="text-danger" style="font-style: italic;">${errorMessage}</div>
    </div>
    <div class="col">

    </div>
</div>
