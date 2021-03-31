<template>
  <div>
      <my-books />
      <router-link v-bind:to="{name:'NewBook'}">Add Book to Reading List</router-link>
  </div>
  
</template>

<script>
import MyBooks from '../components/ReadingList'
export default {
    
    components: {MyBooks}
}
</script>

<style>

</style>