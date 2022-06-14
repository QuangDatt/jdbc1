<%-- 
    Document   : create
    Created on : Feb 12, 2022, 5:42:14 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Create Brands</h2>
<hr/>
<div class="row">
    <div class="col">
        <form action="save.do">
            <div class="mb-3 mt-3">
                <label for="id" class="form-label">Id: </label>
                <input type="text" class="form-control" id="id" placeholder="Enter id " name="id">
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Name: </label>
                <input type="text" class="form-control" id="name" placeholder="Enter name " name="name">
            </div>
            
            <button type="submit" class="btn btn sm btn-outline-success" name="op" value="save"><i class="bi bi-download"></i> Save</button>
            <button type="submit" class="btn btn sm btn-outline-danger" name="op" value="cancel"><i class="bi bi-x-circle"></i> Cancel</button>

        </form>
        <div class="text-danger" style="font-style: italic;">${errorMessage}</div>
    </div>
    <div class="col">

    </div>
</div>