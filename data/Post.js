import React, { Component } from "react"
import axios from "axios"
// import {  Button} from 'antd';
import { Link } from 'react-router-dom';

class Data extends Component {
  constructor(props){
    super(props)
  
  this.state = {
    
    users: [],
  }
}

  componentDidMount() {
    axios.get('http://localhost:8013/publicdatadb/1').then(res =>{
      this.setState({users :res.data})
    })
  }
  

  render() {
    
    return (
     
        <table boreder="1">
        <thead>
          <tr align="center"> 
          <th>제공기관</th>
          <th>정보</th>
          <th>url</th>
          </tr>
     </thead>
     <tbody>
       
        {this.state.users.map (users =>
         <tr align="center" key={users.id}>
          <td> {users.location} </td>
           <td> <Link to="/post"> {users.category} </Link></td>
           <td>{users.url}</td>
           </tr> 
        )}
         </tbody>
         {/* <Button type="primary" 
    htmlType="submit" 
    size="large" 
    // disabled={this.isFormInvalid()}
    className="create-poll-form-button">Create Poll</Button> */}
        </table>
     
    );
    

  }
  
}


export default Data;