import React, {useEffect} from 'react';
import './App.css';
import { getHelloObject} from "./api/example.api";

function App() {

    useEffect(() => {
        getHelloObject().then(value => console.log(value))
    }, [])

  return (
    <div className="App">
    </div>
  );
}

export default App;
