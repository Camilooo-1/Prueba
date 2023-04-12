function eliminar(id){
	swal({
  title: "Seguro que quieres Eliminarlo?",
  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar/"+id,
		success: function(res){
			console.log(res);
		}
	});
    swal("¡Tu archivo ha sido eliminado!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/listar"
		}
})
  } else {
    swal("¡Tu archivo está seguro!");
  }
});
}