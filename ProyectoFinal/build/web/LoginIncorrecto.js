const {
  Button,
  colors,
  createMuiTheme,
  CssBaseline,
  Dialog,
  DialogActions,
  DialogContent,
  DialogContentText,
  DialogTitle,
  Icon,
  MuiThemeProvider,
  Typography,
  Paper,
  withStyles,
  main,
  Avatar,
  FormControl,
  InputLabel,
  Input,
  FormControlLabel,
  form,  
  Checkbox,
  Grid
} = window['material-ui'];

const styles = theme => ({
    
  root: {
    textAlign: 'center',
    paddingTop: theme.spacing.unit * 20,
  },
  icon: {
    marginRight: theme.spacing.unit,
  },
  main: {
    width: 'auto',
    display: 'block', // Fix IE 11 issue.
    marginLeft: theme.spacing.unit * 3,
    marginRight: theme.spacing.unit * 3,
    [theme.breakpoints.up(400 + theme.spacing.unit * 3 * 2)]: {
      width: 490,
      marginLeft: 'auto',
      marginRight: 'auto',
    },
  },
  paper: {
    marginTop: theme.spacing.unit * 8,
    display: 'flex',
    flexDirection: 'column',
    align:'center',
    alignItems: 'center',
    padding: `${theme.spacing.unit * 2}px ${theme.spacing.unit * 3}px ${theme.spacing.unit * 3}px`,
    
  },
  bigAvatar: {
    margin: theme.spacing.unit,
    backgroundColor: theme.palette.secondary.main,
     width: 40,
    height: 40,
    marginBottom: 40
    
  },

  submit: {
    marginTop: theme.spacing.unit * 7,
    marginBottom: theme.spacing.unit * 6,
  },  
});
class Indexx extends React.Component {
  constructor(props){
      super(props);
      this.state = {
          email : "",
          password : ""
      }
  }
  handleSubmit = event => {
      event.preventDefault;
      window.location.replace("http://localhost:8080/ProyectoFinal/inicio.html");
      
  }
  render() {
      
    const { email,password } = this.state;
    const { classes } = this.props;
    return (
      <main className={classes.main}>
        <CssBaseline />
       
      <Paper className={classes.paper}>
        <Avatar className={classes.bigAvatar}>
            <Icon  fontSize="large">cancel</Icon>
        </Avatar>
        
        <Typography component="h1" variant="h5">
          Usuario no registrado en el archivo xml
        </Typography>
        
          <Button
          
            type="submit"
            fullWidth
            variant="contained"
            color="primary"
            className={classes.submit}
            onClick={event => this.handleSubmit(event)}
            
          >
            Regresar al LogIn
          </Button>
       
      </Paper>
      
      </main>
    );
  }
}
const LoginIncorrecto = withStyles(styles)(Indexx);
ReactDOM.render(<LoginIncorrecto />, document.getElementById('root'));