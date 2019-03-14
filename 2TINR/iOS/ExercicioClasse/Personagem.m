//
//  Personagem.m
//  ExercicioClasse
//
//  Created by Yuri on 13/03/19.
//  Copyright © 2019 Yuri Breion. All rights reserved.
//

#import "Personagem.h"

@implementation Personagem

- (void) setNome:(NSString *)_nome {
    nome=_nome;
}
- (NSString *) getNome {
    return nome;
}
- (void) setForca: (int)_forca {
    forca=_forca;
}
- (int) getForca {
    return forca;
}
- (void) setAtivo: (bool)_ativo {
    ativo=_ativo;
}
- (bool) getAtivo {
    return ativo;
}
- (void) setVida: (float)_vida {
    vida=_vida;
}
- (float) getVida {
    return vida;
}

@end
