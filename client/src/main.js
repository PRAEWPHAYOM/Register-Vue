import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
import Home from './components/home.vue'
import Login from './components/login.vue'
import Register from './components/register.vue'
import Map from './components/map.vue'
import BootstrapVue from "bootstrap-vue"
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap-vue/dist/bootstrap-vue.css"
import * as VueGoogleMaps from "vue2-google-maps";
import { ButtonToolbar } from 'bootstrap-vue/es/components';
import { FormInput } from 'bootstrap-vue/es/components';
import { Card } from 'bootstrap-vue/es/components';
import { Layout } from 'bootstrap-vue/es/components';
import { Tabs } from 'bootstrap-vue/es/components';
import { Dropdown } from 'bootstrap-vue/es/components';
import { Collapse } from 'bootstrap-vue/es/components';
import { Nav } from 'bootstrap-vue/es/components';
import { Navbar } from 'bootstrap-vue/es/components';

Vue.use(BootstrapVue)
Vue.use(ButtonToolbar);
Vue.use(FormInput);
Vue.use(Card);
Vue.use(Layout);
Vue.use(Tabs);
Vue.use(Dropdown);
Vue.use(Collapse);
Vue.use(Nav);
Vue.use(Navbar);

Vue.use(VueRouter)
const router = new VueRouter({
  routes: [
        { path: '/login', component: Login },
        { path: '/register', component: Register },
        { path: '/map', component: Map },

  ]
})

Vue.use(VueGoogleMaps, {
  load: {
    key: "AIzaSyCZ1BCe4Q7YL1nCa_ovtet4Bjn52tT20T8",
    libraries: "places" // necessary for places input
  }
});

new Vue({
  router,
  el: '#app',
  render: h => h(App)
})
