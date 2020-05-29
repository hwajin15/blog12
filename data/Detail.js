import React, {Component} from 'react';
import * as service from '../../util/Service';
import axios from 'axios';
 
class Detail extends Component {
 
     constructor(props) {
        super();
        // initializes component state
        this.state = {
            postId: '',

            seouldatadb: {
                location: 123,
                category:null
            }
        };
    }

    componentDidMount() {
        this.fetchPostInfo(1);
    }

    // showWarning = () => {
        
    //     this.setState({
    //         warningVisibility: true
    //     });
 
    //     // after 1.5 sec
 
    //     setTimeout(
    //         () => {
    //             this.setState({
    //                 warningVisibility: false
    //             });
    //         }, 1500
    //     );
    // }

    fetchPostInfo = async (postId) => {
        this.setState({
            fetching: true // requesting..
        });
 
        try {
            // wait for two promises
            // const info = await Promise.all([
            //     service.getPost(postId)
            // ]);
            const info = await axios.get(`http://localhost:8013/seouldatadb/1`);
            // console.log(info.data[0]);
            console.log(info);
 
            // Object destructuring Syntax,
            // takes out required values and create references to them
            // const {_location, _category } = info[0]; 
                                                
        
            this.setState({
                postId,
               seouldatadb: {
                    
                     
                },
              
            });
 
        } catch(e) {
            // if err, stop at this point
            this.setState({
                fetching: false
            });
            
            // this.showWarning();
        }
    }



 
    render() {
        const {postId, seouldatadb  } = this.state;
        
        return (
           
              
                <div>
                    postId={postId},
                    location={seouldatadb.location},
                    category={seouldatadb.category}
                 
                    </div>
                
            
        );
    }
 
}
 
export default Detail;