
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import StoreItemManager from "./components/listers/StoreItemCards"
import StoreItemDetail from "./components/listers/StoreItemDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/stores/items',
                name: 'StoreItemManager',
                component: StoreItemManager
            },
            {
                path: '/stores/items/:id',
                name: 'StoreItemDetail',
                component: StoreItemDetail
            },



    ]
})
