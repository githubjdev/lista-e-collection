package ex01_list_removeif;

class Pedido {
	private final String id;
	private final String status;

	public Pedido(String id, String status) {
		this.id = id;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Pedido{id='" + id + "', status='" + status + "'}";
	}
}
