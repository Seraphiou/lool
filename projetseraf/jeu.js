var wFenetre=800;//largeur de fenetre
var hFenetre=600;//hauteur de fenetre
var phrasePourJeu="Pierre mange une pomme";//phrase à annoter
var tabMot=phrasePourJeu.split(" ");//les mots sont mis en tableau
var fenetreDeJeu=Crafty.init(wFenetre,hFenetre);//initialisation du jeu
Crafty.e("phrase, Canvas, 2D, DOM, Text").text(phrasePourJeu)
.attr({x: 20, y: (hFenetre-30), w: 300})
.textFont({size: '30px'});

/*

musique

fenetreDeJeu.audio.add("mus",["berceuse.wav"]);
fenetreDeJeu.audio.play("mus",10);



 */


Crafty.background('rgb(200,200,255)');//fond de jeu
var paddle=Crafty.e("Paddle, 2D, DOM, Color, Multiway, Collision, Text");//creation du mot
paddle.text("pomme");//
paddle.onHit('blo', function () {
    this.x = 0;
});

paddle.attr({
    x: 20, 
    y: 100, 
    w: 100, 
    h: 10
});
paddle.multiway(10, {
    UP_ARROW: -90, 
    DOWN_ARROW: 90, 
    LEFT_ARROW: 180, 
    RIGHT_ARROW: 0
});

paddle.color("blue");
var hSol=hFenetre-paddle.h-30;
paddle.bind('EnterFrame', function () {
    if (this.x >wFenetre-paddle.w-1 ) {
			
        this.x =(wFenetre-paddle.w) ;
    }
    if (this.x < 1) {
					
        this.x = 0;
    }
    if (this.y < 1) {
					
        this.y = 0;
    }
    if (this.y >hSol-1 ) {
					
        this.y = (hSol);
    }
});



var i=0;
var nombreMot=tabMot.length;
for(i=0;i<tabMot.length;i++){
    Crafty.e("Sol, 2D, DOM, Color, Multiway, Collision, Text")
    .text(tabMot[i])
    .attr({x:((wFenetre/(4*nombreMot))+(i*(wFenetre/nombreMot))), y: (hSol-30) , w:((wFenetre/nombreMot)-1) })
    .color("blue");
}