# Similar Products API

Solución propuesta para la prueba técnica backend.

## Objetivo

Exponer el endpoint:

GET /product/{id}/similar

Devolviendo el detalle completo de los productos similares para un producto dado.

---

## Arquitectura

La solución se organiza en las siguientes capas:

### Controller

Responsable de exponer la API REST.

- ProductController

### Service

Responsable de la lógica de negocio.

- ISimilarProductService
- SimilarProductService

### Clients

Responsables de la comunicación con APIs externas.

- SimilarIdsClient
- ProductDetailClient

### Models

Representación de los datos de dominio.

- Product

### Exceptions

Gestión de errores específicos del dominio.

- ProductNotFoundException

### Configuration

Configuración de componentes compartidos.

- RestTemplateConfig

---

## Flujo

1. El cliente invoca:

GET /product/{id}/similar

2. ProductController delega en SimilarProductService.

3. SimilarIdsClient obtiene los identificadores similares.

4. ProductDetailClient obtiene el detalle de cada producto.

5. SimilarProductService compone la respuesta final.

6. El Controller devuelve la lista de productos similares.

---

## Estructura del proyecto

```text
backend/
│
├── pom.xml
├── README.md
├── .gitignore
│
└── src/
    │
    ├── main/
    │   │
    │   ├── java/
    │   │   └── com/
    │   │       └── company/
    │   │           └── similarproducts/
    │   │               ├── SimilarProductsApplication.java
    │   │
    │   │               ├── controller/
    │   │              



