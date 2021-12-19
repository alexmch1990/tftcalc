const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {


    constructor(props) {
        super(props);
        this.state = {tftchamps: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/getChamps'}).done(response => {
            this.setState({tftchamps: response.entity});
    });
    }

    render() {
        return (
            //<div>Hola! Esto es una prueba!!!!----</div>
            <TftChampList tftchamps={this.state.tftchamps} />
    )
    }
}
class TftChampList extends React.Component{
    render() {
        const champs = this.props.tftchamps.map(tftchamp => <TftChamp key={tftchamp.id} tftchamp={tftchamp}/>);

        return (
            <table>
                <tbody>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                </tr>
                {champs}
                </tbody>
            </table>
        )
    };
}
class TftChamp extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.tftchamp.id}</td>
                <td>{this.props.tftchamp.name}</td>
                <td>{this.props.tftchamp.cost}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)