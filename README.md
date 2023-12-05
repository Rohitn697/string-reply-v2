# String Reply Service (AutoDesk Assignment)

The String Reply Service is a Spring Boot application that processes input strings based on rules and returns the result.

## Getting Started

### Prerequisites

- [Java](https://www.java.com/) (version 8 or higher)
- [Gradle](https://gradle.org/) (optional, as the project includes the Gradle Wrapper)

### Build and Run

```bash
./gradlew build
./gradlew bootRun

The service will be available at http://localhost:8080.
```

## Endpoints

### V1 Endpoint

#### `GET /reply/{message}`

**Example:**

```json
{
    "data": "helloworld"
}
```

### V2 Endpoint

#### `GET /v2/reply/11-helloworld`

**Example:**

```json
{
    "data": "helloworld"
}
```

#### `GET /v2/reply/1-helloworld`
**Example:**
```json
{
    "data": "dlrowolleh"
}
```

#### `GET /v2/reply/12-helloworld`

**Example:**
```json
{
    "data": "49afed3c7cf18693ac7f319cd01ffae4"
}
```

#### `GET /v2/reply/22-helloworld`
**Example:**
```json
{
    "data": "a11ee4c2150caf49670ad114b7fdc735"
}
```

## Testing

### Unit Tests

Run unit tests:

```bash
./gradlew test
```
