function elimina(id){
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
		url:"/elimina/"+id,
		success: function(res){
			console.log(res);
		}
	});
    swal("¡Tu archivo ha sido eliminado!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/lista"
		}
})
  } else {
    swal("¡Tu archivo está seguro!");
  }
});
}