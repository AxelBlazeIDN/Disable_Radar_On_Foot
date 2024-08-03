{$CLEO .csa}

script_name "AB"

int AxelBlaze

:Axel
    wait 0
    if
    00DF:   actor AxelBlaze driving 
    jf @Blaze
    0581: enable_radar 1
    0826: enable_hud 0
jump @Blaze

:Blaze
    wait 0
    if
    80DF:   not actor AxelBlaze driving 
    jf @Axel
    0581: enable_radar 0
    0826: enable_hud 1
jump @Axel
