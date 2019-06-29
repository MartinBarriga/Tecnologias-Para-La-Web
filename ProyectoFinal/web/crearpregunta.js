const {
  Button,
  Icon,
  Typography,
  Paper,
  withStyles,
} = window['material-ui'];

const styles = theme => ({
    
  root: {
    textAlign: 'center',
    paddingTop: theme.spacing.unit * 20,
  },
  icon: {
    margin: theme.spacing.unit,
    fontSize: 32,
  },
  main: {
    width: 'auto',
    display: 'block', // Fix IE 11 issue.
    marginLeft: theme.spacing.unit * 3,
    marginRight: theme.spacing.unit * 3,
    [theme.breakpoints.up(400 + theme.spacing.unit * 3 * 2)]: {
      width: 400,
      marginLeft: 'auto',
      marginRight: 'auto',
    },
  },
  paper: {
    marginTop: theme.spacing.unit * 8,
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    padding: `${theme.spacing.unit * 2}px ${theme.spacing.unit * 3}px ${theme.spacing.unit * 3}px`,
  },
  button: {
    margin: theme.spacing.unit,
  },
});
class Index extends React.Component {

  render() {
    const { classes } = this.props;
    return (
      <Paper className={classes.paper}>    
        <Typography component="h1" variant="h5">
          Crear una pregunta
        </Typography>
         <br/>
        <a href="hoLlenado.html">
            <Button variant="contained" color="primary" className={classes.button} size="large">
            Hot Object
            <Icon className={classes.icon}>view_module</Icon>
            </Button>
        </a>
        <br/>
        <a href="mcLlenado.html">
            <Button variant="contained" color="primary" className={classes.button} size="large">
            Multiple Choice
            <Icon className={classes.icon}>check_box</Icon>
            </Button>
        </a>
         <br/>
         <a href="tablapreguntas.html">
            <Button variant="contained" color="primary" className={classes.button} size="large">
            Regresar
            <Icon className={classes.icon}>arrow_back</Icon>
            </Button>
        </a>
      </Paper>
    );
  }
}
const Crearpregunta = withStyles(styles)(Index);
ReactDOM.render(<Crearpregunta />, document.getElementById('root'));