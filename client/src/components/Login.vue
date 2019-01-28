<template>
  <div class="hello">
        <div>
            <b-container class="bv-example-row" bg-variant="light" text-variant="black">
                <b-row>
                    <b-col><br/>
                        <h4>Login</h4><br/>
                            <h6 class="text-left">Email or Telephone:</h6>
                        <b-form-input size="sm" type="text"></b-form-input><br/>
                            <h6 class="text-left">Password:</h6>
                        <b-form-input size="sm" type="text"></b-form-input><br/>
                        <b-button size="sm" variant="outline-success">LOGIN</b-button><br/><br/><br/><br/><br/>

                    </b-col>

                    <b-col><br/>
                        <h4>Google Map</h4><br/>
                        <b-button size="sm" class="my-2 my-sm-0" router-link to="/map">GOOGLE MAP</b-button><br/><br/>
                    </b-col>
                </b-row>
            </b-container>
        </div>
  </div>
</template>

<script>
export default {
    data () {
    return {
      text1: ''
    }
  },
  name: "Login",
  props: {
    msg: String
  }

};
</script>

<style scoped>
h1,
h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
