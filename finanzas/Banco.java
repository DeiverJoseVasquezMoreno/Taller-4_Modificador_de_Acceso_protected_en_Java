package finanzas;

// Uso incorrecto
// public class Banco {
//     protected double saldo;

//     public Banco(double saldoInicial) {
//         this.saldo = saldoInicial;
//     }
// }

// Solución propuesta
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}

