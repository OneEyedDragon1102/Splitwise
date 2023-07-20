require("dotenv").config();
const express = require('express');
const cors = require('cors')
const connection = require('./db.js')

const app = express()
connection()
// middleware
app.use(express.json())
app.use(cors())

const port = process.env.PORT || 4000
app.listen(port, (request, response) => {
    console.log(`running on port : ${port}...`);
})