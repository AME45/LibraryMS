import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import App from './App.vue'
import '@/assets/manage.css'
import '@/assets/global.css'
import router from './router'


Vue.config.productionTip = false
Vue.use(ElementUI);
new Vue({
    router,
  render: h => h(App)
}).$mount('#app')

