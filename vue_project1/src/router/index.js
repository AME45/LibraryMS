import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
    {path: '/manager', name: 'manager', component: () => import('@/views/ManagerLayout.vue'),
        children:[
            {path: 'home', component: () => import('@/views/manager/HomeView.vue')},
            {path: 'about', component: () => import('@/views/manager/AboutView.vue')},
            {path: 'admin', component: () => import('@/views/manager/AdminView.vue')},
        ]
    },

]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router