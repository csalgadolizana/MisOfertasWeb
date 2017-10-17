/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function (){
    console.log("chinga");
    btnIniciarSesion();
});

function btnIniciarSesion(){
    $("#btnIniciar").click(function (){
       console.log("Hizo click");
       $("#btnIniciarReal").trigger('click');
    });
}


