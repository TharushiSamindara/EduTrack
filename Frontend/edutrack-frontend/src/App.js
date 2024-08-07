import './App.css';
import Login from './Pages/Login';

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routers>
          <Router path="/" element={<Login/>}/>
        </Routers>
      </BrowserRouter>
    </div>
  );
}

export default App;

