
public class Pessoa {
	private String nome;
	private String fone;
	private String PIS;
	private String CPF;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String fone, String PIS, String CPF) {
		this.nome = nome;
		this.fone = fone;
		this.PIS = PIS;
		this.CPF = CPF;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getPis() {
		return PIS;
	}

	public void setPis(String PIS) {
		this.PIS = PIS;
	}

	public String getCpf() {
		return CPF;
	}

	public void setCpf(String CPF) {
		this.CPF = CPF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((PIS == null) ? 0 : PIS.hashCode());
		result = prime * result + ((fone == null) ? 0 : fone.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (PIS == null) {
			if (other.PIS != null)
				return false;
		} else if (!PIS.equals(other.PIS))
			return false;
		if (fone == null) {
			if (other.fone != null)
				return false;
		} else if (!fone.equals(other.fone))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", fone=" + fone + ", PIS=" + PIS + ", CPF=" + CPF + "]";
	}
	
	
	
	
	
}
