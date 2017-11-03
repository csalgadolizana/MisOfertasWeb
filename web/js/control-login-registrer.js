/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $('.carousel').carousel({
        interval: 5000
    });
    $("#formRegistrarse").on("hidden.bs.modal", function () {
        $("#contenedor_masDatos").collapse('hide');
    });
    $("#btnRegistrarForm").click(function () {
        console.log(" " + $("#txtContrasenaRegistro").val());
        if ($("#txtContrasenaRegistro").val() != $("#txtContrasenaRegistro2").val()) {
            $("#centralModalError").modal('show');
            $("#divTextoAlerta").find("p").html("Debe ingresar dos veces la misma contraseña.");
            console.log("primer if");
        } else {
            if ($("#txtContrasenaRegistro2").val() == null || $("#txtContrasenaRegistro").val() == null || $("#txtCorreoRegistro").val() == null) {
                $("#divTextoAlerta").find("p").html("Recuerde ingresar todos los datos");
                $("#centralModalError").modal('show');
                console.log("segundo if");
            } else {
                $("#btnRealRegistrarForm").click();
                console.log("else");
            }
        }
    });
    $("#btnIniciarSesionFake").click(function () {
        $.ajax({
            type: "POST",
            url: "ClienteServlet",
            data: {
                "btnAccion": "comprobarCorreo",
                "pass": $("#txtPasswdIniciar").val().trim(),
                "mail": $("#txtCorreoIniciar").val().trim()}
            ,
            dataType: "json",
            success: function (data, textStatus, jqXHR) {
                if (data.correo != "") {
                    $.ajax({
                        type: "POST",
                        url: "ClienteServlet",
                        data: {
                            "btnAccion": "iniciarSesion",
                            "mail": $("#txtCorreoIniciar").val().trim(),
                            "pass": $("#txtPasswdIniciar").val().trim()
                        },
                        dataType: "json",
                        success: function (dataa, textStatus, jqXHR) {

                            console.log("Entro al segundo success!!!!");
                            console.log(dataa);
                            if (dataa.redirect != null) {
//                                alert("http://localhost:17225/MisOfertasWeb" + dataa.redirect);
                                location.href = dataa.redirect;
                            } else {
                                if (dataa.estado != 0) {
                                    location.href = "accesoCliente.html?d=" + dataa.estado;
                                } else {
                                    $("#centralModalError").modal('show');
                                    $("#divTextoAlerta").find("p").html("<strong>Su Correo o Contraseña no estan correctas!!.</strong> <br>");
                                }
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            console.log("error");
                            console.log(jqXHR);
                            console.log(textStatus);
                            console.log(errorThrown);
                        }
                    });
                } else {
                    $("#centralModalError").modal('show');
                    $("#divTextoAlerta").find("p").html("<strong>Su Correo o Contraseña no estan correctas!!.</strong> <br>");
                }
//                console.log("success:");
//                console.log(data);
//                console.log(textStatus);
//                console.log(jqXHR);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log("error");
                console.log(jqXHR);
                console.log(textStatus);
                console.log(errorThrown);
            }
        });
        $("#txtNombre").focus();
    });
    $('#centralModalError').on('hidden.bs.modal', function (e) {
        $("#txtContrasenaRegistro").focus();
    });
});

