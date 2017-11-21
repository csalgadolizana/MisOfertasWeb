/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

    $("#selectRegion").change(function () {
        $("#selectComuna").children().each(function (i, div) {
            if ($(this).attr("idreg") != $("#selectRegion").val()) {
                $(this).hide();
            } else {
                $(this).show();
            }
            if (i == 0) {
                console.log($(this).html());
                //$("#selectComuna").val(null);
                $(this).show();
            }
        });
    });
    $("#selectComuna").change(function () {
        if ($(this).val() != -1) {
            $("#selectRegion").val($(this).find("option:selected").attr("idreg"));
        } else {
            $("#selectRegion").val(-1);
        }
        $("#selectRegion").change();
    });

    pedirDatosDeRegistro();
    comprobarSiCorreoExiste();

    $('#centralModalError').on('hidden.bs.modal', function (e) {
        $("#txtCorreo").focus();
    });
    //max-width : 776px
//                var width = $(window).width();
    var max_width = 776;
    if ($(window).width() < max_width) {
//                    width = $(this).width();
        $("#btnCancelar").addClass("btn-sm");
        $("#btnRegistrarse").addClass("btn-sm");
    } else {
        $("#btnCancelar").removeClass("btn-sm");
        $("#btnRegistrarse").removeClass("btn-sm");
    }
    $(window).on('resize', function () {
//                    console.log("Largo ->" + $(this).width() + " Comparado con -> " + max_width);
        if ($(this).width() < max_width) {
            width = $(this).width();
            $("#btnCancelar").addClass("btn-sm");
            $("#btnRegistrarse").addClass("btn-sm");
        } else {
            $("#btnCancelar").removeClass("btn-sm");
            $("#btnRegistrarse").removeClass("btn-sm");
        }
    });

    $("#check").change(function () {
        $("#contenedor_contras").collapse('toggle');
//                     collapse
        if ($(this).prop('checked')) {
//                        $("#contenedor_contras").show();
        } else {
//                        $("#contenedor_contras").hide();
        }
//                    console.log("Cambio!! "+$(this).prop('checked'));
    });
});
function comprobarSiCorreoExiste() {
    $("#btnRegistroFalso").click(function (evt) {
        $.ajax({
            type: "POST",
            url: "ClienteServlet",
            data: {"btnAccion": "comprobarCorreo", "mail": $("#txtCorreo").val().trim()},
            dataType: "json",
            success: function (data, textStatus, jqXHR) {
                if (data.correo != "") {
                    $("#centralModalError").modal('show');
                    $("#divTextoAlerta").find("p").html("<strong>El Correo ya existe!!.</strong> <br>" +
                            "ingrese con uno nuevo o inicie sesion");
                    $("#txtCorreo").parent().find("label").addClass("active");
                } else {
                    if ($("#txtPasswd").val().trim() != $("#txtPasswd2").val().trim()) {
                        $("#centralModalError").modal('show');
                        $("#divTextoAlerta").find("p").html("<strong>Debe ingresar 2 veces la misma contraseña.</strong> <br>" +
                                "ingrese con uno nuevo o inicie sesion");
                        $("#txtPasswd").parent().find("label").addClass("active");
                        $("#txtPasswd2").parent().find("label").addClass("active");
                        $("#txtPasswd").focus();
                    } else {
                        $("#btnRegistrarse").click();
                    }
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log("error");
                console.log(jqXHR);
            }
        });
    });
}
function pedirDatosDeRegistro() {
    $.ajax({
        type: "POST",
        url: "ClienteServlet",
        data: {"btnAccion": "quieroDatos"},
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            console.log("Secces");
            console.log(data);
            console.log(textStatus);
            console.log(jqXHR);
            if (data != null) {
                $("#txtCorreo").val(data.correo);
                $("#txtPasswd").val(data.password1);
                $("#txtPasswd2").val(data.password2);
                $("#navbarNombreSesion").text(data.correo);
            }
            listarRegiones();
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
    $("#txtNombre").focus();
}
function listarRegiones() {
    $.ajax({
        type: "POST",
        url: "RegionServlet",
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            $("#selectRegion").html("");
            var options = '<option value="" >Regiones</option>';
            $(data).each(function (a, objeto, c) {
                options = options + '<option value="' + objeto.idreg + '">' + objeto.nombre + '</option>';
            });
            $("#selectRegion").html(options);
            $("#selectComuna").prop("required", true);
            listarComunas();
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
        }
    });
}
function listarComunas() {
    $.ajax({
        type: "POST",
        url: "ComunaServlet",
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            $("#selectComuna").html("");
            var options = '<option value="" >Comunas</option>';
            $(data).each(function (a, objeto, c) {
                options = options + '<option idreg="' + objeto.idreg + '" value="' + objeto.idcom + '">' + objeto.nombre + '</option>';
            });
            $("#selectComuna").html(options);
            $("#selectComuna").prop("required", true);
            return true;
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
            return false;
        }
    });
}