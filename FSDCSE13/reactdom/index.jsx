const conatiner = document.getElementById('root');
const root = ReactDOM.createRoot(container);
const h2 = React.createElement('h2', { style: { color: 'red', background: 'black' } }, 'Welcome toreact')
const h1 = React.createElement('h1', {}, "ABES Engineering college");
const img = React.createElement('img', { src: '', style: { height: '200px', width: '200px', borderRadius: '50%' } });
const div = React.createElement('div', { style: { border: '2px solid red' } }, h1, h2, img);

root.render(div);