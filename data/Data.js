import React, { Component } from "react"
import axios from "axios"
// import {  Button} from 'antd';

class Data extends Component {
  constructor(props){
    super(props)
  
  this.state = {
  
    
    users: [],
  }
}

  componentDidMount() {
    axios.get('http://localhost:8013/seouldatadb').then(res =>{
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
           <td> <a href={`/detail/${users.id}`}> {users.category}</a> </td>
           {/* <td><Link to={`{/detail/${users.id}`}> {users.category}</Link></td> */}
           <td><a href={`${users.url}`}>{users.url}</a></td>
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