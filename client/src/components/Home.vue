<template>
  <div class="hello">
        <div>
          <b-navbar toggleable="md" type="dark" variant="info">
            <b-navbar-brand href="#">LOGIN</b-navbar-brand>
              <!-- Right aligned nav items -->
              <b-navbar-nav class="ml-auto">
                <b-nav-form>
                  <b-button size="sm" class="my-2 my-sm-0" router-link to="/login">LOGIN</b-button>&nbsp;
                  <b-button size="sm" class="my-2 my-sm-0" router-link to="/register">REGISTER</b-button>
                </b-nav-form>
              </b-navbar-nav>
          </b-navbar>
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
  name: "Home",
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
