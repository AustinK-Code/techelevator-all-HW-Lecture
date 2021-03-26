<template>
  <div class="book-container">      
      <book-card v-for="(BookCard, index) in allTheBooks"
      v-bind:book = "BookCard"
      v-bind:key="index"/>
    
  </div>
</template>

<script>
import BookCard from"./BookCard.vue"
export default {
    name: 'reading-list',
    components:{
      BookCard
    },
    computed: {
      allTheBooks(){return this.$store.state.books}
    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>