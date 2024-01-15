# graphql-springboot


sample postman request 
-------------------------

query{
    getCustomer(customerId:1){
        customerId
    }
}

query{
    getCustomer(customerId:1){
        customerId
        phoneNo
    }
}

query{
    getCustomer(customerId:1){
        customerId
        phoneNo
        address
        customerName
    }
}




mutation {
    createCustomer(customerRequestDTO: {
        customerName:"vishal",
        phoneNo:"7867898767",
        address:"pune"
    }){
        customerId
    }
}
