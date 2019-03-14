//
//  Personagem.h
//  ExercicioClasse
//
//  Created by Yuri on 13/03/19.
//  Copyright © 2019 Yuri Breion. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface Personagem : NSObject {
    NSString *nome;
    int forca;
    bool ativo;
    float vida;
};

- (void) setNome:(NSString *)_nome;
- (NSString *) getNome;
- (void) setForca: (int)_forca;
- (int) getForca;
- (void) setAtivo: (bool)_ativo;
- (bool) getAtivo;
- (void) setVida: (float)_vida;
- (float) getVida;

@end

NS_ASSUME_NONNULL_END
