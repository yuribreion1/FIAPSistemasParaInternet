//
//  ViewController.h
//  aula2-190212
//
//  Created by Yuri on 13/02/19.
//  Copyright © 2019 Yuri. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController{
    
    //Referencia aos labels inseridos no storyboard
    
    __weak IBOutlet UILabel *nome;
    __weak IBOutlet UILabel *idade;
    
    
}
- (IBAction)exibir:(id)sender;

@end

