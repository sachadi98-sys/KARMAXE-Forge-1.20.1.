KARMAXE — instrucciones fáciles para generar el .jar sin instalar Java

1) Entra a https://github.com y crea/inicia sesión.
2) Crea un repositorio nuevo (New repository).
   Nombre sugerido: KARMAXE-Forge-1.20.1
   Puedes dejarlo Private.
3) Descomprime este ZIP en tu PC.
4) En la página del repositorio, pulsa "uploading an existing file".
5) Sube TODO el contenido de la carpeta, incluyendo la carpeta oculta .github.
   Importante: en GitHub debe verse build.gradle y la carpeta .github/workflows/build.yml.
   Si no aparece .github, crea esa ruta manualmente o activa mostrar archivos ocultos.
6) Pulsa "Commit changes".
7) Abre la pestaña "Actions".
8) Selecciona "Build KARMAXE Forge Mod" si aparece y pulsa "Run workflow".
   También puede iniciarse automáticamente al subir los archivos.
9) Espera a que el trabajo termine con un visto verde.
10) Abre la ejecución completada. Abajo, en Artifacts, descarga
    "KARMAXE-Forge-1.20.1".
11) Descomprime ese archivo y copia el .jar a:
    %appdata%\.minecraft\mods
12) Inicia Minecraft usando el perfil Forge 1.20.1.

SI FALLA
Abre Actions > la ejecución roja > Build mod y copia el error para pedir ayuda.
El primer build puede tardar mientras descarga Forge y sus dependencias.

AVISO
Este proyecto fuente aún necesita una compilación de prueba. No se garantiza que el
primer build funcione sin corregir posibles errores. El menú conceptual utiliza una
imagen de fondo con los botones dibujados; las zonas clicables están definidas en código.
