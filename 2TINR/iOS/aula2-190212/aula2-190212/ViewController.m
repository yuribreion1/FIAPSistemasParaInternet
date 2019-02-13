//
//  ViewController.m
//  aula2-190212
//
//  Created by Yuri on 13/02/19.
//  Copyright © 2019 Yuri. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    nome.text = @"Nome";
    idade.text = @"Idade";
}


- (IBAction)exibir:(id)sender {
    nome.text = @"Yuri";
    idade.text = @"32 anos";
}
@end
