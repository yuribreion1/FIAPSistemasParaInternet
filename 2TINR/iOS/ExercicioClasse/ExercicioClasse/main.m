//
//  main.m
//  ExercicioClasse
//
//  Created by Yuri on 13/03/19.
//  Copyright © 2019 Yuri Breion. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Personagem.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Personagem *p = [[Personagem alloc] init];
        [p setNome:@"João Henrique"];
        [p setForca:25];
        [p setVida:15.5];
        [p setAtivo:true];
        NSLog(@"Personagem: %@ com forca %d, ", [p getNome], [p getForca], [p getAtivo], [p getVida]);
    }
    return 0;
}
