import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/example/identifier'

        headers {
            header('Accept': 'application/json;charset=UTF-8')
        }
    }
    response {
        status 200
        body(["id": "identifier"])
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}