/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    pedirDatosDeRegistro();
    listarCiudades();
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
function listarCiudades() {
    $.ajax({
        type: "POST",
        url: "CiudadesServlet",
        data: {"accion": "listaCiudades"},
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            $("#selectCiudades").html("");
            var options;
            $(data).each(function (a, objeto, c) {
                options = options + '<option value="' + objeto.idc + '">' + objeto.nombre + '</option>';
            });
            $("#selectCiudades").html(options);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
        }
    });
}