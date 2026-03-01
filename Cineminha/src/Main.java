//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ingresso geral = new ingresso();
    ingressoMeia meia = new ingressoMeia();
    ingressoFamilia familia = new ingressoFamilia();

   Scanner scanner = new Scanner (System.in);
    System.out.println("Escolha um filme: 1. Comedia ou 2.Romance");
    geral.setFilme(scanner.nextInt());

    if (geral.filme == 1){
        System.out.println("Você escolheu Comédia");
    }
    else if (geral.filme == 2){
        System.out.println("Você escolheu Romance:");
    }
    else{
        System.out.println("Escolha 1. Comédia ou 2. Romance");

    }

    System.out.println("O filme será 1.dublado ou 2.legendado?");
    geral.setSubtitles(scanner.nextInt());

    if (geral.subtitles == 1){
        System.out.println("Você escolheu dublado:");
    }
    else if(geral.subtitles == 2){
        System.out.println("Você escolheu legendado:");
    }
    else {
        System.out.println("Escolha 1.dubladou ou 2.legendado");
    }


    System.out.println("Quantos ingressos?");
    meia.setDesconto(scanner.nextInt());
    if (meia.desconto <= 3){
        System.out.println("Você paga meia entrada! seu total é de: R$"+ (meia.desconto * 10) / 2);
    }
    else {
        System.out.println("Familia ganha 5% de desconto! seu total é de: R$"+(meia.desconto * 10 - 0.05));
    }









}


