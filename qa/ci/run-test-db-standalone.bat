<<<<<<< HEAD
@echo off
if ci == %2 goto execute

:folder_up
cd ../../

 
:execute
mvn -Ddatabase=%1 clean install

if ci == %2 goto end


:finish
cd qa/ci

:end

=======
@echo off
if ci == %2 goto execute

:folder_up
cd ../../

 
:execute
mvn -Ddatabase=%1 clean install

if ci == %2 goto end


:finish
cd qa/ci

:end

>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
