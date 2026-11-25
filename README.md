# Calculadora Java

## Descripción del Proyecto
Aplicación desarrollada en **Java** (`calculadora.java`) y **HTML/JS** (`index.html`) que realiza exclusivamente operaciones de suma, resta, multiplicación y potencias con números enteros de hasta 5 dígitos.

## Cómo subir el repo a GitHub
1. Creas un repositorio público en GitHub (yo lo creé con README).
2. Te copias el enlace del repo y lo clonas en el ordenador con `git clone`.
3. Haces tus ramas y commits en local (`git add`, `git commit`).
4. Conectas el repositorio remoto si no viene ya (`git remote add origin ...`) y subes cada rama con `git push`.

## Comandos usados en orden

  1. Clonar el repositorio de GitHub a mi carpeta:\
    `git clone https://github.com/manuelaromero-dev/controlDeVersiones.git`
  
  2. Entrar dentro de la carpeta del proyecto:\
    `cd controlDeVersiones`
  
  3. Crear la rama backend y cambiarme a ella para meter el código en Java:\
    `git checkout -b backend`
  
Llegado a este punto, no me dejó y me salía el error:

```
"fatal: pathspec 'calculadora.java' did not match any files
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'manur@PC_YUKI.(none)')"
```

  Por lo que tuve que aplicar los siguientes comandos\

3.1. Ingresar mi usuario y mail de Git:
      `git config --global user.name manuela-romero-dev`
      `git config --global user.email manu.romero.004@gmail.com`
      
  4. Guardar los cambios de Calculadora.java y hacer commit:\
      `git add Calculadora.java`
      `git commit -m "añado calculadora en java"`
  
  5. Volver a main y crear la rama frontend para el html:\
      `git checkout main`
      `git checkout -b frontend`
  
  6. Guardar el index.html y hacer commit:\
      `git add index.html`
      `git commit -m "añado index.html"`
  
  7. Volver a main y hacer merge de las dos ramas:\
      `git checkout main`
      `git merge backend`
      `git merge frontend`
  
  8. Subir las ramas a GitHub:\
      `git push -u origin main`
      `git push -u origin backend`
      `git push -u origin frontend`
      
 9. Subir las ramas a GitHub:
   `git push -u origin main`
   `git push -u origin backend`
   `git push -u origin frontend`

10. Actualizar `README.md` en `main` con los comandos y subir el cambio:
    `git add README.md`
    `git commit -m "actualizo README con comandos en orden"`
    `git push origin main` 
